package collection;

import java.util.Arrays;
import java.util.List;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> students = Arrays.asList("keshav","Nakshu");
//		students.add("Kallu");
		students.forEach(n -> System.out.println(n));
		System.out.println(students);

	}

}
