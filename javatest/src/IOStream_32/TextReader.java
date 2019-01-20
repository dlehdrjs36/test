package IOStream_32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/***
 * 운영체제상에서 만든 텍스트 파일의 내용을 읽어서 출력하는 예제.
 * 지금사용하는 이클립스의 인코딩 방식은 utf-8. 한글 깨짐이 발생할 수 있다.
 * @author User
 *
 */
public class TextReader {
	public static void main(String[] args) {
		Scanner sc4 = new Scanner(System.in);
		System.out.println("읽을 파일: ");
		String src5 = sc4.nextLine();

		try ( Reader in = new FileReader(src5)) {
			int ch;
			while(true) {
				ch = in.read(); // 문자를 하나씩 읽는다.
				if ( ch == -1 ) break;
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
