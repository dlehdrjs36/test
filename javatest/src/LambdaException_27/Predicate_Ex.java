package LambdaException_27;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Ex {

	public static int sum ( Predicate<Integer> p, List<Integer> list) {
		int i = 0;
		for (int t : list) { 
			if ( p.test(t) ) {
				i += t; // 언박싱
			}
		}	
		return i;
	}
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1,2,4,5,7,9,11,20);
		
		System.out.println(sum(t -> t%3 == 0, lst)); // 3의 배수 합
		System.out.println(sum(t -> t%3 != 0, lst)); // 3의 배수가 아닌 것들의 합
		
		
		
		
	}
}
