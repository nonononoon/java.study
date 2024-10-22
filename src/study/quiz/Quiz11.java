package study.quiz;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner =  new Scanner (System.in);
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요");
		int number = scanner.nextInt();
		
		int age = 2024 - year + 1 ; // 한국 나이 계산
		
		if (year < 2000 && number == 1) 
		{	System.out.print ( age + " 살 남자입니다. ");
		} else if ( year < 2000 && number == 2)
		{    System.out.print ( age + " 살 여자입니다. ");
		} else if ( year >= 2000 && number == 3) {
			System.out.print ( age + " 살 남자입니다. ");
		} else if ( year >= 2000 && number == 4) {
			System.out.print ( age + " 살 여자입니다. ");
		} else {
			System.out.print(" 잘못된 입력입니다 . ");
		}
			
		
		
	}

}
