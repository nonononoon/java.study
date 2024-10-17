package study.var;

import java.util.Scanner; 

public class Variable5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "test";
		
		System.out.println("출력 1");
		System.out.println("출력 2");
		System.out.println(s);
		
		System.out.print("출력 3");
		System.out.print("출력 4");
		System.out.print(s);
		
		
		
		int hour = 10;
		int munute = 26;
		System.out.println("현재 "+ hour + "시 " + munute + "분 입니다 ") ;
		System.out.printf("현재 %d시 %d분 입니다.\n" , hour , munute) ;
		
		double rate = 1.15512;
		
		System.out.printf("%10.2f %%" , rate ); // % 출력 하고싶으면 %% 2개 붙히면 됨 
		
		
		System.out.println();
		
		Scanner scanner = new Scanner (System.in);  // Scanner 사용시 이거 한줄이 기본임 
		
		System.out.print("입력하세요 : ");
		String input = scanner.nextLine(); // 아무거나 입력 
		System.out.println(input);
		
		System.out.println("당신이 입력한 값은 : " + input);
		System.out.printf("당신이 입력한 값은 : %s\n" + input);
		
		System.out.printf("점수를 입력하세요 : ");
		int point = scanner.nextInt();
		
		System.out.println(point);
		
		
	
	}

}
