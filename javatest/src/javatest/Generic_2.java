package javatest;

/** 489p
 * 제네릭 기반으로 클래스 작성시 앞서 언급한 불편함과 문제점이 사라지는 것을 볼수 있다.
 * 
 * @author User
 *
 */
class Orange2 {
	@Override
	public String toString() {
		return "오렌지";
	}
}

class Apple2 {
	public String toString() {
		return "사과";
	}
}

class Box2<T> {
	// T는 타입 매개변수. 인스턴스 생성시에 결정된다.
	private T box;

	public Box2() {	}

	public Box2(T box) {
		this.box = box;
	}

	public T getBox2() {
		return box;
	}

	public void setBox2(T box) {
		this.box = box;
	}

}

public class Generic_2 {
	public static void main(String[] args) {

		Box2<Apple2> apbx = new Box2<Apple2>(new Apple2());
		Box2<Orange2> ogbx = new Box2<Orange2>(new Orange2());

		//1.컴파일 상에서 오류 표시
		//apbx.setBox2("사과");
		
		//2. 형변환 안해도 됨.
		Apple2 ap = apbx.getBox2();
		Orange2 og = ogbx.getBox2();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
