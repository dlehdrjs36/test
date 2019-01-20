package Stream2_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/***
 * collect 메소드 사용 
 * 776p
 * @author User
 *
 */
public class CollectStringStream {

	public static void main(String[] args) {
		String[] word = { "Hello", "Box", "Robot", "Toy" };
		Stream<String> stm = Arrays.stream(word);
		
		List<String> ls = stm.filter( n-> n.length() < 5)
							 .collect( () -> new ArrayList<>(), // 저장소 생산
									   (c,s) -> c.add(s),		// c는 첫번째 인자로 생성된 컬렉션 인스턴스를 의미, s는 스트림을 이루는 데이터들.
									   (lst1,lst2) -> lst1.addAll(lst2)); // 병렬 스트림을 병합하는 과정. 하나로 합쳐서 결과가 나오게 한다. 순차스트림에서는 사용되지 않지만 인자를 넣지않으면 NullPointerException이 발생해서 넣어주어야 한다.
		System.out.println(ls);
	}
}
