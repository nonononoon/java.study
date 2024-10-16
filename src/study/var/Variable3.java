package study.var;

public class Variable3 {

	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = d1;
		
		int i1 = 30;
		int i2 = i1;
		//int i3 = 3.123; 정수형 변수 int = 실수형 값 xx 
		
		i2 = (int)d2; // int = double 
				// i2 = (int)3.14;
		
		System.out.println(i2);
		
		//double -> int 변환 소수점 사라진다

		// java 정수 -> int 인식   실수 -> double 인식
		
		float f1 = 4.43f;
		double d3 = f1; //double = float 자동타입변환
		
		double d4 = 300; // double 실수형타입 = 정수형숫자(int) 자동타입변환 int < double
		System.out.println(d4); //300.0 저장
		
		// 연산에서 형변환
		int intvalue = 10;
		double doublevalue = 5.5;
		
		// int result = intvalue + doublevalue;
		              //int + double -> double
		int result = intvalue + (int)doublevalue; // 강제형 변환 1
		// int = int + (int)double (int)5.5 -> 5
		
		result = (int)(intvalue + doublevalue); // 강제형 변환 2
		//		int 10 + double 5.5 -> double 15.5
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rt = (int)dv1 + (int)dv2; // int 먼저 5+6=11
		System.out.println(rt);
		
		rt = (int)(dv1 + dv2); // 5.5+6.6=12.1 -> int 12 
		System.out.println(rt);
		
		
		

	
	}

}
