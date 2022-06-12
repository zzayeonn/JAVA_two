package SecondPackage;

import java.util.Scanner;

public class HeartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자를 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int height = 6 + (num * 3); //하트의 높이 
		int width= 7 + (num * 4); //하트의 너비 
		
		int center = width / 2; //하트의 너비 중앙 길이 
		int top = height / 3; //하트의 머리 종료 지점 
		int bottom = top * 3; //하트의 몸통 종료 지점 
		
		/*System.out.println("입력한 정수 : " + num);
		System.out.println("세로 길이 : " + height + ", 가로 길이 : " + width);
		System.out.println("가로 중간 지점 : " + center);
		System.out.println("상단 : " + top);
		System.out.println("하단 : " + bottom);*/
		
		char[][] heart = new char[height][width]; //하트의 높이와 너비로 다차원 배열 생성 

		int start; //시작 지점 
		int startMiddle1; //하트의 첫번째 머리 중앙 
		int startMiddle2;
		int end; //종료 지점 
		int endMiddle1; //하트의 두번째 머리 중앙 
		int endMiddle2;
		
		//하트 머리 생성 
		startMiddle1 = center / 2; //하트의 첫번째 머리 중앙 초기화 
		startMiddle2 = center / 2;
		endMiddle1 = width / 4 * 3 + 2; //하트의 두번째 머리 중앙 초기화 
		endMiddle2 = width / 4 * 3 + 2; 
		
		for(int a = 0; a < top; a++) { //하트 머리 종료 지점까지 반복
			for(int b = 0; b < center; b++) { //하트의 너비 중앙까지 반복 			
				if(startMiddle1 <= b && b <= startMiddle2) { //하트의 첫번째 머리의 너비가 startMiddle1보단 크거나 같고 startMiddle2보단 작거나 같다면 * 출력 
					
					heart[a][b] = '*';
						
					
				}else {
					
					heart[a][b] = ' ';
					
				}
				
			}
			
			startMiddle1--; //하트의 높이가 늘어날수록 찍히는 *의 개수도 늘어나야하기 때문에 startMiddle1 감소 
			startMiddle2++; //startMiddle2는 증가
		}
		
		
		for(int a = 0; a < top; a++) { //하트 머리 종료 지점까지 반복
			for(int b = center; b < width; b++) { //하트의 두번째 머리는 하트 머리 중앙부터 하트의 너비 끝까지 반복 
				
				if(endMiddle1 <= b && b <= endMiddle2) { //하트의 두번째 머리의 너비가 endMiddle1보단 크거나 같고 endMiddle2보단 작거나 같다면 * 출력
					
					heart[a][b] = '*';
					
				}else {
					
					heart[a][b] = ' ';
					
				}
				
			}
			
			endMiddle1--; //하트의 높이가 늘어날수록 찍히는 *의 개수도 늘어나야하기 때문에 endMiddle1 감소 
			endMiddle2++; //endMiddle2는 증가
		}
		
		//하트 몸통 생성
		start = 0; //하트의 몸통이 가득 채워진 상태에서 점점 감소해야하므로 배열의 첫 인덱스인 0으로 초기화 
		end = width - 1; //배열의 마지막 인덱스인 width - 1로 초기화
		for(int a = top; a < bottom; a++) { //하트의 몸통은 top부터 bottom까지 반복
			for(int b = 0; b < width; b++) { //하트의 너비까지 반복
				if(start <= b && b <= end) {
							
					heart[a][b] = '*';
							
				} else {
							
					heart[a][b] = ' ';
							
				}
			}
					
		start++; //하트의 높이가 늘어날수록 찍히는 *의 개수가 양쪽에서 하나씩 줄어야하기 때문에 start 증가
		end--; //end는 감소
					
		}
		
		//별 배열 출력 
		for(int a = 0; a < height; a++) {
			for(int b = 0; b < width; b++) {
				
				System.out.print(heart[a][b]); //완성된 하트의 배열 출력 
				
			}
			
			System.out.println();
			
		}
	}

}
