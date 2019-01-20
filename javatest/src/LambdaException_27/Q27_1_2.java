package LambdaException_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Q27_1_2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");
		
		Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
		for (String string : list) {
			System.out.println(string);
		}
	}

}
