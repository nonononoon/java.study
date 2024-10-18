package study.Oper;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num = 15;
	//	int x = 10; // 선언 하고 나서 부터는 x 변수 사용 가능
		
		if (num > 10) {
			System.out.println("확인을 해보니까");
			System.out.println("10보다 큼");
		//	x= 30;
	//		int y = 40;
	//		y=60;    //{} 안에서만 변수 선언한거 재사용가능 -> 지역변수임
		}
		
		else {
			System.out.println ("10보다 안크던데?");  // else 는 if랑 세트임 
			// if 는 true 일때만 실행 , else 는 false 일때만 실행
		}
		
	//	boolean b = num == 15; // true /  false
		
		if (num == 15) {
			System.out.println("확인을 해보니까");
			System.out.println("15랑 똑같더라");
		}
		
	//	int y = 44;  // {} 벗어나면 변수 재선언 가능
	//	int z = 222;
		
		
		System.out.println("끝");

	}
	
	
	
	
	
}
