package MethodReferences_28;

import java.util.function.BiFunction;

/***
 * 람다와 생성자 참조
 * 아래 예제가 잘 동작하도록 빈 문장 하나를 채워 넣자. 
 * 단 채워 넣을 문장은 BiFunction<T, U, R> 인터페이스를 기반으로 작성된 '람다 식'을 포함해야 한다.
 * @author User
 *
 */
class Box<T, U> {
	private T id;
	private U con;
	public Box(T i, U c) {
		id = i;
		con = c;
	}
	public void showIt() {
		System.out.println("ID: "+ id + ", "+ "Contents: " + con);
	}
}
//BoxMaker
public class Q28_2 {
	public static void main(String[] args) {
		//람다 식 작성.
		BiFunction<Integer, String, Box<Integer,String>> bf = ( in1, in2 ) -> new Box<Integer,String>(in1,in2);//채워 넣어야 할 문장, 참조변수 bf의 선언
		
		//메소드 참조 작성.
		bf = Box::new;
		Box<Integer, String> b1 = bf.apply(1,"Toy"); // 1과 "Toy" 저장된 상자 반환
		Box<Integer, String> b2 = bf.apply(2,"Robot"); // 2와 "Robot" 저장된 상자 반환
		b1.showIt();
		b2.showIt();
	}
}
