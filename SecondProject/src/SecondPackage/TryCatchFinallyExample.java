package SecondPackage;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		
		try { //예외를 감지한 후 예외 처리를 할 catch문으로 전달
			
			System.out.println(3);
			System.out.println(0/0); //0으로 나눠서 ArithmeticException 발생
			System.out.println(4); //윗 줄에서 예외가 발생했기 때문에 예외발생 이후의 문장들은 미실행
			
		} catch (ArithmeticException ae) { //try문에서 보낸 예외가 처리 가능한지 확인 후 실행
			
			if (ae instanceof ArithmeticException) //ArithmeticException이 맞으므로 catch문 전체 실행
				
				System.out.println("true");
			
			System.out.println("예외 발생 : " + ae.toString()); //예외 발생 이유를 간단하게 출력 
			ae.printStackTrace(); //예외 발생 이유와 위치를 자세하게 출력
			System.out.println("ArithmeticException 발생"); //첫번째 catch문 실행한 후 try-catch문 종료
			
		} catch(Exception e) { //첫번째 catch문의 예외를 제외한 모든 예외 처리, 주로 마지막 catch문에 위치 
			
			System.out.println("예외 발생 : " + e.toString()); //첫번째 catch문의 예외 처리 됐으므로 try-catch문을 종료했기 때문에 미실행
			e.printStackTrace();
			System.out.println("Exception"); 
			
		} finally { //예외가 발생하든 안 하든 반드시 실행하는 finally문
			
			System.out.println(6); 			
		}
		
		System.out.println("종료합니다."); //try-catch-finally문을 종료한 후 나머지 실행
			
	}

}
