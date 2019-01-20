package javatest;

import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	//sort할때 수행됨. 우선순위 소트 
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		System.out.println(this + " " + this.age + " : " + p.age);
		
		//1. 나이 순으로 우선순위 결정
/*		if( this.age > p.age ) 
			return 1;
		else if ( this.age < p.age )
			return -1;
		else
			return 0;*/
		
		//2. 이름 길이순으로 우선순위 결정
		if( this.name.length() > p.name.length() ) 
			return 1;
		else if ( this.name.length() < p.name.length() )
			return -1;
		else
			return 0;
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class Q20_2 {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("LeeD", 29);
		ar[1] = new Person("GooSA", 15);
		ar[2] = new Person("SooDSA", 37);
		Arrays.sort(ar);
		System.out.println();
		for(Person p : ar) 
			System.out.println(p);
		
		
	}
}
