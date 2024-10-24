package study.quiz;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*

		
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.print("*");
			} System.out.println();
		}
		
		*/
		
		
	/* 2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****	
	
		
	    for (int i=1; i<=4; i++) {
	    	for (int j=1; j<=i; j++) {
	    		System.out.print("*");
	    	} System.out.println();
	    } */
	    
	
		

		 
	/*	 for (int i=1; i<=number; i++) {
			 for (int j=1; j<=i; j++) {
				 System.out.print("*");
			 } 
			 System.out.println();
		 } 
		 
		 int number = scanner.nextInt();
		 
		 for (int i=1; i<=number; i++) {
			 for (int j=number; j>=i; j--) {
				 System.out.print("*");
			 } 
			 System.out.println();
		 } 
		 */
		
		
		
		
	/*	for (int i=1; i<=4; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			 System.out.println();
		} 
		
		
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.print("*");
			}
			 System.out.println();
		}
		
	
	 
		 Scanner scanner = new Scanner(System.in); 
		 System.out.println("입력");
		 
	      int number = scanner.nextInt();
		
			for (int i=1; i<=number; i++) {
				for (int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for (int i=1; i<=number; i++) {
				for (int j=number-1; j>=i; j--) {
					System.out.print("*");
				}
				 System.out.println(); 	
			} 	*/
		
		
		// 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		int sum = 0;
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
				sum=sum+j;
			}
		} System.out.print(sum); 
		System.out.println();
		
	// 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
	//100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.	
		
		sum=0;
		for (int i=1; sum<100; i++) {
			if (sum%2==0) 
				sum=sum-i;
			else 
				sum=sum+i;
		} System.out.println (sum);
	
		 
		
		
		
		
	}
	
} 
	

