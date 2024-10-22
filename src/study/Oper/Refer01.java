package study.Oper;

import java.util.Scanner;

public class Refer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0 ; // 값 0 출력 0
		int n; // 값 x 출력 x 

		String s1; // 값 x 출력 x 
		String s2 = null; // // 값 null 출력 null 빈주소 뜻함 
		
		System.out.println(s2);		
		
		
		Scanner scanner = new Scanner (System.in);
		
		String str1 = "아침" ;
		String str2 = "아침" ;
		String str3 = scanner.nextLine(); // 아침 입력 
		String str4 = new String("아침");
		
		System.out.println (str1 == str2);	// true 주소비교 
		System.out.println (str1.equals(str2)); // true 아침 이라는 값 비교
		
		System.out.println(str3 == str2); // false 입력 받을시는 값이 똑가더라도 새로운 주소 생성 
		System.out.println(str3.equals(str2)); // true 아침 이라는 값 비교
		
		System.out.println(str1 == str4); // false new 연산자는 새로운 주소 생성
		System.out.println(str3.equals(str2)); // true // 아침 이라는 값 비교
		
		String test = null; // 주소 없는디 ? NullPointerException 오류뜸
		System.out.println(test.equals("널이냐"));
		
		int n1 = 10;
		int n2 = n1; // 값 동일
		
		String ss1 = "점심";
		String ss2 = ss1; // 주소가 동일
		
		
		
		
	}

}
