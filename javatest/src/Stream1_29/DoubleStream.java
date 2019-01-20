package Stream1_29;

import java.util.Arrays;

public class DoubleStream {

	public static void main(String[] args) {
		Double[] du = {1.1, 1.2, 1.4, 2.1, 3.2};
		
		Arrays.stream(du)
			  .map(n-> n.intValue() )
			  .forEach(System.out::println); 
		System.out.println();
		
		Arrays.stream(du,0,4)	// 인덱스 0부터 4이전 까지
			  .forEach(n-> System.out.println(n + "\t"));
		
	}
}
