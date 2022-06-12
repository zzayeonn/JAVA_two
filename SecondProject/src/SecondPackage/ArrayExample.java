package SecondPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//동적배열 : 데이터의 값을 알고 있을 때 사용, 배열리터럴{}을 사용
		String[] number = { "eins", "zwei", "drei", "vier", "fünf" };
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		System.out.println(" ");
		
		//동적배열을 이용해 점수 합계와 평균 구하기
		int[] score = { 92, 83, 79, 94, 100 };
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) { //score.length = 5(배열의 길이)
			
			sum += score[i];
			
		}
		
		double avg = (double) sum / score.length; //소수점 표시를 위해 형 변환 
		
		System.out.println("점수의 합계 : " + sum);
		System.out.println("점수의 평균 : " + avg);
		System.out.println(" ");
		
		//for-each문
		int[] scorescore = { 78, 96, 84, 73, 95 };
		int sumsum = 0;
		
		for(int i : scorescore) { //(자료형 변수 : 배열) 배열의 값이 있으면 자료형 변수의 값을 보냄
			
			sumsum += i; //반복 실행할 문장 
					
		}
		
		double avgavg = (double) sumsum / scorescore.length;
		
		System.out.println("점수의 합계 : " + sumsum);
		System.out.println("점수의 평균 : " + avgavg);
		System.out.println(" ");
		
		//정적배열 : 데이터의 값은 모르지만 향후 값을 저장하기 위한 배열을 생성하고 싶을 때 사용
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		for(int i = 0; i < num.length; i++) {
			
			System.out.println(num[i]);
			
		}
		
		System.out.println(" ");
		
		//정적배열을 이용해 최대값, 최소값 구하기
		int[] numnum = new int[5];
		//int max, min;
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하시오. : ");
		
		for(int i = 0; i < numnum.length; i++) {
			
			numnum[i] = sc.nextInt(); //입력 받은 정수를 배열 numnum에 저장
			
		}
		
		int max = numnum[0]; //최대값 초기화 
		int min = numnum[0]; //최소값 초기화
		
		for(int i = 0; i < numnum.length; i++) {
			
			if(max < numnum[i]) { //최대값 비교 
				
				max = numnum[i]; //최대값 할당 
				
			}
			
			if(min > numnum[i]) { //최소값 비교 
				
				min = numnum[i]; //최소값 할당 
				
			}
		}
		
		System.out.println("최댓값 : " + max);
		System.out.println("최댓값 : " + min);
		System.out.println(" ");

		//2차원 배열 
		int[][] numnumnum = { {4, 3, 4}, {3, 7, 6}, {5, 8, 7}, {9, 9, 10} };
		
		for(int a = 0; a < 4; a++) {
			
			System.out.print("   " +(a + 1) + "번째 배열\n");
			System.out.print((a + 1) + "열 ");
			
			for(int b = 0; b < 3; b++) {
				
				System.out.print(numnumnum[a][b] +" ");
				
			}
			
			System.out.print("\n");
		
		}
		
		System.out.print("\n");
		
		//배열의 값을 입력 받아 합치기
		int[] num1 = new int[3];
		int[] num2 = new int[3];
		int[] num3 = new int[3];
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번째 배열에 저장할 정수를 3개 입력하시오. : ");
		for(int x = 0; x < num1.length; x++) {
			
			num1[x] = sc1.nextInt(); //첫번째로 입력 받은 정수를 배열 num1에 저장
			
		}
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 배열에 저장할 정수를 3개 입력하시오. : ");
		for(int y = 0; y < num2.length; y++) {
			
			num2[y] = sc2.nextInt(); //두번째로 입력 받은 정수를 배열 num2에 저장
			
		}
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("세번째 배열에 저장할 정수를 3개 입력하시오. : ");
		for(int z = 0; z < num3.length; z++) {
			
			num3[z] = sc3.nextInt(); //세번째로 입력 받은 정수를 배열 num3에 저장
			
		}
		
		int[] result = new int[num1.length + num2.length + num3.length];
		System.arraycopy(num1,  0,  result,  0,  num1.length); //(배열, 배열의 시작인덱스, 넣을 배열, 넣을 배열의 시작인덱스, 넣을 배열의 개수)
		System.arraycopy(num2,  0,  result,  num1.length,  num2.length);
		System.arraycopy(num3,  0,  result,  num1.length + num2.length,  num3.length);
		System.out.println("System.arraycopy를 이용한 배열 합치기 : " + Arrays.toString(result));
		
	}
		
}
			



