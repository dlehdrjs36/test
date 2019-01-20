package IOStream_32;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/***
 * 문자 출력 스트림 예제
 * @author User
 *
 */
public class SimpleWriter {
	public static void main(String[] args) {
		try( Writer out = new FileWriter("data.txt")) { //문자 출력 스트림 생성
			out.write('A'); // 문자 'A' 저장
			out.write('한'); // 문자 '한' 저장
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
