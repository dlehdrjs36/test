package Stream2_30;


import java.util.stream.Stream;

/***
 * 정렬
 * 스트림의 인스턴스는 compareTo 인터페이스를 구현하고 있어야 한다.
 * String에 구현된 compareTo의 기본형태는 사전편찬순으로 정렬되도록 구현되어있다. sorted()
 * Comparator<T>인터페이스의 compare 메소드 구현이 어떤 값을 반환해야 하는가?
 * int compare(T o1, T o2)
 * <ul><li> o1이 o2보다 크다면 양의 정수 반환</li>
 * 	   <li> o1이 o2보다 작다면 음의 정수 반환</li>
 * 	   <li> o1과 o2가 같다면 0 반환</li>
 * </ul>
 * @author User
 *
 */
public class InstSortedStream {

	public static void main(String[] args) {
		Stream.of("Box", "Apple", "Robot") //
			  .sorted()
			  .forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		Stream.of("Box", "Apple", "Rabbit")
			  .sorted((n1,n2) -> n1.length() - n2.length()) // 길이가 작은것 부터 정렬 ( 오름차순 )
			  .forEach(System.out::print);
		System.out.println();
			  
		
	}
}
