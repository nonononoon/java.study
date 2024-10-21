package study.Oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 산술 연산자
		System.out.println ( 1+1 );
		System.out.println ( 9-4 );
		System.out.println ( 3*1 );
		System.out.println ( 7/3.0);
		System.out.printf ( "%.2f\n" , 7/3.0 );
		System.out.println ( 9%5 );
		
		// 부호 연산자
		System.out.println ( 10 );
		System.out.println ( + 10 );
		System.out.println ( -10 );
		
		System.out.println ("==========================");
		// 증감연산자
		int x = 10;
		System.out.println(x); // 10
		System.out.println(++x); // +1증가로 11
		System.out.println(x++); // 10 ? 
		System.out.println(x--);
		
		int y = 20;
		System.out.println(++y); // 21
		System.out.println(y); // 21
		
		int z = 30;
		System.out.println(z+1); // 31
		System.out.println(z); // 30
		
		int q = 1; // 1 -> 2
		int w = 3; // 3 -> 2
		int e = 10 + ++q; // 10 + ++q = 12
		int r = 3 + w--; // 3 + 3 -> 6
		
		System.out.printf("%d %d %d %d\n", q,w,e,r);
	
		boolean isFinished = false;
		System.out.println(!isFinished); 
		System.out.println(isFinished); 
		
		System.out.println("JDK" + 3 + 3.0);
		
		System.out.println ("==========================");
		
		// 비교 연산자
		System.out.println ( 1 == 2); //false
		System.out.println ( 1 != 2); //true
		System.out.println ( 3 < 5); //true
		System.out.println ( 4 <= 5); //true
		System.out.println ( 5 > 10); //false
		System.out.println ( 9 >= 8); //true
		boolean b1 = (9 >= 8); 
		
		// 논리 연산자
		boolean b2 = ( 10 > 6 ) && (10 > 5 );
		               // true       true    
		System.out.println(b2);
		
		boolean b3 = ( 5 != 1 ) || (10 < 4 );
		System.out.println(b3);
		
		boolean b4 = ( 2 >= 1 ) && (3 < 4 );
		System.out.println(!b4);
		
		// 대입 연산자
		
		int a = 30;
		
		a += 30;    // a = a + 30;
		a -= 5;    // a = a - 5;
		a *= 3;   // a = a * 3;
		a /= 2;  // a = a / 2;
		a %= 4; // a = a % 4;
	
		// 삼항 연산자
		int point = 150;
		
		// point 0 ~ 200 : 생수
		// 201 ~  : 커피		
		
		String evebtItem = (point <= 200) ? "생수" : "커피";
		System.out.println(evebtItem);
		
		evebtItem = (point > 200) ? "커피" : "생수" ;
		
		evebtItem = (point > 200) ? ( point > 300 ? "맥주" : "커피" ) : (point >= 0 ? "생수" : "사은품없음"); 
		
		// point 0 ~ 200 : 생수
		// 201 ~ 300 : 커피		
		// 301 ~ : 맥주
		
		evebtItem = (point > 200) ? ( ( point>=201 && point <=300 ) ? "커피" : "맥주") : "생수";
		System.out.println(evebtItem);
		
		
		                         
		
		
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
