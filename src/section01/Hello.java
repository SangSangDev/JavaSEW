package section01;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, JAVA");
		
		printNum(3);
	}
	
	public static void printNum(int num) {
		System.out.println("num: " + num);
	}
	
	public static void main2(String[] args) {
		//정수형 변수 선언하고 값 대입하기.
		int numInt = 10;
		//실수형 변수 선언하고 값 대입하기.
		double numDouble = 10.1;
		//문자열 변수 선언하고 값 대입하기.
		String str ="Hello";
		
		System.out.println(numInt);
		System.out.println(numDouble);
		System.out.println(str);
	}
}
