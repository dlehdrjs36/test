package Stream1_29;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/***
 * 리덕션 : 여러 개의 데이터를 조건에 맞추어 하나의 데이터로 만드는 것. 
 * 대표적인 메소드 sum
 * @author User
 *
 */
public class ReduceStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Box","Toy","Apple");
		
		BinaryOperator<String> bi = ( s1, s2 ) -> {
													if( s1.length() > s2.length())
														return s1;
													else 
														return s2;
												 };
				
					//	list.parallelStream(); 병렬 처리를 위한 스트림 생성 ( 병렬 스트림 ) 
		String result = list.stream()
							.reduce("",bi); // reduce의 첫 번째 인자는 스트림이 없을경우 반환된다. 
											// 다만 이 첫 번째인자도 스트림의 데이터로 인식되기 때문에 고려하여 사용하여야 한다.
		
		System.out.println(result);
	}
}
