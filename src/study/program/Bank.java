package study.program;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자가 1~4 숫자를 입력 하고 그에 맞는 메뉴 출력 
		// 4 숫자를 제외한 나머지 숫자는 무한반복으로 프로그램이 돌아가다가 4 숫자가 
	    // 나오면 프로그램이 종료됩니다 멘트 출력 되면서 프로그램 종료 
		
		
		Scanner scanner = new Scanner(System.in);
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
		int value4 = value3+value1-value2;
		
		
		while(true) {
		System.out.println("-------------------------");
		System.out.print("1.예금 ");
		System.out.print("2.출금 ");
		System.out.print("3.잔고 ");
		System.out.println("4.종료 ");
		System.out.println("-------------------------");
		
		System.out.print("선택 : ");
		int number = scanner.nextInt();
		
		if (number==1) {
			System.out.printf ("예금액:%d원\n" , value1);
		} else if (number==2) {
			System.out.printf ("출금액:%d원\n" , value2 );	
		} else if (number==3) {
			System.out.printf ("잔고액:%d원\n" , value3 );	
		} else if (number==4) 	{
			System.out.println ("프로그램 종료");	
			break;
		} else
			System.out.println ("잘못입력했습니다");	
	
		
		}

	}

}
