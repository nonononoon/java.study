package study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner scanner = new Scanner(System.in); 

		 	
		      for (int i=1; true; i++) {
               System.out.print("메뉴 번호를 입력하세요");
		 		 int num = scanner.nextInt();
			   if (num==1) {
				System.out.println("입력 메뉴입니다.");
			} else if (num==2) {
				System.out.println("수정 메뉴입니다.");
			} else if (num==3) {
				System.out.println("조회 메뉴입니다.");
			} else if (num==4) {
				System.out.println("삭제 메뉴입니다.");
			} else if (num==5) {
				System.out.println("종료 메뉴입니다.");
				System.out.println("프로그램이 종료됩니다.");
				break;
			} else
				System.out.println("잘못 입력하셨습니다.");
	}	 
		}	 
		 
		
		
		
		
		
		


}
