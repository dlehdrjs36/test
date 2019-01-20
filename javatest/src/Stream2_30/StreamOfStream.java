package Stream2_30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/***
 * 스트림의 of 메소드를 사용하면 스트림 생성에 필요한 데이터를 인자로 전달할 수 있다. ( 컬렉션 인스턴스의 생성, 배열을 통한 스트림의 생성을 하지 않고도 스트림이 생성 가능하다는 뜻 )
 * 
 * Stream.of 메소드에 배열을 전달하는 경우
 * - Stream.of 메소드에 컬렉션 인스턴스를 전달하면 해당 인스턴스 하나로 이뤄진 스트림이 생성됨을 예제를 통해 보였다.
 * - 그런데 Stream.of 메소드에 배열을 전달하면 그때는 하나의 배열로 이뤄진 스트림이 생성되는 것이 아니라, 배열에 저장된 요소로 이뤄진 스트림이 생성된다.
 * @author User
 *
 */
public class StreamOfStream {

	public static void main(String[] args) {
		Stream.of(11, 22, 33, 44) // ex 1 : 스트림 생성과정에서 Integer형으로 오토 박싱이 진행
			  .forEach( n-> System.out.print(n +"\t"));
		System.out.println();
		
		Stream.of("So Simple") // ex 2
			  .forEach( n-> System.out.println(n +"\t"));
		System.out.println();
		
		List<String> list = Arrays.asList("Toy","Robot","Box");
		Stream.of(list) // ex 3 : 컬렉션 인스턴스 통째로 하나의 스트림이 되었다.
			  .forEach( n-> System.out.print(n));
		System.out.println();
		
		
		String[] ar = { "Toy", "Box", "Apple", "Robot" }; // ex 4 : 배열을 스트림 생성의 인자로 전달하는 경우
		Stream.of(ar)
			  .forEach( n-> System.out.print(n +"\t"));
		System.out.println();
		
			  
			  
	}
}
