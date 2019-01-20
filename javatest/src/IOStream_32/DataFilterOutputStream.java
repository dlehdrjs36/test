package IOStream_32;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFilterOutputStream {

	public static void main(String[] args) {
		try( DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"))){
		
			out.writeInt(370);
			out.writeDouble(3.14);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
