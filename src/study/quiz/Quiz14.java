package study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
	
		int num = scanner.nextInt();
		
		if (num%7==0) {
			System.out.print(" 7의 배수입니다 ");
		} else 
			System.out.print(" 아닙니다 ");  */
		
		
		/* 3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기. 
		 * 누적합은 로컬 외부에 int sum = 0; 초기화 시켜주기
		
		int sum = 0;
		
		for (int i=1; i<=1000; i++) {
		// for(int i=5; i<=1000; i=i+5) 도 가능
			if (i%5==0) {
				sum= sum+i;
			} 
		
		} System.out.println (sum);  */
		
		
		
		/*
	
		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
	
		int num = scanner.nextInt();
		
		if(num%2==0) {
			System.out.print(" even ");
		} else  (num%2 !=0) {
			System.out.print(" odd ");
		} */
		
	
		
		
	Scanner scanner = new Scanner(System.in);
		System.out.print("구구단을 입력하세요 (1~9)");
		int mul = scanner.nextInt();
		
			System.out.println("***" + mul + "단" + "***");
				for(int j=1; j<=9; j++) {
					System.out.println( mul + "*" + j + "=" + (mul*j) );
				}

		
		
		
		
		/*/6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
			1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기. 
		
		for (int i=1; i<=500; i++) {
				System.out.println (i+i);
		} 
		*/
		
		/* 5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력. 
		ex) 1 - 2 + 3 - 4 ..... 	 
		
		int sum=0;
		for (int i=1; i<=10; i++) {
			if (i%2==0) 
				sum=sum-i;
			else 
				sum=sum+i;
		} System.out.println (sum);
		*/
		 
		
		
		
	}

}
