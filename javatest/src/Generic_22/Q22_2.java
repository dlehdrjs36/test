package Generic_22;

/***
 * <? extends T> 활용 예제
 * @author User
 *
 * @param <T>
 */
class Box2<T> {
	private T ob;
	public void set(T o) { ob = o; }
	public T get() { return ob;	}
}

public class Q22_2 {

	//기존 내용 ( 문제 수정전)
	//public static <T> boolean compBox(Box<T> box, T can) {
	
	//문제 수정 후, box에 can과 동일한 내용물이 들었는지 확인 ( 꺼내서 확인하는 기능만 생각했을 것임.)
	public static <T> boolean compBox(Box<? extends T> box, T can) {
		T bc = box.get();
		//문제 수정후 컴파일러가 set이 에러라고 발견해줌
		//box.set(can); // 프로그래머의 실수로 삽입된 문장, 때문에 내용물이 바뀐다. 컴파일러상에서 발견되지않는 오류
		return bc.equals(can);
	}
	public static void main(String[] args) {
		// 박스의 타입 매개변수가 Integer, String 두 종류이다. 둘다 허용하기위해서 제네릭 메소드의 정의를 사용.
		Box<Integer> box1 = new Box<>();
		box1.set(24);
		Box<String> box2 = new Box<>();
		box2.set("Poly");
		
		if(compBox(box1, 25)) 
			System.out.println("1 상자 안에 25 저장");
		else {
			box1.set(box1.get()+1);
			if(compBox(box1, 25)) 
				System.out.println("2 상자 안에 25 저장");
		}
		
		if(compBox(box2,"Moly"))
			System.out.println("상자 안에 Moly 저장");
		
		System.out.println(box1.get());
		System.out.println(box2.get());
	}
}
