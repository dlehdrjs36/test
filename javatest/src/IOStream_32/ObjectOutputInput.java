package IOStream_32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/***
 * I/O 스트림 기반의 인스턴스 저장.
 * 인스턴스의 저장은 바이트 스트림을 통해서 이뤄진다. 
 * 바이트 기반의 기본 입출력 스트림에 다음 스트림을 연결하면 인스턴스를 통째로 입력하고 출력할 수 있다.
 * - ObjectInputStream
 * - ObjectOutputStream
 * 필터 스트림과 사용이 유사하지만 필터 스트림으로 구분하지는 않는다. 필터 스트림이 상속하는 필터 클래스를 상속하지 않기 때문이다.
 * 또 주의할 점은 입출력의 대상이 되는 인스턴스의 클래스는 java.io.Serializable을 구현해야 파일에 인스턴스를 저장할 수 있다.
 * @author User
 * 인스턴스를 저장하면 인스턴스 변수가 참조하는 인스턴스까지 함께 저장이 된다.
 */
class IBox implements java.io.Serializable  {
	transient String s; //transient 선언된 변수는 인스턴스가 저장되지 않는다. 그리고 복원(읽어)들였을 때 이 참조변수는 null로 초기화된다.
	int i;
	public IBox(String s,int i) { this.s = s; this.i = i; }
	public String get() { return s + " " + i; }
}
class SBox implements java.io.Serializable {
	String s;
	public SBox(String s) { this.s = s; }
	public String get() { return s; }
}
public class ObjectOutputInput {
                      
	public static void ObjectInput() {
		try( ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.bin"))) {
			SBox box1 = (SBox) in.readObject();
			System.out.println(box1.get());
			SBox box2 = (SBox) in.readObject();
			System.out.println(box2.get());
			IBox box3 = (IBox) in.readObject();
			System.out.println(box3.get());
			IBox box4 = (IBox) in.readObject();
			System.out.println(box4.get());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SBox box1 = new SBox("Robot");
		SBox box2 = new SBox("Apple");
		IBox box3 = new IBox("berry", 300);
		IBox box4 = new IBox("Graph", 2000);
		
		try( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.bin"))) {
			out.writeObject(box1);
			out.writeObject(box2);
			out.writeObject(box3);
			out.writeObject(box4);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectInput();
	}
}
