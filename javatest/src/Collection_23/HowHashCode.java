package Collection_23;

import java.util.HashSet;

/*** 570p
 * 둘 이상의 값을 지니는 클래스의 경우의 hashCode 메소드의 정의.
 * 인스턴스가 지니는 모든 값이 동일할 때, 동일 인스턴스로 간주하게 한다.
 * 
 * String 클래스의 hasCode와 equals 메소드는 내용 비교를 하도록 적절히 오버라이딩이 되어 있다.
 * 때문에 (model.hashCode() + color.hashCode()) / 2; 의 방법을 고려할 수 있다.
 * 
 * @author User
 *
 */

class Car {
	private String model;
	private String color;
	
	public Car() {}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return model + " : " + color;
	}

	@Override
	public int hashCode() {
		return (model.hashCode() + color.hashCode()) / 2;
	}

	@Override
	public boolean equals(Object obj) {
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		
		if(model.equals(m) && color.equals(c))
			return true;
		else
			return false;
	}
	
	
}
public class HowHashCode {

	public static void main(String[] args) {
		HashSet<Car> set = new HashSet<>();
		set.add(new Car("HY_MD_301", "RED"));
		set.add(new Car("HY_MD_301", "BLACK"));
		set.add(new Car("HY_MD_302", "RED"));
		set.add(new Car("HY_MD_302", "WHITE"));
		set.add(new Car("HY_MD_301", "BLACK"));
		System.out.println("인스턴스 수: " + set.size());
		
		for (Car car : set) {
			System.out.println(car.toString() + " : " + car.hashCode());
		}
	}
}
