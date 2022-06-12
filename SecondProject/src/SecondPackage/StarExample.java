package SecondPackage;

import java.util.Scanner;

public class StarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자를 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int height = num * 9; //별 세로 길이
		int width= num * 15; //별 가로 길이 
		if(width % 2 == 0) //가로 길이가 짝수일 경우 +1
			width += 1;
		
		int center = width / 2; //가로 중간 지점 
		int top = height / 3; //별 머리 종료 지점 
		int middle = top * 2; //별 몸통 종료 지점 
		int bottom = top * 3; //별 다리 종료 지점 
		
		/*System.out.println("입력한 정수 : " + num);
		System.out.println("세로 길이 : " + height + ", 가로 길이 : " + width);
		System.out.println("가로 중간 지점 : " + center);
		System.out.println("상단 : " + top);
		System.out.println("중간 : " + middle);
		System.out.println("하단 : " + bottom);*/
		
		char[][] star = new char[height][width]; //별의 세로와 가로 길이로 다차원 배열 생성

		int start; //시작 지점 
		int end; //종료 지점 
		int startBottom; //하단 시작 지점 
		int endBottom; //하단 종료 지점 
		
		//별 머리 생성 
		start = center; //별이 중앙부터 퍼져 나가야하므로 가로 중간 지점으로 초기화 
		end = center; //가로 중간 지점으로 초기화 
		for(int a = 0; a < top; a++) { //별 머리 종료 지점까지 반복
			for(int b = 0; b < width; b++) { //별의 가로 길이까지 반복
				if(start <= b && b <= end) { //b가 start보단 크거나 같고 end보단 작거나 같다면 * 출력 
					
					star[a][b] = '*';
					
				}else {
					
					star[a][b] = ' ';
					
				}
			}
			
			start--; //별의 세로 길이가 늘어날수록 찍히는 *의 개수도 늘어나야하기 때문에 start 감소 
			end++; //end는 증가 
		}
		
		//별 몸통 생성
		start = 0; //별의 몸통이 가득 채워진 상태에서 점점 감소해야하므로 배열의 첫 인덱스인 0으로 초기화 
		end = width - 1; //배열의 마지막 인덱스인 width - 1로 초기화 
		for(int a = top; a < middle; a++) { //별의 몸통은 top부터 middle까지 반복 
			for(int b = 0; b < width; b++) { //별의 가로길이까지 반복
				if(start <= b && b <= end) {
					
					star[a][b] = '*';
					
				} else {
					
					star[a][b] = ' ';
					
				}
			}
			
			start++; //별의 세로 길이가 늘어날수록 찍히는 *의 개수가 양쪽에서 하나씩 줄어야하기 때문에 start 증가 
			end--; //end는 감소 
			
		}
		
		//별 다리 생성 
		startBottom = center; //별이 중앙에서 비워진 채로 점점 퍼져 나가야하므로 하단 시작 부분을 center로 초기화 
		endBottom = center; //center로 초기화 
		for(int a = middle; a < bottom; a++) { //별의 몸통은 middle부터 bottom까지 반복 
			for(int b = 0; b < width; b++) { //별의 가로 길이까지 반복
				if(startBottom <= b && b <= endBottom) { //별의 머리와 반대로 startBottom보단 크거나 같고 endBottom보단 작거나 같다면 공백 출력 
					
					star[a][b] = ' ';
					
				} else {
					
					star[a][b] = '*';
					
				}
				
				if(start - 1 > b || end + 1 < b) { //start & end는 몸통에서 조건에 맞지 않아 종료된 값, -1한 인덱스부터 공백 출력
					
					star[a][b] = ' ';
					
				}
			}
			
			start--; //찍히는 공백의 인댁스가 줄어야하므로 감소 
			end++; //인덱스가 늘어야하므로 증가
			startBottom -= 3; //bottom은 1과 1로 맞춰야하기 때문에 모양에 따라 -3으로 지정 
			endBottom += 3;
		}
		
		//별 배열 출력
		for(int a = 0; a < height; a++) {
			for(int b = 0; b < width; b++) {
				
				System.out.print(star[a][b]); //완성된 별의 배열 출력 
				
			}
			
			System.out.println();
			
		}
		
	}

}
