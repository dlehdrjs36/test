package Collection_23;

import java.util.Comparator;
import java.util.TreeSet;

class Person4 implements Comparable<Person4> {
	String name;
	int age;
	
	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	@Override
	public int compareTo(Person4 p) {
		return this.age - p.age;
	}
}

class PersonComparator implements Comparator<Person4> {
	public int compare(Person4 p1, Person4 p2) {
		return p2.age - p1.age; // 나이가 많은 사람을 앞에 세우는 연산
	}
}

public class ComparatorPerson {
	public static void main(String[] args) {
		TreeSet<Person4> tree = new TreeSet<>(new PersonComparator());
		tree.add(new Person4("YOON", 37));
		tree.add(new Person4("HONG", 53));
		tree.add(new Person4("PARK", 22));
		
		for (Person4 person4 : tree) 
			System.out.println(person4);
			
	}
}
