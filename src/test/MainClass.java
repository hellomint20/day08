package test;

import com.care.test.MemberClass;

public class MainClass {
	public static void main(String[] args) {
		MemberClass mem = new MemberClass();
		mem.name = "홍길동";
		System.out.println("이름 : "+mem.name);
	}
}
