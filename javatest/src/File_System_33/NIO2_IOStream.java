package File_System_33;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/***
 * 859 ~ 860p
 * NIO.2 기반의 I/O 스트림 생성
 * 바이트 스트림의 생성
 * @author User
 *
 */
public class NIO2_IOStream {
	public static void DataFilterOutputStreamNewVer() {
		Path fp = Paths.get("D:\\EclipseWorkspace\\NIO2_IOStream.txt");
	
		try( DataOutputStream out = new DataOutputStream(Files.newOutputStream(fp))){ // new OutputStream("파일명")대신에 Files 클래스를 이용하여 출력 스트림 생성.
			out.writeInt(370);
			out.writeDouble(5.5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void DataFilterInputStreamNewVer() {
		Path fp = Paths.get("D:\\EclipseWorkspace\\NIO2_IOStream.txt");
		
		try( DataInputStream in = new DataInputStream(Files.newInputStream(fp))){ 
			int num1 = in.readInt();
			double num2 = in.readDouble();
			
			System.out.println(num1);
			System.out.println(num2);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DataFilterOutputStreamNewVer();
		DataFilterInputStreamNewVer();
	}
}
