package IOStream_32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedDataOutputStream {

	public static void BufferedDataInputStream() {
		try( DataInputStream in = new DataInputStream(new BufferedInputStream( new FileInputStream("databufferd.txt")))) {
			int num1 = in.readInt();
			double num2 = in.readDouble();
			
			System.out.println(num1);
			System.out.println(num2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		try( DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("databufferd.txt")))) {
			out.writeInt(200);
			out.writeDouble(3.333);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedDataInputStream();  
	}
}
