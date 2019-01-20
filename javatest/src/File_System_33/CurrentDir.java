package File_System_33;

import java.nio.file.Path;
import java.nio.file.Paths;

/***
 * 현재 디렉토리의 정보를 출력하는 예제 ( 프로그램 실행중에 현재 어느 디렉토리에서 작업하는지에 대한 정보를 알 수 있다. ) 
 * 849p
 * @author User
 *
 */
public class CurrentDir {
	public static void main(String[] args) {
		
		Path cur = Paths.get(""); // 현재 디렉토리 정보가 담긴 인스턴스 생성
		String cdir;
		
		if(cur.isAbsolute()) // cur 인스턴스가 가지고 있는 경로정보가 절대경로인 경우.
			cdir = cur.toString();
		else
			cdir = cur.toAbsolutePath().toString(); // 상대경로 정보를 가지고 있다면 절대경로로 바꾸어서 출력하라.
		
		System.out.println("Current dir: " + cdir);
		
		
	}
}
