package SecondPackage;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while문으로 1부터 100까지의 합 구하기 
		
		int sum = 0;
		int i = 1; //루프 카운터 변수 초기화
		
		while(i <= 100) { //조건식 
			
			sum += i;
			i++; //증감식 
			
		}
		
		System.out.println("1부터 100까지의 합은 : " + sum + "\n");
		
		//while문과 for문을 섞어서 구구단 만들기 
		
		System.out.println("----구구단----");
		
		int a = 1;
		
		while(a < 10) {
			
			System.out.println("|    " + a + "단    |");
			
			for(int b = 1; b <10; b++) {
				
				System.out.println(" " + a + " X " + b + " = " + a * b);
				
			}
			
			System.out.println(" ");
			a++;
			
		}
		
		//do-while문으로 1부터 100까지의 합 구하기 
		
		int x = 1; //루프 카운터 변수 초기화 
		int y = 0;
		
		do {
			
			y += x;
			x++; //증감식 
			
		} while(x <= 100); //조건식
		
		System.out.println("1부터 100까지의 합은 : " + y + "\n");
		
		//do-while문과 for문을 섞어서 구구단 만들기 
		
		System.out.println("----구구단----");
		
		int c = 1;
		
		do {
			
			System.out.println("|    " + c + "단    |");
			
			for(int d = 1; d <10; d++) {
				
				System.out.println(" " + c + " X " + d + " = " + c * d);
				
			}
			
			System.out.println(" ");
			c++;
			
		} while(c < 10);
		
		//continue문
		
		int e = 0;
		
		do {
			
			e++;
			
			if(e % 2 != 0) {
				
				continue; //while문의 조건식으로 이동
				
			}
			
			System.out.println("실행한 짝수 회차 : " + e);
			
		} while(e <= 10);
		
	}

}
