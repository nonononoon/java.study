package cls.cls01;

import java.util.Scanner;

public class StudentMain {

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int[] arr = new int[3];
		
		Student stu1 = null;
		stu1 = new Student();
		
		Student stu2 = new Student();
		// Student 로 부터 stu2 인스턴스 객체 생성 
		
		Scanner scanner = new Scanner(System.in);
		// Scanner 로 부터 stu2 인스턴스 객체 생성 
		
		stu1.name = "홍길동";
		stu2.name = "김길동";
		
		System.out.println(stu1.name);
		System.out.println(stu2.name);
		
		// 변수명 name 동일하지만 , 가지고 있는 값은 다름 
		
		stu1.grade =3;
		stu2.grade =5;
		
		System.out.println(stu1.grade);
		System.out.println(stu2.grade);
		
		
	}

}
