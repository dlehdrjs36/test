package Stream2_30;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapStream {

	public static void main(String[] args) {
		Stream<String> stm1 = Stream.of("MY_AGE", "YOUR_LIFE");
		//아래 람다식에서 스트림을 생성
		//flatMap 1:多 관계
		
		//String의 split메소드 : 기준값으로 문자열을 쪼개고 배열형으로 반환함. 따라서 스트림 생성에 배열을 전달하여 스트림을 만드는 것처럼 사용가능.
		Stream<String> stm2 = stm1.flatMap( n-> Arrays.stream(n.split("_")) );
		stm2.forEach( n-> System.out.print(n +"\t"));
		System.out.println();
								  
	}
}
