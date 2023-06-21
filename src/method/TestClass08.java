package method;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass08 {
		//void : return 값이 없는 경우
	public void test1() {
		int num = 1;
		if(num == 1) {
			System.out.println("if 실행");
			return;		//메소드 종료하는 기능을 가짐
		}
		System.out.println("다음 문장들 실행");
	}
	
	public String test2(String s) {
		return null;
	}
	
	public int test3() {
		int num = 1;
		if(num == 1)	return 100;
		return 0;
	}
	
	public String test4() {
		int num = 1;
		if(num == 1)	return "aaa";
		return null;
	}
	
	public int[] test5() {
		int n1=100, n2=200;
		//retrun n1, n2; --> 2개 동시 반환 안됨
		int[] arr = {n1, n2};
		return arr;
	}
	
	public HashMap<String, String> test6(ArrayList<String> arr) {
		System.out.println("0 : "+arr.get(0));
		System.out.println("1 : "+arr.get(1));
		
		HashMap<String, String> map = new HashMap<>();
		map.put("키1", "값11");
		map.put("키2", "값22");

		return map;
	}
}
