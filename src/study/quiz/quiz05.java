package study.quiz;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1번. num 값을 확인하여 "양수" "음수" "0" 이라고 출력하도록 코드를 작성하세요.
		
		int num = 0;
		System.out.println( num >  0 ? "양수" : (num < 0 ? "음수" : "0") ) ;
		
		
		/* 아래와 같이 프로그램이 진행되면서 숫자 2개를 입력받고 각각의 결과를 출력하세요.
		// ㅇ 모양은 사용자가 입력한 숫자와 계산된 결과입니다.
		// 나누기 결과는 소수점을 포함하여 나타나도록 해주세요.
		첫번째 숫자를 입력하세요 : ㅇ
		입력한 숫자=ㅇ
		두번째 숫자를 입력하세요 : ㅇ
		입력한 숫자=ㅇ */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int var1 = scanner.nextInt();
		
		System.out.println("입력한 숫자 : " + var1);
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int var2 = scanner.nextInt();
		
		System.out.println("입력한 숫자 : " + var2);
		
		System.out.printf ( "더하기 : %d+%d= %d " , var1 , var2 , var1+var2);
		System.out.printf ( "빼기 : %d-%d= %d " , var1 , var2 , var1-var2);
		System.out.printf ( "곱하기 : %d*%d= %d " , var1 , var2 , var1*var2);
		System.out.printf ( "나누기 : %d/%d= %f " , var1 , var2 , (double) var1/var2);
	
		

		
		
		
		
		
	}

}
