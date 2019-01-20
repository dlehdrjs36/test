package javatest;
class Business implements Cloneable {
	
	private String company;
	private String work;
	
	public Business ( String company, String work ) {
		this.company = company;
		this.work = work;
	}
	public void showBusinessInfo() {
		System.out.println("회사: " + company);
		System.out.println("업무: " + work);
	}
	public void changeBusinessInfo(String company, String work) {
		this.company = company;
		this.work = work;
	}
	@Override
	protected Business clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Business)super.clone();
	}
}

class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Business bz;
	
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	
	public void showPersonalInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		bz.showBusinessInfo();
	}
	public void changePersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz.changeBusinessInfo(company, work);
	}
	@Override
	protected PersonalInfo clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PersonalInfo person = (PersonalInfo)(super.clone());
		person.bz = bz.clone();
		
		return person;
	}
}
	
public class Q19_2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		PersonalInfo p1 = new PersonalInfo("홍길동", 3, "커피", "영업");
		PersonalInfo p2 = p1.clone();
		p2.changePersonalInfo("이건", 19, "메스", "개발");
		p1.showPersonalInfo();
		p2.showPersonalInfo();
	}
}
