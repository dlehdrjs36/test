package IOStream_32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedStreamFileCopier {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("대상 파일: ");
		String src = sc2.nextLine();
		
		System.out.println("사본 이름: ");
		String dst = sc2.nextLine();
		
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {
		
			int data;
			
			while(true) {
				data = in.read();
				if (data == -1) break;
				out.write(data);
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
