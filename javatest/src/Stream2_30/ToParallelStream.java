package Stream2_30;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/***
 * 이미 스트림을 생성한 상태에서 이를 기반으로 병렬 스트림을 생성하기를 원한다면 Stream의 parallel 메소드를 호출하면 된다.
 * @author User
 *
 */
public class ToParallelStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Box","Simple","Complex","Robot");
		Stream<String> ss = list.stream();
		
		BinaryOperator<String> bi = (s1, s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		
		String str = ss.parallel()
					   .reduce("", bi);
		System.out.println(str);
					   
	}
}
