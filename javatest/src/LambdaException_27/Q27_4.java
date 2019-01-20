package LambdaException_27;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/***
 * 인터페이스 BiConsumer<T, U>를 기반으로 위 클래스의 인스턴스에 
 * int형 double형 데이터를 저장하는 기능의 람다식을 각각 작성하고, 
 * 이를 확인하기 위한 예제를 작성해보자
 * @author User
 *
 * @param <T>
 */
class Box<T> {
	private T ob;
	public void set(T o) { ob = o;}
	public T get() { return ob; }
	public Box() {};

	// 약속 3 : 생성자 참조, 전달받은 인자가 그대로 인스턴스 생성 및 참조 값의 반환으로 사용될 떄 
	public Box(T o, T o2 ) {
		System.out.println("메소드 참조를 하기위해서 임의로 작성");
	}
}

public class Q27_4 {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		Box<Double> box2 = new Box<>();
		/***
		 * 익명클래스 -> 람다 표현식 -> 메소드 참조
		 */
		//익명 클래스
		BiConsumer<Integer, Double> Bicon = new BiConsumer<Integer, Double>() {
																					@Override
																					public void accept(Integer t, Double u) {
																						box1.set(t); 
																						box2.set(u);
																						
																					}
																				};
		Bicon.accept(5, 22.8);
		System.out.println(Bicon);
		System.out.println("BiConsumer : " + box1.get() +"\t" + box2.get());
		//람다 표현식
		Bicon = (t, u) -> { /*System.out.println("BiConsumer : " + t +"\t" + u);*/
														box1.set(t); 
														box2.set(u);
						  };
		System.out.println(Bicon);	
		System.out.println("BiConsumer : " + box1.get() +"\t" + box2.get());
					  
		//메소드 참조
		Bicon = Box::new;	// 박스안에 하나의 박스가 더 들어있다.
		System.out.println(Bicon);
		System.out.println("BiConsumer : " + box1.get() +"\t" + box2.get());
		
		System.out.println();
		/***
		 *  익명클래스 -> 람다 표현식 -> 메소드 참조 순으로 코드가 간결해진다.
		 */
		//con의 인스턴스는 모두 다르다. 
		//익명 클래스
		Consumer<Integer> con = new Consumer<Integer>() {
													@Override
													public void accept(Integer t) {
														box1.set(t);													
													}
												};
		con.accept(12);
		System.out.println(con);
		System.out.println("Consumer : " + box1.get());
		//람다 표현식
		con = t -> box1.set(t);
		con.accept(32);
		System.out.println(con);
		System.out.println("Consumer : " + box1.get());
		//메소드 참조, 약속2 : 인스턴스가 있는 메소드 참조
		con = box1::set;
		System.out.println(con);
		System.out.println("Consumer : " + box1.get());
		
		
		
		System.out.println("box1 인스턴스 : " + box1.get() + "\t box2 인스턴스 : " + box2.get());

		
	}
}
