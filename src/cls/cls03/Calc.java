package cls.cls03;

public class Calc {

	// 필드 
	
	// 셍성자 
	
	// 메소드
	//- 리턴 o x
	//- 매개변수 o x
	
	// 리턴 x 매개변수 x
	void powerOn() {
		System.out.println("전원 On");
	} // return; 만나는 순간 메소드 종료됨 
	
	
	// 숫자가 있는 값은 리턴해야함 ex. double 
	
	// 리턴 x 매개변수 o
	void setOwner(String name) {
		System.out.println(name + "님의 계산기입니다.");
	}
	// 리턴 o 매개변수 o
	double divide(int x, int y) {
	// return 리턴타입은 double 

		double result = (double)x/y;
		
		return result; 
	}
	// 리턴 o 매개변수 x 
		String madeByInfo() {
			
			return "카시오";
			
			/* 
			 * 	String msg = "카시오"
			 * return msg;
			 */
		
	}
	
	
}
