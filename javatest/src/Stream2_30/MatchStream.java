package Stream2_30;

import java.util.stream.IntStream;

/***
 * 최종 연산
 * allMatch : 모두 적용
 * anyMatch : 하나라도 있는가
 * noneMatch : 모두 적용X
 * @author User
 * 
 * 775p 예제 참고
 */
public class MatchStream {
	public static void main(String[] args) {
		
		boolean b = IntStream.of(3, 4, 9, 7, 5)
				 			 .allMatch( n-> n%2 == 0);
		System.out.println("모두 짝수 " + b);
		
				b = IntStream.of(3, 4, 9, 7, 5)
							 .anyMatch( n-> n%2 == 0);
		System.out.println("짝수 하나라도 있다 " + b);
				
				b = IntStream.of(3, 4, 9, 7, 5)
							 .noneMatch( n-> n%2 == 0);
		System.out.println("모두 짝수X " + b);
				 
	}

}
