package firstpackage;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//switch문 (break 미존재)
		System.out.println("switch(1)");
		switch(1) {
		
		case(1) : 
			
			System.out.println("one\n"); //switch문의 조건이 1이므로 실행 
		
		case(2) : 
			
			System.out.println("two\n"); //case1이 실행되었으므로 2도 실행 
		
		case(3) : 
			
			System.out.println("three\n"); //case1, case2가 실행되었으므로 3도 실행 
		
		}
		
		System.out.println("switch(2)");
		switch(2) {
		
		case(1) : 
			
			System.out.println("one\n"); //switch문의 조건에 따라 미실행 
		
		case(2) : 
			
			System.out.println("two\n"); //switch문의 조건이 2이므로 실행 
		
		case(3) : 
			
			System.out.println("three\n"); //case2가 실행되었으므로 3도 실행
		
		}
		
		System.out.println("switch(3)");
		switch(3) {
		
		case(1) : 
			
			System.out.println("one\n"); //switch문의 조건에 따라 미실행 
		
		case(2) : 
			
			System.out.println("two\n"); //switch문의 조건에 따라 미실행  
		
		case(3) : 
			
			System.out.println("three\n"); //switch문의 조건이 3이므로 실행 
		
		}
		
		//switch문 (break 존재)
		System.out.println("switch(2)");
		switch(2) {
				
		case(1) : 
					
			System.out.println("one\n"); //switch문의 조건에 따라 미실행 
			break;
				
		case(2) : 
					
			System.out.println("two\n"); //switch문의 조건이 2이므로 실행 후 break문으로 인해 종 
			break;
				
		case(3) : 
					
			System.out.println("three\n"); //case2가 실행되었으나 break문에 의해 미실행  
			break;
				
		}
		
		//switch문 (break, default 존재)
		System.out.println("switch(4)");
		switch(4) {
				
		case(1) : 
					
			System.out.println("one\n"); 
			break;
				
		case(2) : 
					
			System.out.println("two\n"); 
			break;
				
		case(3) : 
					
			System.out.println("three\n"); 
			break;
			
		default : 
			
			System.out.println("default\n");
			break;
			
		}
		
		//switch문 --> if문 
		System.out.println("switch(if)");
		
		int a = 2;
		
		if(a == 1) {
			
			System.out.println("one\n");
	
		}
		else if(a == 2) {
			
			System.out.println("two\n");
			
		}
		else if(a == 3) {
			
			System.out.println("three\n");
			
		}
		
		//응용_1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하시오. (160부터 180까지 반내림하여 5단위로 입력하시오.) : ");
		int height = sc.nextInt();
		
		System.out.println("몸무게를 입력하시오.) ; ");
		int weight = sc.nextInt();
		
		switch(height) {
		
		case 180:
			
			System.out.println("키가 매우 큽니다.");
			if(weight >= 85) {
				
				System.out.println("과체중입니다.");
				
			}
			else if(weight >= 80 && weight <85) {
				
				System.out.println("정상체중입니다.");
				
			}
			else if(weight <= 80) {
				
				System.out.println("저체중입니다.");
				
			}
			break;
		
		case 175:
			
			System.out.println("키가 큽니다.");
			if(weight >= 80) {
				
				System.out.println("과체중입니다.");
				
			}
			else if(weight >= 70 && weight <80) {
				
				System.out.println("정상체중입니다.");
				
			}
			else if(weight <= 70) {
				
				System.out.println("저체중입니다.");
				
			}
			break;
		
		case 170:
			
			System.out.println("키가 평균적입니다.");
			if(weight >= 75) {
				
				System.out.println("과체중입니다.");
				
			}
			else if(weight >= 65 && weight <75) {
				
				System.out.println("정상체중입니다.");
				
			}
			else if(weight <= 65) {
				
				System.out.println("저체중입니다.");
				
			}
			break;
			
		case 165:
			
			System.out.println("키가 작습니다.");
			if(weight >= 70) {
				
				System.out.println("과체중입니다.");
				
			}
			else if(weight >= 60 && weight <70) {
				
				System.out.println("정상체중입니다.");
				
			}
			else if(weight <= 70) {
				
				System.out.println("저체중입니다.");
				
			}
			break;
			
		case 160:
			
			System.out.println("키가 매우 작습니다.");
			if(weight >= 65) {
				
				System.out.println("과체중입니다.");
				
			}
			else if(weight >= 55 && weight <65) {
				
				System.out.println("정상체중입니다.");
				
			}
			else if(weight <= 55) {
				
				System.out.println("저체중입니다.");
				
			}
			break;
			
		default :
			
			System.out.println("키를 160-180까지 반내림하여 5단위로 다시 입력하시오.");
			break;
			
		}
		
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
