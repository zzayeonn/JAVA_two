package SecondPackage;

import java.util.Scanner;

public class CircleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.(홀수만 입력 가능) : ");
		int a = sc.nextInt();
		
		//원의 위 & 중간
		if(a % 2 == 1) { //홀수를 입력했을 경우 진행
			
			for(int x = 1; x <= a; x++){ 
				
				if(x % 2 == 1) { //열의 개수를 입력한 홀수의 개수와 맞추고 싶어 짝수는 생략하고 홀수만 진행

					for(int z = 1; z <= a - x; z++) { //입력한 수보다 -1만큼 공백을 두기 위한 반복문
						
						System.out.print(" "); 
					}
				
					for(int y = 1; y <= x; y++){
						
						System.out.print("**"); //좌우 대칭을 맞추기 위해 * 2개씩 출력, *이 1개일 경우 반만 출력
						
					}
					
					System.out.print("\n");
				} else continue; //짝수일 경우 다시 반복문으로 돌아가 x++
				
			}
			
			//원의 아래
			for(int x = a - 2; x >= 1; x--){ //원의 위에서 원의 중간까지는 완성했으므로 원의 중간과 짝수를 빼야해서 a-2로 진행
				
				if(x % 2 == 1) { //x가 홀수면 진행

					for(int z = a - x; z >= 1; z--) { //원의 위와 반대로 공백을 두기 위해 진행
						
						System.out.print(" ");
					}
				
					for(int y = x; y >= 1; y--){
						
						System.out.print("**");
						
					}
					
					System.out.print("\n");
				} else continue;
				
			}
			
		} else {
			
			System.out.println("홀수만 입력하시오."); //짝수를 입력했을 경우 뜨는 문구
			
		}
	}

}
