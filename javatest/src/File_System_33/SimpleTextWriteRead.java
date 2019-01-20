package File_System_33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/***
 * 855p
 * 간단한 문자 데이터를 입력 및 출력하는 메소드.
 * public static List<String> readAllLines(Path path) throws IOException
 * 
 * public static Path write(Path path, Iterable<? extends CharSequence> throws IOException
 * - 두 번째 매개변수 선언에 대한 의미
 * Iterable<E> 인터페이스를 Collection<E> 인터페이스가 상속한다.
 * CharSequence 인터페이스를 String 클래스가 구현한다.
 * 즉, 문자열을 저장한(String 인스턴스를 저장한) 컬렉션 인스턴스가 두 번째 매개변수의 인자로 올 수 있다는 의미.
 * @author User
 *
 */
public class SimpleTextWriteRead {
	public static void main(String[] args) throws IOException {
		Path fp = Paths.get("D:\\EclipseWorkspace\\simple.txt");
		String s1 = "One Simple String";
		String s2 = "Two Simple String";
		List<String> list = Arrays.asList(s1,s2);
		
		Files.write(fp, list); // 파일에 문자열 저장하기
		List<String> list2 = Files.readAllLines(fp); // 파일로부터 문자열 읽기
		System.out.println(list2); // toString을 이용해 문자형식으로 바뀌기 때문에 배열형식으로 출력. 
		/***
			public static String toString(Object[] a) {
		        if (a == null)
		            return "null";
		
		        int iMax = a.length - 1;
		        if (iMax == -1)
		            return "[]";
		
		        StringBuilder b = new StringBuilder();
		        b.append('[');
		        for (int i = 0; ; i++) {
		            b.append(String.valueOf(a[i]));
		            if (i == iMax)
		                return b.append(']').toString();
		            b.append(", ");
		        }
		    }
		 */
	}
}
