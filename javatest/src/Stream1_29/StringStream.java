package Stream1_29;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

/***
 * 배열에 저장된 데이터를 대상으로 스트림 생성
 * @author User
 *
 */
public class StringStream {

	public static void main(String[] args) {
		String[] names = {"YOON", "LEE", "PARK"};
/*		Stream<String> stm = Arrays.stream(names); // 스트림 생성

		//익명 클래스
		stm.forEach(new Consumer<String>() {
												public void accept(String t) {
													System.out.println(t);
												}
									 		}
				   );
		//람다 식
		stm.forEach(n->System.out.println(n)); 
		//메소드 참조
		stm.forEach(System.out::println);
		*/
		
		Arrays.stream(names)
			  .forEach(System.out::println);
	}

}
