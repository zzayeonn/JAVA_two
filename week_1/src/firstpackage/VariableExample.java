package firstpackage; // package > class

public class VariableExample { // class

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub

		System.out.println("Hello World!"); // 콘솔창에 출력하는 법 
		
		// 정수형 
		byte a = 1; // 1byte
		short b = 2; // 2byte
		int c = 4; // 4byte
		long d = 8L; // 8byte
		
		System.out.println(a); 
		System.out.println(b);
		System.out.println(c); 
		System.out.println(d);
		
		// 실수형 
		float e = 4.0f; // 4byte
		double f = 8.0; // 8byte
		
		System.out.println(e); 
		System.out.println(f);
		
		// 문자형 
		String g = "J", h = "A", i = "V"; // 2byte, 문자 
		String j = "JAVA"; // 문자열 
		
		System.out.println(g + h + i + h);
		System.out.println("프로그래밍 언어 이름 : " + j);
		
		// 논리 자료형 
		boolean k = true; // 1byte (true & false 만 사용 가능)
		
		// 형 변환 (자동타입변환) 
		int l = 100; // int형이 float형보다 작기 때문에 자동 변환되어 저장 
		float m = l;
		
		System.out.println(m); 

		// 형 변환 (강제타입변환 = 캐스팅)
		int n = 128; // int형이 byte형보다 크기 떄문에 강제 변환되어 저장 
		byte o = (byte) n; // 지정된 타입보다 값이 더 크므로 OverFlow 발생 
		
		double p = 3.14;
		int q = (int) p; // int는 정수형이므로 값엔 3만 저장 
		
		System.out.println(o); 
		System.out.println(q);
		
	}

}
