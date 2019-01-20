package LambdaException_27;

/***
 * 아래 코드에서 주석에 명시된 연산의 결과를 출력하기 위한 calAndShow 메소드의 호출문을 람다식을 기반으로 작성해보자.
 * @author User
 *
 * @param <T>
 */
interface Calculator<T> {
	T cal(T a, T b);
}
public class Q27_1 {
	public static <T> void calAndShow(Calculator<T> op, T n1, T n2) {
		T r = op.cal(n1, n2);
		System.out.println(r);
	}
	public static void main(String[] args) {
		Calculator<Integer> cal = ( a, b ) -> a+b;
		calAndShow(cal, 3, 4);// 3 + 4
		Calculator<Double> cal2 = ( a, b) -> a+b;
		calAndShow(cal2, 2.5, 7.1);// 2.5 + 7.1
		calAndShow(cal, 4, -2);// 4 - 2
		calAndShow(cal2, 4.9, -3.2);// 4.9 - 3.2
	}
}
