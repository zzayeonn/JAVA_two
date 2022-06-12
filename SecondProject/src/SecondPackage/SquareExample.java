package SecondPackage;

import java.util.Scanner;

public class SquareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("만들고 싶은 사각형의 가로 길이를 입력하시오. : ");
		int a = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("만들고 싶은 사각형의 세로 길이를 입력하시오. : ");
		int b = sc2.nextInt();
		
		for(int i = 1; i <= b; i++) { //세로 길이만큼 반복
			
			for (int j = 1; j <= a; j++) //가로 길이만큼 반복
				
			System.out.print("*");
		
		System.out.print("\n");
			
		}
	}

}
