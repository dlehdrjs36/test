package Generic_22;
/**
 * 프로그래머의 실수가 컴파일 과정에서 발견될 수 있도록 매개변수 선언을 수정하자.
 * @author User
 *	1. set, get에 원하지 않는 기능이 동작한다. ( set에서 get 호출 가능. . . )
 *	2. addBox 부분에서 set, get의 사용이 컴파일러 상에서 발견되지 않는다.
 */
class Box<T> {
	private T ob;
	
	
	public void set(T ob) {
		this.ob = ob;
		// 1번 문제
		//Box<T> box = new Box<>();
		//box.get();
	}
	
	public T get() {
		//Box<T> bxt = new Box<>();
		//bxt.set(ob);
		return ob;
	}
}

public class Q22_1 {
	// 2번 문제
	//수정 전 부분 
	//public static void addBox(Box<Integer> b1, Box<Integer> b2, Box<Integer> b3) {
	//수정 후, 프로그래머의 실수가 컴파일러에서 발견된다.
	public static void addBox(Box<? extends Integer> b1, Box<? extends Integer> b2, Box<? super Integer> b3) {
		b3.set(b1.get() + b2.get()); //프로그래머의 실수가 있는 부분 ( b1과 b2는 가지고 올수만 있고 , b3는 넣을 수 만 있다. 하지만 이는 컴파일러 상에서 발견되지 않는다.)
	}
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(24);
		Box<Integer> box2 = new Box<>();
		box2.set(37);
		Box<Integer> result = new Box<>();
		result.set(0);
		addBox(box1, box2, result); // result에 24 + 37 의 결과 저장
		
		System.out.println(result.get()); // 61출력
	}
}
