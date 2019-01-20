package Stream1_29;

import java.util.Arrays;
import java.util.List;

public class FilterStream {

	public static void main(String[] args) {
		//배열기반 스트림 생성
		String[] ar = { "Robot", "Box", "Toy" };
		Arrays.stream(ar)
			  .filter( n-> n.length() < 5)
			  .forEach( n-> System.out.print(n + "\t"));
		System.out.println();
		//컬렉션 인스턴스기반 스트림 생성
		List<Integer> list = Arrays.asList(1,2,3,4,7,8,11,14);
		
		int sum = list.stream()
					  .filter( n-> n%2 ==1)	// 홀수만 필터 통과
					  .mapToInt( n-> n.intValue()) // Integer형을 Int형으로 변환 
					  .peek( n-> System.out.print(n + "\t")) //통과된 숫자를 중간연산으로 확인.
					  .sum();
		System.out.println();
		System.out.println(sum);
		
	}
}
