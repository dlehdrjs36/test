package File_System_33;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/***
 * 864p
 * NIO 기반의 입출력
 * 버퍼와 채널을 사용. 채널과 버퍼는 독립적이다. 채널을 사용하려면 반드시 버퍼와 연결되어 있어야 한다.
 * 채널은 이미 파일과 연결되어 있는 상태이며, 버퍼도 따로 독립적으로 존재해야 한다.
 * @author User
 * 파일 복사 예제
 */
public class NIO_IOStream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("대상 파일 : ");  // D:\EclipseWorkspace\javatest\src\File_System_33\NIO_IOStream.java
		Path src = Paths.get(sc.nextLine());
		System.out.println("사본 이름 : ");
		Path dst = Paths.get(sc.nextLine());
		
		// 하나의 버퍼 생성, 1024의 크기로 메모리에 할당
		ByteBuffer buf = ByteBuffer.allocate(1024); 
		
		// 두 개의 채널 생성, 읽기만 하는 채널, 쓰기만 하는 채널
		try( FileChannel ifc = FileChannel.open(src, StandardOpenOption.READ);
			 FileChannel ofc = FileChannel.open(dst, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			
			int num; 
			
			while(true) {
				num = ifc.read(buf); // 채널에서 파일로부터 읽어들인 데이터를 버퍼에 채운다.
				if(num == -1) // 읽어들인 데이터가 없다면?
					break;
				
				buf.flip(); // 버퍼의 상태를 쓰기상태로 변환하기위해서 사용. 포지션의 위치를 0으로 옮긴다.
				ofc.write(buf); // 포지션의 위치가 0, 버퍼의 처음부터 끝까지 채널로 데이터를 전송한다. 채널은 읽어들인 데이터만큼 파일에 전송.
				buf.clear(); // 버퍼를 비운다.
							
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
