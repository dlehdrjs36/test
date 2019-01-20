package Stream2_30;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/***
 * IntStream, LongStream, DoubleStream의 sorted 메소드에 대해서 결과를 통해 이해하자
 * @author User
 * 루핑 : 스트림을 이루는 모든 데이터 각각을 대상으로 특정 연산을 진행하는 행위를 의미한다.
 * 		대표적 forEach 그러나 이는 최종연산. 
 * 중간연산에서 루핑을 위한 메소드 : peek 메소드
 */
public class PrimitiveSortedStream {

	public static void main(String[] args) {
		IntStream.of( 7, 4, 6, 9)
				 .sorted()
				 .forEach( n-> System.out.print(n + "\t"));
		System.out.println();
		
		DoubleStream.of( 8.3, 7.9, 9.9, 2.4)
					.sorted()
					.forEach( n-> System.out.print(n + "\t"));
		System.out.println();			
	}
}
