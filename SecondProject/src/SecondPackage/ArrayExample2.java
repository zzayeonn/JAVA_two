package SecondPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//응용_1
		ArrayList<Integer> input = new ArrayList<Integer>(); //가변적인 배열의 크기 때문에 ArrayList 사용
		Scanner sc = new Scanner(System.in);
		int temp;
		
		System.out.println("숫자를 입력하시오. (0을 입력할 시 입력 종료): ");
		int i = 0;
		while(true) {
			temp = sc.nextInt();
			if(temp == 0) { //입력한 숫자가 0일 경우 종료
				break;
			} else {
				input.add(temp); //배열 안으로 입력 받은 데이터 추가
				i++;
			}
		}
		
		System.out.println("입력을 종료합니다.");
		int array[] = new int[input.size()]; //input의 크기로 배열 생성 
		for(i = 0; i < input.size(); i++) {
			array[i] = input.get(i); //i 위치에 있는 숫자를 인덱스 i로 삽입 
		}
		
		System.out.println("동적할당된 배열 출력 : ");
		for(i = 0;i < array.length; i ++) {
			System.out.print(array[i] + " ");
		}
		
		/*잘못된 코드
		int[] x = new int[20];
		
		Scanner y = new Scanner(System.in);
		System.out.println("배열에 저장할 정수를 입력하시오. : ");
		int z = y.nextInt();
		
		for(int i = 0; i < x.length; i++) {
			
			Scanner y = new Scanner(System.in);
			System.out.println("배열에 저장할 정수를 입력하시오. : ");
			int z = y.nextInt();
		
			if(z == 0) {
			
				for(int j = 0; j < i; j++){
					
					System.out.println(x[i]);
					
				}
				
				System.out.println("프로그램을 종료합니다.");
				break;
			
			}
			
			x[i] = z;
			
		}*/
		
	}

}
