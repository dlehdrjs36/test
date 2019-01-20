package Stream1_29;

import java.util.Arrays;
import java.util.List;

/***
 * 문자열 스트림을 다른 형태의 자료형으로 바꾸는 예제
 * @author User
 *
 *	문자열 길이가 3보다 큰 스트림을 대상으로 숫자스트림 형태로 바꾸어라.
 */

public class MapToInt {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy","Robot","Box","Apple");
		
		list.stream()
			.filter(n-> n.length() > 3)
			.peek( n-> System.out.print(n + "\t"))
			.mapToInt(n-> n.length()) // mapToInt를 사용함으로써 오토박싱이 일어나지 않는다.
			.forEach(n-> System.out.print(n + "\t"));
		
	}
}
