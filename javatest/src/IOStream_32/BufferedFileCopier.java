package IOStream_32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
/***
 * 1바이트 단위로 파일을 복사한다. 속도가 느리다
 * @author User
 *
 */
public class BufferedFileCopier {

	public static void main(String[] args) {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("대상 파일: ");
		String src = sc3.nextLine();
		
		System.out.println("사본 이름: ");
		String dst = sc3.nextLine();
		
		try(InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst)){
			byte[] buf = new byte[1024];
			int len;
			
			while(true) {
				len = in.read(buf); // 배열 buf로 데이터를 읽어 들인다.
				if( len == -1) break;  
				out.write(buf, 0, len); // len 바이트만큼 데이터를 저장한다.
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
