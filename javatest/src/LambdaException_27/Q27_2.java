package LambdaException_27;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/***
 * 아래의 코드에서 주석으로 표시된 내용의 출력을 보이도록 show 메소드의 몸체를 채워 보자.
 * @author User
 *
 */
public class Q27_2 {
	public static <T> void show(Predicate<T> p, List<T> lst) {
		//채워 넣을 부분
		for (T t : lst) {
			if( p.test(t) ) {
				System.out.print(t + "\t");
			}
		}
		System.out.println();
	
	}
	public static void main(String[] args) {
		List<Integer> lst1 = Arrays.asList(1, 3, 8, 10, 11);
		show( n -> n%2 != 0, lst1); // 홀수만 출력
		
		List<Double> lst2 = Arrays.asList(-1.2, 3.5, -2.4, 9.5);
		show( n -> n > 0.0, lst2);
	}
}
