package IOStream_32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BytesFileCopier {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("대상 파일: ");
		String src = sc1.nextLine();
		
		System.out.print("사본 이름: ");
		String dst = sc1.nextLine();
		
		try(InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst)){
			int data;
			while(true) {
				data = in.read(); // 파일로부터 1바이트를 읽는다.
				if ( data == -1)
					break;
				out.write(data); // 파일에 데이터를 쓴다.
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
