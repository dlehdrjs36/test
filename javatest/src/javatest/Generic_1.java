package javatest;

class Orange {
	@Override
	public String toString() {
		return "오렌지";
	}
}

class Apple {
	public String toString() {
		return "사과";
	}
}

class Box {
	private Object box;

	public Object getBox() {
		return box;
	}
	public void setBox(Object box) {
		this.box = box;
	}	
}
/**
 * 제네릭 이전 코드의 문제점, 불편함
 * - 형변환이 필요
 * - 프로그래머가 실수를 해도 그 실수가 드러나지 않을 수 있다.
 * == 컴파일 과정에서 실수(문제점)이 드러나지 않는다.
 * @author User
 *
 */
public class Generic_1 {

	public static void main(String[] args) {
		
		Box a = new Box();
		Box o = new Box();
		
/*		a.setBox(new Apple());
		o.setBox(new Orange());
		Apple ap = (Apple)a.getBox();  - 제네릭 이전 코드 형변환이 필요. ( Object형이기 때문에 저장된 인스턴스를 꺼낼 때에는 인스턴스에 맞는 형 변환을 해야한다. ) 
		Orange og = (Orange)o.getBox();
		
		System.out.println(ap);
		System.out.println(og);*/

		/**
		 *  실수가 컴파일 과정에서 나타나지 않는다.
		 */
		a.setBox("사과"); // 사과 객체를 넣지않고 문자열을 넣었음. - 실수
		o.setBox("오렌지");
		
		System.out.println(a.getBox()); // 실수인줄 모르고 그대로 사용
		System.out.println(o.getBox());
		
	}
}
