package File_System_33;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/***
 * 861 ~ 862p 
 * 문자 스트림 : 문자셋을 해당 운영체제로 알맞게 변환하여 파일에 저장한다. 문자열 단위로 파일에 입,출력 할 수 있다.
 * @author User
 *
 */
public class NIO2_IOStream2 {
	public static void StringWriterNewVer() {
		Path fp = Paths.get("D:\\EclipseWorkspace\\NIO2_IOStream_String.txt");
		String k = " 안녕하세요 ";
		String e = " Hellow ";
		
		try( BufferedWriter wr = Files.newBufferedWriter(fp)) {
			wr.write(k);
			wr.newLine(); // 문자 스트림에서 버퍼 필터를 사용한다면, 문자열 단위로 데이터를 주고 받을 수 있다. ( 개행 표시사용 가능 )
			wr.write(e);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void StringReaderNewVer() {
		Path fp = Paths.get("D:\\EclipseWorkspace\\NIO2_IOStream_String.txt");
		
		try( BufferedReader rd = Files.newBufferedReader(fp)) {
			String k = rd.readLine();
			String e = rd.readLine();
			
			System.out.println(k);
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		StringWriterNewVer();
		StringReaderNewVer();
	
	}
}
