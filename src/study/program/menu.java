package study.program;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		// 사용자가 1~5 숫자를 입력 하고 그에 맞는 메뉴 출력 
		// 5 숫자를 제외한 나머지 숫자는 무한반복으로 프로그램이 돌아가다가 5 숫자가 
		// 나오면 프로그램이 종료됩니다 멘트 출력 되면서 프로그램 종료 
		
		while (true) {
		System.out.println("1.입력 ");
		System.out.println("2.수정 ");
		System.out.println("3.조회 ");
		System.out.println("4.삭제 ");
		System.out.println("5.종료 ");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int number = scanner.nextInt();
		
		if(number==1) {
			System.out.println("입력 메뉴입니다. ");
		} else if (number==2) {
			System.out.println("수정 메뉴입니다. ");
		} else if (number==3) {
			System.out.println("조회 메뉴입니다. ");
		} else if (number==4) {
			System.out.println("삭제 메뉴입니다. ");
		} else if (number==5) {
			System.out.println("종료 메뉴입니다. ");
			System.out.println("프로그램이 종료됩니다. ");
			break;
		} else
			System.out.println("잘못 입력하셨습니다. ");
		}
		
		
		
		
		
	}

}
