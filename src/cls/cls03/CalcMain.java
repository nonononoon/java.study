package cls.cls03;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본 생성자
		Calc c1 = new Calc(); 
		
		c1.powerOn(); // 전원 On 출력

		Calc c2 = new Calc();
		
		c2.powerOn();  // 전원 On 출력
		
		c1.setOwner("내이름"); // 내이름님의 계산기입니다. 출력
		
		c2.setOwner("너이름"); // 너이름님의 계산기입니다. 출력
		
		double result1 = c1.divide(10, 5);
		System.out.println(result1); // 2.0 출력
		
		System.out.println(c2.divide(3, 2));// 1.5 출력

		String result2 = c1.madeByInfo();
		System.out.println(result2); // 카시오 출력 
		
		System.out.println(c2.madeByInfo() ); // 카시오 출력 
	}

}
