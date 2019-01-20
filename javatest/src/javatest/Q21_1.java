package javatest;
/**
 * 496p
 * @author User
 *
 */

class DBox<L, R> {
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + " & "+ right;
	}
}

// 21-1-(1)
class DDBox<L, R> {
	private L lbox;
	private R rbox;
	
	public void set( L lbox, R rbox ) {
		this.lbox = lbox;
		this.rbox = rbox;	
	}

	@Override
	public String toString() {
		return lbox + "\n" + rbox;
	}
	
}
public class Q21_1 {

	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);
		
		// 21-1-(1)
		DDBox<DBox<String,Integer>,DBox<String,Integer>> ddbox = new DDBox<>();
		ddbox.set(box1,box2); // 두 개의 상자를 하나의 상자에 담음
		System.out.println("21-1-(1)");
		System.out.println(ddbox);
		
		// 21-1-(2)
		DBox<DBox<String,Integer>,DBox<String,Integer>> box3 = new DBox<>();
		box3.set(box1, box2);
		System.out.println();
		System.out.println("21-1-(2)");
		System.out.println(box3);
	}
}
