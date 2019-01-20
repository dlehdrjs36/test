package IOStream_32;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/***
 * 문자 스트림 전용의 필터 스트림  ( 버퍼 필터 스트림 )
 * - BufferedReader : 문자열 단위로 읽을 수 있다 !!
 * - BufferedWriter 
 * @author User
 *
 */
public class StringWriter {
	public static void StringReader() {
		try(BufferedReader br = new BufferedReader(new FileReader("String.txt"))) {
			String sttr;
			
			while(true) {
				sttr = br.readLine();
				if( sttr == null) 
					break;
				System.out.println(sttr);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
		String es = "Lift is long if you know how to use it.";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))) {
			bw.write(ks, 0, ks.length());
			bw.newLine(); // 개행 ( 줄 바꿈 )
			bw.write(es, 0, es.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringReader();
	}
}
