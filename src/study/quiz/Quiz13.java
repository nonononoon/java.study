package study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		/* 국어 영어 수학 세과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 
		 * 이를 이용하여 합격인지 불합격인지 처리하는 기능을 구현하세요 
		 *  int 생성 ★
		 *  조건식  ★
		 * (합격조건 세 과목의 점수가 각각 40점이상 이면서 평균이 60점 이상인경우) ★
		 * 합격시 합계: 평균: 축하합니다 합격입니다 출력하고 
		 * 불합격시 불합격입니다 출력하기
		 */
		
	   Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수: " );
		int lang = scanner.nextInt();
		System.out.print("수학 점수: " );
		int math = scanner.nextInt();
		System.out.print("영어 점수: " );
		int english = scanner.nextInt();
		int total = lang+math+english;
		double average = (double)total/3;  
		
		if(lang>=40 && math>=40 && english>=40 && average>=60 ) {
			System.out.println("합계 : " + total );
			System.out.println("평균 : " + average );
			System.out.println(" 축하합니다 합격입니다 " );
		} else 
			System.out.println(" 불합격 입니다 ");  
		
		/* 출생년도와 주민등록번호 뒷자리 첫번째 숫자를 입력받아서, 나이와 성별을 출력하세요.
		 * int 생성 ★ 기준은 2024년으로 함. 나이는 단순하게 2024년과의 차이로 함 (만 나이, 월 따지지 않음) ★
		 * 조건식  ★ 2000년생 이후로는 뒷자리 남자 : 3, 여자 : 4  ★
	     * 조건식  ★ 2000년생 이전은 뒷자리 남자 : 1, 여자 : 2  ★
	     * 그 외에 케이스가 들어오면 잘못된 입력이라고 출력하도록 처리.
	     * 어떤 경우가 잘못된 경우일지 한번 생각해보세요~
		 */ 
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.print(" 출생년도를 입력하세요 ");
		int year = scanner1.nextInt();
		System.out.print(" 주민번호 뒷자리 첫번째 숫자를 입력하세요 ");
		int backNumber = scanner1.nextInt();
		int age = 2024-year+1 ;
		
		if (year < 2000 && backNumber ==2 ) {
			System.out.println(" 결과 : " + age + "살" + "여자입니다" );
		} else if (year < 2000 && backNumber ==1 ) {
			System.out.println(" 결과 : " + age + "살" + "남자입니다" );
		} else if (year >= 2000 && backNumber ==4 ) {
			System.out.println(" 결과 : " + age + "살" + "여자입니다" );
		} else if (year >= 2000 && backNumber ==3 ) {
			System.out.println(" 결과 : " + age + "살" + "남자입니다" );
		} else
			System.out.println ("잘못 입력했습니다");       
			              
		/*  윤년이란?
		지구가 태양을 한 번 공전하는 데 걸리는 시간을 일 년으로 두었는데,
		사실은 그 시간이 365일이 아닌 365일 5시간 49분 가량이다.
		일 년에 5시간 49분씩 4 년이 지나면 약 하루가 되는데,
		이를 맞추기 위해 4 년마다 한 번씩 2월을 하루 늘리고 이를 윤년이라 한다.
		단, 이렇게 계산하게 되면 매년 11분 가량이 초과되어 계산된다.
		이는 131년이 지나면 하루(대략 400년에 3일)가 되기 때문에 대부분의 국가에서 반영하는
		그레고리력에서는 400년에 3일을 제외시키기 위해 100년마다 한 번 윤년을 없애고
		400년 마다 다시 하루를 추가해 윤년을 둔다. 정리하면 다음과 같은 방법으로 윤년을 계산할 수 있다.
		조건식 생성 ★
		☞ 연도가 4로 나누어 떨어지면 윤년이다. ex) 2020년, 2024년, 2028년, ...
		☞ 연도가 100으로 나누어 떨어지면 윤년이 아니다. ex) 2100년, 2200년, 2300년, ...
		☞ 연도가 400으로 나누어 떨어지면 윤년이다. ex) 2000년, 2400년, 2800년, ...
		
		예를 들면 2000년은 100의 배수이지만 400으로 나누어 떨어지기 때문에 윤년이다.
		
		년도를 입력받아서 윤년인지 아닌지의 여부를 출력하세요.  */
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.print("년도를 입력하세요");
		int year1 = scanner3.nextInt();
		
		if (year1%400==0) {
			System.out.println (year1 + "은" + " 400으로 나누어 떨어지기 때문에 윤년이다");
		} else if (year1%100==0) {
			System.out.println (year1 + "은" + " 100으로 나누어 떨어지기 때문에 윤년이 아니다");
		} else if (year1%4==0) {
			System.out.println (year1 + "은" + " 4로 나누어 떨어지기 때문에 윤년이다");
		} else 
			System.out.println (" 윤년이 아니다 ");
		
		/* // 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		   조건식 생성 ★
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다. */
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.print(" 1~24 정수를 입력하세요 ");
		int time = scanner4.nextInt();
		
		if (time<=12 && time<=6) {
			System.out.println ("오전입니다");
			System.out.println ("이른오전입니다");
		} else if (time<=12 && time<=12) {
			System.out.println ("오전입니다");
			System.out.println ("늦은오전입니다");
		} else if (time>12 && time<=18) {
			System.out.println ("오후입니다");
			System.out.println ("이른오후입니다");
		} else if (time>12 && time<=24) {
			System.out.println ("오후입니다");
			System.out.println ("늦은오후입니다");
		} else
			System.out.println ("잘못입력했습니다"); 
		
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
