package javatest;

import java.util.HashSet;
import java.util.Objects;

/***
 * hashCode & equals 오버라이딩
 * 이름과 나이가 같으면 동일 인스턴스로 판단이 되도록 hashCode와 equals 메소드를 오버라이딩 해보자.
 * @author User
 *
 */

class Person3 {
	private String name;
	private int age;
	
	public Person3() {}

	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " (" + age+"세)";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	@Override
	public boolean equals(Object obj) {
		String n = ((Person3)obj).name;
		int a = ((Person3)obj).age;
	
		if(name.equals(n) && (age == a)) 
			return true;
		else
			return false;
	}
}
public class Q23_1 {

	public static void main(String[] args) {
		HashSet<Person3> set = new HashSet<>();
		set.add(new Person3("이동건", 26));
		set.add(new Person3("이동건", 25));
		set.add(new Person3("dlehdrjs", 26));
		set.add(new Person3("이동건",26));
		
		System.out.println("인스턴스 수: " + set.size());
		
		for (Person3 person : set) 
			System.out.println(person.toString() + '\t');
		
	}
}
