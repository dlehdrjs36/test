package File_System_33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/***
 * 파일 및 디렉토리의 생성과 소멸
 * 851p
 * Files 클래스의 메소드들.
 * public static Path createFile(Path path, FileAttribute<?>...attrs) throws IOException
 * - 지정한 경로에 빈 파일 생성, 경로가 유효하지 않거나 파일이 존재하면 예외 발생
 * public static Path createDirectory(Path dir, FileAttribute<?>...attrs) throws IOException
 * - 지정한 경로에 디렉토리 생성, 경로가 유효하지 않으면 예외 발생
 * public static Path createFile(Path dir, FileAttribute<?>...attrs) throws IOException
 * - 지정한 경로의 모든 디렉토리 생성
 * 
 * 파일의 속성과 권한의 유형은 운영체제에 따라 차이가 있다.
 * FileAttribute<?>...attrs : 가변인자 (여러개의 속성,권한을 인자로 받기가능 )
 * 
 * 이번 예제에서는 속성과 권한을 명시하지 않고 기본 속성을 가진 파일, 디렉토리가 생성된다.
 * @author User
 *
 */
public class MakeFileAndDir {

	public static void main(String[] args) throws IOException {
		Path fp = Paths.get("D:\\EclipseWorkspace\\empty.txt");
		fp = Files.createFile(fp); // 파일 생성
		
		Path dp1 = Paths.get("D:\\EclipseWorkspace\\Empty");
		dp1 = Files.createDirectory(dp1); // 디렉토리 생성
		
		Path dp2 = Paths.get("D:\\EclipseWorkspace2\\Empty");
		dp2 = Files.createDirectories(dp2); // 경로의 모든 디렉토리 생성
		
		System.out.println("File :" + fp);
		System.out.println("Directory1 :" + dp1);
		System.out.println("Directory2 :" + dp2);
	}
}
