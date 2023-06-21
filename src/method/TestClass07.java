package method;

import java.util.Scanner;

//TestClass : 입력, 연산, 출력

public class TestClass07 {
	int num = 0, sum=0;
	public int inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		num  = sc.nextInt();
		return num;
	}
	
	public void printData(int num, int sum) {
		System.out.println("1 ~"+num+" 까지의 합 : " +sum);
	}
	
	public int operData(int num) {
		for(int i =1; i<=num; i++) {
			sum += i;
		}
		return sum;
	}
}
