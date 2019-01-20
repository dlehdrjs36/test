package Nested_Lambda_26;

interface Printable {
	void print(String str); // public을 생략해도 인터페이스에서는 자동으로 public선언이 된다. 디폴트
}
interface Str {
	public String getString(String str);
}
interface Printable2 {
	public void print(Printable prn2);
}

public class Lambda_Ex1 {
	public static void main(String[] args) {
		
	Str str2 = (str) -> "응답"+str; // return 생략
	Printable printer = (String str) -> { System.out.println(str);};
	Printable2 prn = (prn2) -> { System.out.println(prn2);};
	
	
	for( int i = 0 ; i< 5 ; i++) {
		System.out.println("==================================");
		printer.print(str2.getString(String.valueOf(i)));
		System.out.println("==================================");
		prn.print((str) -> { System.out.println(str);});
		prn.print(printer);
	}
	
	
	}
}
