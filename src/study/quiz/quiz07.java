package study.quiz;

import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		// 1번문제 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변");
		int a = scanner.nextInt();
		
		int nextInt
		string nextLine
		
		System.out.println("밑변 : " + a);
		
		System.out.print("높이");
		int b = scanner.nextInt();
		
		System.out.println("높이 : " + b);

		System.out.println("삼각형의 넓이 = " + (double)a*(double)b/2 + "입니다." );
		
		
		// 2번문제
		System.out.print("윗변");
		int c = scanner.nextInt();
		
		System.out.print("밑변");
		int d = scanner.nextInt();
	
		
		System.out.print("높이");
		int e = scanner.nextInt();

		System.out.printf(" 사다리꼴의 넓이 = " + (c+d)*e/2.0);
		 */
		
		
	/*	// A 와 B 나누고 나서 남는 금액 계산 방법
														    	
		int people = 30;
		int total = 534;
		
		System.out.println(" 한명당" + (total/people) + "개 과자를 나누면" );
		System.out.println(" 남는과자는 : " + (total%people) + "개 입니다"); */
		                                                                
		
   /* ┌
		// 백의자리 십의자리 일의자리 나타내는 방법    

				int num = 158 ;
		
		        // 158
				// 158 / 100 = 1.58 -> 정수 변환 1
				// 158 % 100 = 58   58/10=5.8 정수변환 5
				// 158 / 10 = 15.8 -> 15
				// 158 % 10 = 8
		
		System.out.println("백의자리 : " + (num/100) );
		
		System.out.println("십의자리 : " + (num/10%10));
		
		System.out.println("일의자리 : " + (num%10) );
															   ┘ */

		
		

	/* ┌	
			// 두 변수 교환 하는 방법 	
			int x = 10;
			int y = 20;
			
			int z = x ;
			x = y ;
			y = z ;
			System.out.println("x :" + x + " y :" + y ) ; 
		
			int x = 3;
			int y = 5;
			
			int z = x ;
			x = y ;
			y = z ; 
			System.out.println("x : " + x  + "y : " + y); 
		 		
		 											         
		 											      ┘ */
		
		
		/*	for (int i =1; i<=5; i++) {
				System.out.println(12345);
				
      } */
			
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(i);
			} 
			System.out.println("");
		}
		
		   
			
	}

}
