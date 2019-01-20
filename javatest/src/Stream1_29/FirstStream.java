package Stream1_29;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStream {

	public static void main(String[] args) {
		//Integer[] ar = {1, 2, 3, 4, 5};
		//Stream<Integer> st = Arrays.stream(ar);
		int[] ar = {1, 2, 3, 4, 5};
		/***
		 * 학습용 코드
		 */
		/*IntStream stm1 = Arrays.stream(ar); // 배열 ar로부터 스트림 생성
		IntStream stm2 = stm1.filter(n-> n%2==1); // 홀수인 경우에만 통과시킨다. ( 중간연산 )
		int sum = stm2.sum(); // 덧셈 ( 최종연산 )
		System.out.println(sum);*/
		
		/***
		 * 실용 코드
		 */
		int sum = Arrays.stream(ar)
				  		.filter(n-> n%2==0 ) // 짝수인 경우 통과
				  		.peek( // n-> System.out.print(n + "\t") 람다 식
				  				  System.out::println // 메소드 참조
				  				)
				  		.sum();
		System.out.println("-------------\nsum : " + sum);
	}

}
