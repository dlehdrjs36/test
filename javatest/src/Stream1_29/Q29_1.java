package Stream1_29;

import java.util.Arrays;
import java.util.List;

/***
 * 문자열이 담긴 상자를 담고 있는 컬렉션 인스턴스를 생성했다.
 * 이 인스턴스를 이용하여 스트림을 생성하고, 이 스트림을 기반으로 문자열 스트림을 생성하는 맵핑 연산을 진행해보자
 * 그리고 그 결과를 forEach 연산을 통해 출력해보자
 * @author User
 *
 * @param <T>
 */
class Box<T> {
	private T ob;
	public Box(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	
}
public class Q29_1 {

	public static void main(String[] args) {
		List<Box<String>> list = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
		
		list.stream()
		//	.map( (s)-> s.get().length() < 6 )
			.map( s-> s.get() ) // Robot, Simple ( 자료형을 Box에서 꺼낸 String 형으로 변환 )
		//	.map( (s)-> s.get().length() ) // 5, 6 ( 문자열이 숫자형으로 변환된 것. )
			.forEach( System.out::println );
		
	}
}
