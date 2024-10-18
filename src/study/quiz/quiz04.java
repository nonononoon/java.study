package study.quiz;

public class quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 1. 아래 코드에서 예상되는 출력 결과를 작성하세요
		*/
		 
		int x = 2;
		int y = 3;
		int z;

		System.out.println("x="+x + " y="+y); 
		System.out.println(x + y);  // 2+3 = 5
		System.out.println(x++ + y++); // 7
		System.out.println("x="+x + " y="+y); // x 3 y 4
		// x 3 y 4 z 9
		z = ++x + ++y; //  4 5 9
		System.out.println("x="+x + " y="+y); 
		z--; // x 4 y 5 z 8
		x += --y; // x 8
		System.out.println("x="+x + " y="+y + " z="+z); // x 8 y 4 z 8
		x = 10;  // x 10 y 4 z 8
		z = x/y++; // x 10 y 5 z 2
		System.out.println("x="+x + " y="+y + " z="+z);
		// x 10 y 5 z 2
		System.out.println("x="+(x*2) + " y="+ ++y + " z="+z);
		// x 20 y 6 z 2
		System.out.println("x="+x + " y="+y + " z="+z); 
		// x 10 y 6 z 2
		
		/*
		2. 아래 조건에 대한 출력 결과를 예상해서 작성하세요
		*/
		
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println( (a<b) && (c>=a) ); // true
		System.out.println( (a == b ) || ( a >= b) || (c > 10) ); // false
		boolean result = !(c == 3); // true --> ! 붙혀있으므로 부정 false
		System.out.println( result );  // false
		
		/*
		3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.

		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
		0 ~ 6000원 이하 -> "훌륭"
		6001원 초과 ~ 8000원 -> "선방"
		8001원 초과 ~ 12000원 -> "눈물"
		12001원 초과 -> "물로배채우기"
		*/
		
		int menuPrice = 4000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result5 = ( menuPrice <= 6000 ) ? "훌륭": // 6천원이하 훌륭
			( menuPrice <= 8000 ) ? "선방" :
					( menuPrice <= 12000 ) ? "눈물":"물로배채우기";
		System.out.println(result5);
		

		

	}

}
