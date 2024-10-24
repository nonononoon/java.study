package study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* 
	 * 2x + 4y = 10 이 만족하는
     모든 x, y 쌍을 구하시오.
     (x와 y는 자연수 1~10) 
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				if (2*x+4*y==10) {
					System.out.println (x + "," + y);
				}
			}
		}  
		*/
		
	/* 정수 2개를 입력 받아서,
       아래 계산 결과를 출력하시오.
       큰수 - 작은수  
		
	 Scanner scanner = new Scanner(System.in); 
	 System.out.println("정수를 입력하세요");
	 
	 int num1 = scanner.nextInt();
	 int num2 = scanner.nextInt();
	 
	 if (num2>=num1) {
		 System.out.println(num2-num1);
	 } else if (num2<=num1) {
		 System.out.println(num1-num2);
	 }
	 */
	 
	/* 
	 * 윷놀이 게임
	4개의 윷을 입력받고 결과를 출력하시오.
	(뒷도는 없습니다!)
	0 : 안 뒤집어진 상태
	1 : 뒤집어진 상태
	ex) 입력 0 0 1 0
	결과 도
	입력 0 1 0 1
	결과 개
	
	 Scanner scanner1 = new Scanner(System.in); 
	 System.out.println("윷놀이~");
	 
	 int number1 = scanner1.nextInt();
	 int number2 = scanner1.nextInt();
	 int number3 = scanner1.nextInt();
	 int number4 = scanner1.nextInt();
	 int total = number1+number2+number3+number4;
		
	 if (total==1) {
		 System.out.println ("도");
	 } else if (total==2) {
		 System.out.println ("개");
	 } else if (total==3) {
		 System.out.println ("걸");
	 }	else if (total==4) {
	 System.out.println ("윷");
	 }  else { 
		System.out.println ("모");
	 }*/
	 
	/*  4. 입력받은 수 만큼 별 출력하기
	 ex) 4
	 ****
	 5
	 *****  
		
	 Scanner scanner2 = new Scanner(System.in); 
	 System.out.println("숫자~");
	 int num = scanner2.nextInt();
	 
	 
	 for (int i =0; i<num; i++) {
		 System.out.print("*");
	 } *
	 */
	 
	 
  /*   4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
	ex) 입력 : 10
	결과 : ********** 
	 
	 Scanner scanner3 = new Scanner(System.in); 
	 System.out.println("숫자~");
	 int num1 = scanner3.nextInt();
	 
	 
	  if (num1<1 || num1>50 ) {
		 System.out.print("잘못입력했습니다");
	 } else 
		 for (int i=1; i<=num1; i++) {
			 System.out.print("*"); } 
	 
		
		

	 
	 for (int i=1; i<=5; i++) {
		 for (int j=1; j<=5; j++) {
			 System.out.print("*");
	 } 
	 System.out.println();
	 }
	 
	  */
		
		
	/* 4x+5y=60 x와 y는 10이하의 자연수 
		
		for (int x=1; x<=10; x++ ) {
			for (int y=1; y<=10; y++ ) {
				if (4*x+5*y==60) {
					System.out.println(x +  "," + y);
				}
			}
		} */
		
		
		// 1~100까지의 정수 중에서 3의 배수의 총합을 출력
		
	/*	int sum=0;
		for (int i=1; i<=23; i++) {
			if(i%3==0) {
				sum=sum+i; 
				System.out.println(sum);
			}
		} */
		
	//1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		int sum = 0;
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
				sum=sum+j;
			}		
		} System.out.println(sum);

		
		//6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		//100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		sum = 0;
		for (int i=1; i<=100; i++) {
			if (i%2==0) {
				sum= sum-i;
			} else if (i%2!=0) {
					sum= sum+i;
				}

		}  System.out.println(sum);
}
}