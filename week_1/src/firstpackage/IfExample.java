package firstpackage;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if문의 true & false
		boolean t = true;
		boolean f = false;
		
		if(t) {
			
			System.out.println("실행합니다.");	//if문이 true이기 떄문에 실행 
			
		} 
		else {
			
			System.out.println("중지합니다."); //if문이 true이므로 미실행 

		}
		
		if(f) {
			
			System.out.println("실행합니다.\n");	//if문이 false이기 때문에 미실행 
			
		} 
		else {
			
			System.out.println("중지합니다.\n"); //if문이 false이므로 else문 실행 

		}
		
		//if문에 논리연산자와 관계연산자 사용 
		
		if(!t) {
			
			System.out.println("실행합니다."); //논리연산자 !에 의해 true --> false
			
		}
		else {
			
			System.out.println("중지합니다."); //if문이 false이므로 else가 출력 
		
		}
		 
		int a = 3;
		
		if(a == 3) {
			
			System.out.println("a는 3입니다."); //관계연산자는 =이 아니라 ==이므로 주의
			
		}
		else {
			
			System.out.println("a는 3이 아닙니다.");
		
		}
		
		if(a > 0 && a < 2) {
			
			System.out.println("a는 1입니다.");
			
		}
		else if(a > 1 && a < 3) {
			
			System.out.println("a는 2입니다.");
			
		}
		else if(a > 2 && a <= 3) {
			
			System.out.println("a는 3입니다."); //a=3인데 조건이 2<a<=3이므로 실행  
			
		}
		else if(a >= 3 && a < 4) {
			
			System.out.println("a는 3입니다."); //이미 위의 조건문이 실행되었으므로 미실행
			
		}
	 
		if(a != 3) {
			
			System.out.println("a는 3이 아닙니다.\n"); //관계연산자 != 의해 a는 3이 아닐 경우 출력하므로 미실행 
			
		}
		else if (a != 4) {
			
			System.out.println("a는 4가 아닙니다.\n"); //a는 4가 아니므로 실행 
		
		}
		
		//if문의 문자열 비교 
		String b = "abc";
		
		if(b.equals("abc")) { //문자열 비교 시에 =가 아닌 .equals 사용 
			
			System.out.println("b는 abc입니다.");
			
		} else { 
			
			System.out.println("b는 abc가 아닙니다.");
			
		}
		
		if(b.equals("ABC")) { //대소문자 구분 필요 
			
			System.out.println("b는 abc입니다.");
			
		} else { 
			
			System.out.println("b는 ABC가 아니라 abc입니다.");
			
		}
		
		if(b.equalsIgnoreCase("ABC")) { //대소문자 구분 없이 비교하고 싶을 떈 .equalsIgnoreCase 사용 
			
			System.out.println("b는 abc입니다.\n");
			
		} else { 
			
			System.out.println("b는 abc가 아닙니다.\n");
			
		}
		
		//삼항연산자 
	
		System.out.println(a > 4 ? "a는 4보다 큽니다.\n" : "a는 4보다 작습니다.\n");
		
		//응용_1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요. : ");
		String name = sc.nextLine();
		
		System.out.println("몸무게를 입력하세요. : ");
		int weight = sc.nextInt();
		
		if(weight >= 80) {
			
			System.out.println("고도비만입니다.");
			
		}
		else if(weight >= 60 && weight <80) {
			
			System.out.println("과체중입니다.");
			
		}
		else if(weight >= 50 && weight <60) {
			
			System.out.println("정상입니다.");
			
		}
		else if(weight < 50) {
			
			System.out.println("저체중입니다.");
			
		}
		
	}
}
