package Stream2_30;

import java.util.stream.Stream;

/***
 * 스트림의 연결
 * 스트림을 연결하여 하나의 스트림을 생성할 수 있다. 
 * concat 메소드
 * @author User
 *
 */
public class ConcateStringStream {
	public static void main(String[] args) {
		Stream<String> ss1 = Stream.of("Cake", "Milk");
		Stream<String> ss2 = Stream.of("Lemon", "Jelly");
		
		//스트림을 하나로 묶은 후 출력
		Stream.concat(ss1, ss2)
			  .forEach(s -> System.out.print(s +"\t"));
	}
}
