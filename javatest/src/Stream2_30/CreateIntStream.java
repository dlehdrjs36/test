package Stream2_30;

import java.util.stream.IntStream;

public class CreateIntStream {

	public static void showIntStream(IntStream is) { // 중간연산을 한 스트림을 전달받아 그 결과를 출력해주는 메소드
		is.forEach( n-> System.out.print( n+ "\t")); // 최종연산.
		System.out.println();
	}
	public static void main(String[] args) {
		IntStream is3 = IntStream.of(7,5,3,2); // 인자로 전달한 값을 스트림으로 생성
		showIntStream(is3);
		
		IntStream is4 = IntStream.range(5, 8); // 숫자 5부터 8 이전까지 스트림으로 생성
		showIntStream(is4);
		
		IntStream is5 = IntStream.rangeClosed(5, 8); // 숫자 5부터 8 이전까지 스트림으로 생성\
		showIntStream(is5);
	}
}
