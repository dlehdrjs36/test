package MethodReferences_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * 메소드 참조방식으로 바꾸어라.
 * @author User
 *
 */
public class Q28_1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("Lambda");
		list.add("box");
		//람다식의 형태를 메소드 참조 형식으로 바꾸기.
		//Collections.sort(list, (s1,s2)-> s1.compareToIgnoreCase(s2)); // [box, Lambda, robot]
		//Comparator 인터페이스 를 람다식으로 표현해놓은것을 메소드 참조로 바꾸어라. sort메소드는 스태틱이다.
		// 메소드 몸체(구현)부분에서 전달받은 첫번째 인자의 인스턴스 메소드 호출을 사용, 인스턴스 메소드 호출에 전달되는 인자가 전달받은 두 번째 인자 일때 메소드 참조가 가능하다.
		Collections.sort(list, String::compareToIgnoreCase); // [box, Lambda, robot]
		System.out.println(list);
	}
}
