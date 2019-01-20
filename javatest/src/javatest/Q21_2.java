package javatest;

/***
 * 제네릭 메소드의 정의와 전달인자의 제한
 * 508p
 * @author User
 *
 */
class Box3<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class Q21_2 {

	// swapBox 메소드 정의
	public static <T extends Number> void swapBox(Box3<T> box1, Box3<T> box2) {
		Box3<T> tempBox = new Box3<T>();
		//상자안에 담겨있는 객체를 꺼낸다.
		tempBox.set(box1.get());
		box1.set(box2.get());
		box2.set(tempBox.get());
	}
	public static void main(String[] args) {
		
		Box3<Integer> box1 = new Box3<>();
		box1.set(99);
		Box3<Integer> box2 = new Box3<>();
		box2.set(55);
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1,box2); // 정의해야 할 swapBox 메소드
		System.out.println(box1.get() + " & " + box2.get());
	}
}
