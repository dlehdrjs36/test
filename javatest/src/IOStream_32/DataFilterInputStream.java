package IOStream_32;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
/***
 * 데이터를 저장한 순서대로 꺼내야 한다. 
 * @author User
 *
 */
public class DataFilterInputStream {

	public static void main(String[] args) {
		try( DataInputStream in = new DataInputStream(new FileInputStream("data.txt"))) {
		int num1 = in.readInt();
		double num2 = in.readDouble();
			
			System.out.println(num1);
			System.out.println(num2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
