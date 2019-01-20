package File_System_33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/***
 * 857p
 * 파일 및 디렉토리의 복사와 이동
 * 
 * @author User
 *
 */
class File1 {
	public static void Copy() throws IOException {
		Path src = Paths.get("D:\\EclipseWorkspace\\simple.txt");
		Path dst = Paths.get("D:\\EclipseWorkspace\\simple2.txt");
		// src가 지시하는 파일을 dst가 지시하는 위치와 이름으로 복사, 파일이 이미 존재하면 새로운 파일로 덮어쓰기 옵션.
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
	}
	public static void Move() throws IOException {
		Path src = Paths.get("D:\\EclipseWorkspace\\Dir1");
		Path dst = Paths.get("D:\\EclipseWorkspace\\Dir2");
		// src가 지시하는 디렉토리를 dst가 지시하는 디렉토리로 이동 ( 이름 변경 )
		Files.move(src, dst, StandardCopyOption.REPLACE_EXISTING);
	}
}
public class FileFromFiles {
	
	public static void main(String[] args) throws IOException {
		File1.Copy();
		File1.Move();
	}
}
