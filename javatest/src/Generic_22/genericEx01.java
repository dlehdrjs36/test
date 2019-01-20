package Generic_22;

/**
 * wow<T>라는 동물원 클래스가 있다. 
 * 이 클래스는 동물을 넣고(set), 동물을 꺼낼 수 있는 (get) 메소드가 있다.
 * 동물을 넣고, 꺼내는 과정에서 실수하지 않게 화면상에 표시되도록 하자.
 * 
 * 동물은 Dog , Rion , Tiger, Cat 4마리가 존재한다.
 * 모든 동물은 Animal 인터페이스를 상속받는다. 
 *  interface Animal {
	default void print() { System.out.println("동물이다."); }
	}
 * 새로운 동물(Rabbit)이 동물원에 왔을 때, Rabbit은 Dog를 상속하도록하자. Rabbit을 동물로 인식되도록 하라.(Animal 인터페이스를 직접구현하지 않음)
 * 
 */
interface Animal<T> {
	void print();
}

class Dog implements Animal<Dog> {
	@Override
	public void print() {
		System.out.println("동물이다");
	}
	@Override
	public String toString() {
		return "개 ";
	}
}
class Rion implements Animal<Rion> {
	@Override
	public void print() {
		System.out.println("동물이다");
	}
	@Override
	public String toString() {
		return "사자 ";
	}
}
class Tiger implements Animal<Tiger> {
	@Override
	public void print() {
		System.out.println("동물이다");
	}
	@Override
	public String toString() {
		return "호랑이 ";
	}
}
class Cat implements Animal<Cat> {
	@Override
	public void print() {
		System.out.println("동물이다");
	}
	@Override
	public String toString() {
		return "고양이 ";
	}
}
// 새로온 동물 Rabbit은 동물인터페이스를 구현하지않고도 동물이라고 인식되어야함.
class Rabbit extends Dog {
	@Override
	public String toString() {
		return "토끼 ";
	}
}
class wow<T> {
	private T Animal;
	public void set(T Animal) {
		this.Animal = Animal;
	}
	public T get() {
		return Animal;
	}
}
class wowHandler {
	// 동물을 상속받는 것은 무조건 동물이다.
	public static <T extends Animal<? super T>> void outWow(wow<? extends T> a) {
		T t = a.get();
		System.out.print(t.getClass() + "(" + t + ")" + ": ");
		t.print();
	}
	public static <T extends Animal<? super T>> void inWow(wow<? super T> a, T n) {
		a.set(n);
	}
}
public class genericEx01 {
	
	public static void main(String[] args) {
		wow<Dog> dog = new wow<>();
		wow<Rion> rion = new wow<>();
		wow<Tiger> tiger = new wow<>();
		wow<Cat> cat = new wow<>();
		wow<Rabbit> rabbit = new wow<>();
		
/*		dog.set(new Dog());
		rion.set(new Rion());
		tiger.set(new Tiger());
		cat.set(new Cat());
		rabbit.set(new Rabbit());*/
		
		wowHandler.inWow(dog, new Dog());
		wowHandler.inWow(rion, new Rion());
		wowHandler.inWow(tiger, new Tiger());
		wowHandler.inWow(cat, new Cat());
		wowHandler.inWow(rabbit, new Rabbit());
		
		wowHandler.outWow(dog);
		wowHandler.outWow(rion);
		wowHandler.outWow(tiger);
		wowHandler.outWow(cat);
		wowHandler.outWow(rabbit);
	}
}
