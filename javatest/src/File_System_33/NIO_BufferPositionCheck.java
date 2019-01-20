package File_System_33;

import java.nio.ByteBuffer;

/***
 * 870p
 * @author User
 * 버퍼의 포지션 체크.
 */
public class NIO_BufferPositionCheck {
	public static void main(String[] args) {
		ByteBuffer bf = ByteBuffer.allocate(1024); 
		
		System.out.println("Position : " + bf.position()); // 0
		bf.putInt(50); // position 4
		System.out.println("Position : " + bf.position());

		System.out.println("0~4 데이터 읽기 = " + bf.getInt() + ", Position : " + bf.position()); // 8
		bf.putDouble(5.5); // 16
		System.out.println("Position : " + bf.position());
		bf.putChar('A'); // 2바이트, 위치 18
		System.out.println("Position : " + bf.position());
	
		bf.flip(); // 0
		System.out.println("Position : " + bf.position());
		bf.putDouble(22.2); // 8
		System.out.println("Position : " + bf.position());
		
		System.out.println("8~16 데이터 읽기 = " + bf.getDouble() + ", Position : " + bf.position());
		
		System.out.println("16~18 데이터 읽기 = " + bf.getChar() + ", Position : " + bf.position());
		
		bf.flip();
		//System.out.println("0~4 데이터 읽기 = " + bf.getInt() + ", Position : " + bf.position()); // 0~4의 데이터(50)는 위에서 22.2로 덮어쓰기 되어서 사라짐.
		System.out.println("0~8 데이터 읽기 = " + bf.getDouble() + ", Position : " + bf.position());
		
		
		
	}
}
