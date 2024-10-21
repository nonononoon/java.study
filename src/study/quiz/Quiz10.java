package study.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		윤년이란?
		지구가 태양을 한 번 공전하는 데 걸리는 시간을 일 년으로 두었는데,
		사실은 그 시간이 365일이 아닌 365일 5시간 49분 가량이다.
		일 년에 5시간 49분씩 4 년이 지나면 약 하루가 되는데,
		이를 맞추기 위해 4 년마다 한 번씩 2월을 하루 늘리고 이를 윤년이라 한다.
		단, 이렇게 계산하게 되면 매년 11분 가량이 초과되어 계산된다.
		이는 131년이 지나면 하루(대략 400년에 3일)가 되기 때문에 대부분의 국가에서 반영하는
		그레고리력에서는 400년에 3일을 제외시키기 위해 100년마다 한 번 윤년을 없애고
		400년 마다 다시 하루를 추가해 윤년을 둔다. 정리하면 다음과 같은 방법으로 윤년을 계산할 수 있다.
		
		☞ 연도가 4로 나누어 떨어지면 윤년이다. ex) 2020년, 2024년, 2028년, ...
		☞ 연도가 100으로 나누어 떨어지면 윤년이 아니다. ex) 2100년, 2200년, 2300년, ...
		☞ 연도가 400으로 나누어 떨어지면 윤년이다. ex) 2000년, 2400년, 2800년, ...
		
		예를 들면 2000년은 100의 배수이지만 400으로 나누어 떨어지기 때문에 윤년이다.
		
		년도를 입력받아서 윤년인지 아닌지의 여부를 출력하세요. 
		*/
		
		
		
	   Scanner scanner = new Scanner(System.in);
	   System.out.print(" 년도 입력 : ");
		int year = scanner.nextInt(); 
		
		if (year%400 == 0) { 
			System.out.println("윤년이다");
		} else if  (year%100 == 0) {
			System.out.println("윤년이 아니다");
		} else if (year%4 == 0 ) {
			System.out.println("윤년이다");  //우선순위 먼저 
		} else 
			System.out.println("윤년이 아니다");  //모든경우 벗어났을때 아니다 
		
		
		/* if (year%400 == 0 || (year%4==0 && !(year%100==0) ) ) { 
		 * System.out.println("윤년이다");
		 * } else 
			System.out.println("윤년이 아니다");
		 */
		

		


	

		
		
		/* 
		※규칙을 찾아보고 작성
		1) 반복문 1개로 결과 만들기
		2)반복문 2개 중첩해서 결과만들기
		
		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
		12345
		12345
		12345
		12345
		12345
		
		//2.
		11111
		22222
		33333
		44444
		55555
		*/
		
	/*	for (int i =1; i <=5; i++) {
				System.out.println(12345);
		}  */
		
		
		
	/*	for (int i =1; i <=5; i++) {
			for (int j =1; j<=5; j++) {
				System.out.print(j);
			} System.out.println("");
	 } 
		*/
		
	/*	for (int i =1; i <=5; i++) {
			for (int j=1; j<=5; j++)
				System.out.print(i);
			System.out.println("");
		}  */
		
	/* for (int i =1; i <=5; i++) {
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
				System.out.println("");
				
				다른방법으론 
				for (int i =11111; i <=55555; i=i+11111) {
				System.out.print(i);
				}
		} */ 
		
		
	}
}
