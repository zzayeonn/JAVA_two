package SecondPackage;

import java.util.Scanner;

public class CircleExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자를 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //입력 받은 수 
		
		int height = num * 18; //원의 세로 길이 
		int width = num * 40; //원의 가로 길이 
		int top = height / 2; //상단 
		int radius = height / 2 + 1; //반지름 
		
		/*System.out.println("입력한 정수 : " + num);
		System.out.println("세로 길이 : " + height + ", 가로 길이 : " + width);
		System.out.println("상단 : " + top);
		System.out.println("반지름 : " + radius);*/
		
		char[][] circle = new char[height][width]; //원의 세로와 가로 길이로 배열 생성 
		
		int start = 0; //시작 지점 
		int end = 0; //끝 지점 
		
		//원의 상단 생성 
		for(int a = top; a > 0; a --) {
			
			int bLine = (int) Math.round(Math.sqrt(Math.pow(radius - 1,  2) - Math.pow(a,  2))); //피타고라스 공식, 가로 행의 중앙에서 양쪽으로 점을 찍어야 되는 거리 
			bLine = (bLine + 1) * 2;
			
			//System.out.println(a + "행의 길이는" + bLine + " 입니다.");
			
			int hRow = Math.abs(a - top); //세로 행의 위치 
			start = (width / 2) - bLine; //가로 행의 시작 지점 
			end = ((width / 2) - 1) + bLine; //가로 행의 종료 지점 
			
			//System.out.println("시작 : " + start + ", 종료 : " + end);
			
			//배열에 원 상단 입력 
			for(int b = 0; b < width; b++) {
				if(start <= b && b < end) {
					
					circle[hRow][b] = '*';
					
				} else {
					
					circle[hRow][b] = ' ';
					
				}
			}
		}
		
		//원의 상단 출력 
		for(int a = 0; a < top; a++) {
			for(int b = 0; b < width; b++) {
				
				System.out.print(circle[a][b]);
				
			}
			
			System.out.println();
			
		}
		
		//원 하단 출력 (상단을 반전해서 출력)
		for(int a = top -1; a >= 0; a--) {
			for(int b = 0; b < width; b++) {
				
				System.out.print(circle[a][b]);
			}
			
			System.out.println();
		}
		

	}

}
