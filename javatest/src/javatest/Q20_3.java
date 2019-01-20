package javatest;
//478p
import java.util.Arrays;

class Person2 implements Comparable {
	private String name;
	private int age;
	
	public Person2() {
		// TODO Auto-generated constructor stub
	}
	
	public Person2( String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2) o;
		//이름기준 탐색
		if( this.name.equals(p))
			return 0;
		else 
			return -1;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
public class Q20_3 {

	public static void main(String[] args) {
		Person2[] ar = new Person2[3];
		ar[0] = new Person2("LeeD", 29);
		ar[1] = new Person2("GooSA", 15);
		ar[2] = new Person2("SooDSA", 37);
		Arrays.sort(ar); // 탐색에 앞서 정렬을 진행
		int idx = Arrays.binarySearch(ar, new Person2("LeeD", 15 ));
		System.out.println(idx);
		
	}
}
