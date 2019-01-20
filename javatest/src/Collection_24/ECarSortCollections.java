package Collection_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*** 중요한 내용
 * 603p~
 * @author User
 *
 */
class Car2 implements Comparable<Car2> {
	protected int disp; // 배기량
	
	public Car2(int d) { disp = d; }
	
	@Override
	public String toString() {
		return "cc: " + disp;
	}
	@Override
	public int compareTo(Car2 p) {
		// TODO Auto-generated method stub
		return disp - p.disp;
	}
}

class ECar extends Car2 { // 전기 자동차를 표현한 클래스
	private int battery; // 배터리

	
	public ECar(int d, int battery) {
		super(d);
		this.battery = battery;
	}
	
	@Override
		public String toString() {
			return "cc: " + disp + ", ba: " + battery;
		}
}

public class ECarSortCollections {
	public static void main(String[] args) {
		List<ECar> list = new ArrayList<>();
		list.add(new ECar(1200, 99));
		list.add(new ECar(3000, 55));
		list.add(new ECar(1800, 87));
		Collections.sort(list); // 정렬
		
		for ( Iterator<ECar> itr = list.iterator() ; itr.hasNext();  ) {
			System.out.println(itr.next().toString() + '\t');
		}
	}
}
