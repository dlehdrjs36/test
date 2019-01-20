package javatest;

class Box4<T> {
	protected T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
}

class SteelBox<T> extends Box4<T> {
	
	public SteelBox(T o) {
		obj = o;
	}
}
public class Generic_3 {
	public static void main(String[] args) {
		Box4<Integer> iBox = new SteelBox<>(7959);
		Box4<String> sBox = new SteelBox<>("Simple");
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}
	
}
