package firstpackage;

public class ClassVariableExample {

	static class Snack {
		static int width = 30; //클래스 변수 초기화
		static int height = 40;
		String color; //인스턴스 변수 초기화 
		String name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("아연이가 좋아하는 과자의 너비는 " +Snack.width+ "이고, 높이는 " +Snack.height+ "입니다.");
		
		Snack s1 = new Snack(); //객체 s1 생성
		s1.color = "blue"; //객체 s1의 지역변수 초기화
		s1.name = "postick";
		
		Snack s2 = new Snack(); //객체 s2 생성
		s2.color = "yellow"; //객체 s2의 지역변수 초기화 
		s2.name = "squidhouse";
		
		Snack s3 = new Snack(); //객체 s3 생성 
		s3.color = "green"; //객체 s3의 지역변수 초기화 
		s3.name = "onionring";
		
		System.out.println("과자 1의 색깔은 " +s1.color+ "입니다.");
		System.out.println("과자 1의 이름은 " +s1.name+ "입니다.");
		System.out.println("과자 1의 크기는 가로 " +Snack.width+ ", 세로 " +Snack.height+ "입니다.\n");
		
		System.out.println("과자 2의 색깔은 " +s2.color+ "입니다.");
		System.out.println("과자 2의 이름은 " +s2.name+ "입니다.");
		System.out.println("과자 2의 크기는 가로 " +Snack.width+ ", 세로 " +Snack.height+ "입니다.\n");
	
		s3.width = 40; //객체 s3의 클래스 변수 변경, 앞으로의 클래스 변수 또한 변경된 상태로 유지 
		s3.height = 60;
		
		System.out.println("과자 3의 너비를 " +Snack.width+ ", 높이를 " +Snack.height+ "으로 변경하겠습니다.\n");
		
		System.out.println("과자 3의 색깔은 " +s3.color+ "입니다.");
		System.out.println("과자 3의 이름은 " +s3.name+ "입니다.");
		System.out.println("과자 3의 크기는 가로 " +s3.width+ ", 세로 " +s3.height+ "입니다.\n");

		System.out.println("현재 지정되어 있는 과자의 너비는 " +Snack.width+ "이고, 높이는 " +Snack.height+ "입니다.\n");
		
	}
	
}
