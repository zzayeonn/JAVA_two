package SecondPackage;

public class CircleExample3 {
	
	final static int N = 15;

	public static void main(String[] args) {
		//원의 방정식 : x^2 + y^2 = r^2
		for(int i = -N; i <= N; i++) //초기값을 -N으로 하여 31x31이 출력되도록 설정 
		{
			for(int j = -N; j <= N; j++) 
			{
				if(i * i + j * j <= N * N) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


}
