package Collection_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/***
 * 558p
 * @author User
 *
 */
public class AsListCollection {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box"); // 인스턴스 삭제, 수정 불가능. 참조만 가능
		
		list = new ArrayList<>(list); // 인스턴스 복제.(list를 인자로 전달받아서 list과 같은 ArrayList를 생성한후 반환한다.)
		
		// for문 기반의 반복자 획득과 순차적 참조
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) 
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		// "Box"를 모두 삭제하기 위한 반복문 , 반복자(Iterator)는 원하는 위치로 설정할 수 없으므로 새로 생성하여 처음부터 진행 되도록 한다.
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			if(itr.next().equals("Box"))
				itr.remove();
		}
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) 
			System.out.print(itr.next() + '\t');
		System.out.println();
		
	}
}
