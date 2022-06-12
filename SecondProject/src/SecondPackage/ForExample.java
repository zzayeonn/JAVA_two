package SecondPackage;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문으로 1부터 100까지의 합 구하기 
		
		int sum = 0; //1부터 100까지 더한 값을 출력해 줄 변수 초기화 
		
		for(int i = 1; i <= 100; i++) { //(초기화식/조건식/증감식)
			
			sum += i; //sum=sum+i 와 같은 말  
			
		}
		
		System.out.println("1부터 100까지의 합 : " + sum + "\n");
		
		//중첩for문으로 구구단 만들기 
		
		System.out.println("----구구단----");
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println("|    " + i + "단    |");
			
			for(int j = 1; j <10; j++) { //for문 안에 들어간 중첩for문으로 i가 1일 때 j는 1-9까지 반복 
				
				System.out.println(" " + i + " X " + j + " = " + i * j);
				
			}
			
			System.out.print("\n"); //println(" "); 와 같은 말 
			
		}
		
		//break문을 이용하여 for문 중지
		
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			Outter : for(char lower = 'a'; lower <= 'z'; lower++) {
			
				char lowertoupper = Character.toUpperCase(lower); //소문자를 대문자로 바꿔주는 메소드 (대소는 .toLowerCase) 
				
				if(upper == lowertoupper) {
					
					System.out.println(upper + " - " + lower);
					break Outter;
					
				}
	 		}
			
		}
		
		System.out.println(" ");
		
		//continue문
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 != 0) {
				
				continue; //for문의 증감식으로 이동 
				
			}
			
			System.out.println("실행한 짝수 회차 : " + i);
			
		}
		
		System.out.println(" ");
		
		//응용_1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 단의 숫자를 입력하시오. : ");
		int number = sc.nextInt();
		
		System.out.println("----구구단----");
		System.out.println("|    " + number + "단    |");
		
		for(int i = 1; i <= number; i++) {
			
			System.out.println(" " + number + " X " + i + " = " + number * i);
				
			}
			
		System.out.print("\n");
			
		//응용_2
		
		//Scanner sc = new Scanner(System.in); 응용_1에 존재
		
		System.out.println("대문자 한 개를 입력하시오. : ");
		char alpabet = sc.next().charAt(0);
		
		for(char lower = 'a'; lower <= 'z'; lower++) {
			
			char lowertoupper = Character.toUpperCase(lower);
				
			if(alpabet == lowertoupper) {
					
				System.out.println(alpabet + "의 소문자는 " + lower + "입니다.");
					
			}
	 	}
		
		System.out.println(" ");
				
	}

}
