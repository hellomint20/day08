package method;

//MainClass : 기본 호출 및 연동

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		int n = t.inputData();
		int s = t.operData(n);
		t.printData(n, s);
	}
}
