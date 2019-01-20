package IOStream_32;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Write7ToFile {

	public static void main(String[] args) throws IOException {
		//자바 프로그램을 기준으로 out 발생, 저장 ㅑㅑㅡ   ㅡㅑ     작업 (쓰기)
		OutputStream out = new FileOutputStream("date.dat"); 
		out.write(7);
		out.close();
		
		//자바 프로그램을 기준으로 in 발생, 읽기작업 (읽기)
		try( InputStream in = new FileInputStream("date.dat")){
			int i = in.read();        
			while(true) {
				if( i == -1)
					break;
				System.out.println(i);
			}
			
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace()); 
		}
	}
}
