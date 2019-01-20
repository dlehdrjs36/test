package File_System_33;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/***
 * 파일 랜덤 접근
 * 868p
 * 채널은 양방향 이동이 가능, IO 스트림은 양방향 이동이 불가능 ( 방향이 정해져있음 )
 * @author User
 * 채널에 버퍼의 데이터를 전달할 때 버퍼와 채널의 포지션은 같이 이동된다.
 */
public class NIO_IOStream2 {
	public static void main(String[] args) {
		Path fp = Paths.get("copy.txt");
		
		//버퍼 생성
		ByteBuffer buff = ByteBuffer.allocate(1024);
		
		//버퍼에 데이터 저장
		buff.putInt(120);
		buff.putInt(240);
		buff.putDouble(0.94);
		buff.putDouble(0.75);
		
		//하나의 채널 생성
		try( FileChannel fc = FileChannel.open(fp, StandardOpenOption.CREATE,
													StandardOpenOption.READ,
													StandardOpenOption.WRITE)) {
			//파일에 쓰기
			buff.flip(); //이전까지 데이터를 넣었다. 포지션의 위치가 4, 8, 16, 24 로 변화했다. 현재 포지션의 위치는 24. 파일에 쓰기위해서 포지션을 0으로 바꿔줄 필요가 있다.
			fc.write(buff); // buff의 포지션, fc의 포지션이 24로 변화함. 버퍼의 처음부터 끝까지 채널로 데이터를 전송. 채널은 파일로 데이터를 전달한다. 
	
			//파일로부터 읽기
			ByteBuffer rb = ByteBuffer.allocate(1024); // 버퍼 생성
			//채널은 현재 파일로 데이터를 전송했다. 즉 채널이 가리키는 파일의 포지션은 24에 위치해 있다. 채널(파일)의 포지션을 0으로 바꾸고 읽기를 수행해야한다.
			fc.position(0); // buff의 포지션 24, fc의 포지션 0으로 만듬
			fc.read(rb); // 채널을 통해서 파일을 처음부터 읽는다. rb와 fc의 포지션은 24로 위치.
			
			//이하 버퍼로부터 데이터 읽기
			rb.flip(); // 버퍼와 채널의 포지션이 24에 위치해있다. 버퍼의 포지션을 0으로 위치시킨다면 처음에 저장한 120을 읽을 수 있다.
			System.out.println(rb.getInt()); // 버퍼의 0~4 까지 데이터 읽음
			rb.position(Integer.BYTES * 2 ); // 버퍼의 포지션을 8로 이동시킨다. int는 4바이트 
			System.out.println(rb.getDouble()); // 8부터 16까지 데이터 읽음, 0.94
			System.out.println(rb.getDouble()); // 16부터 24까지 데이터 읽음, 0.75
			
			rb.position(Integer.BYTES); // 버퍼의 포지션을 4로 이동
			System.out.println(rb.getInt()); // 4부터 8까지 데이터를 읽음, 240
			
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
