package Stream1_29;

import java.util.Arrays;
import java.util.List;

/***
 * 컬렉션 인스턴스 스트림
 * @author User
 *
 */
public class ListStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Robot", "Toy", "Box");
		
		list.stream()
			.forEach( n-> System.out.print(n + "\t"));
	}
}
