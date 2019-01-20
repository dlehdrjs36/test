package File_System_33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/***
 * 852p
 * 파일을 대상으로 하는 간단한 입력 및 출력
 * 간단한 파일 입/출력을 할 경우, I/O 스트림을 기반으로 입/출력 대신에 이 방법을 사용하는것이 간편하다.
 * @author User
 *
 */
public class SimpleBinWriteRead {

	public static void main(String[] args) throws IOException {
		Path fp = Paths.get("D:\\EclipseWorkspace\\simple.bin");
		
		//파일 생성, 파일이 존재하면 예외 발생
		fp = Files.createFile(fp);
		
		byte buf1[] = { 0x13, 0x14, 0x15 }; // 파일에 쓸 데이터
		for(byte b : buf1) // 저장할 데이터의 출력을 위한 반복문
			System.out.print(b + "\t");
		System.out.println();
		
		//파일에 데이터 쓰기
		//파일의 열고, 닫기를 자동으로 해준다. write 메소드 호출시 아무 옵션도 전달하지 않으면 
		//CREATE, TRUNCATE_EXISTING 옵션과 WRITE 옵션이 지정된 것과 같이 동작한다.
		Files.write(fp, buf1, StandardOpenOption.APPEND); //fp가 지시하는 파일에 buf1의 내용이 전부 쓰기된다.
		
		//파일로부터 데이터 읽기
		byte buf2[] = Files.readAllBytes(fp);
		
		for (byte b : buf2) {
			System.out.print(b + "\t");
		}
		System.out.println();
		
	}
}
