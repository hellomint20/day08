package method;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass08 {
	public static void main(String[] args) {
		TestClass08 t = new TestClass08();
		t.test1();
		String s = t.test2("aa");
		int[] a  =t.test5();
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		ArrayList<String> ar = new ArrayList<>();
		ar.add("안녕"); ar.add("잘가");
		HashMap<String, String> m =t.test6(ar);
		System.out.println(m);
	}
}
