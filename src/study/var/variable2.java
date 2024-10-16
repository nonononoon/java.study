package study.var;

public class variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int num2 = 0b10;   //2
		int num8 = 012;   //10
		int num10 = 10;   //10
		int num16 = 0x30; //48
		
		char var1 = 'A';
		char var2 = 86;
		char var3 = 0x0123;
		
		char var4 = 'D'; // 'AD' X // "Q" X 작은따옴표 문자는 한개만 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		String menu = "점심메뉴"; 
		String subMenu = "123123"; // 12313; 숫자라서 x
		
		System.out.println(menu); //점심메뉴 출력
		System.out.println(subMenu); // 123123 출력
				
		System.out.println(var2 + 10); // 86 + 10 = 96 출력
		System.out.println(menu+subMenu);  // 더할수 없는 값이기에 점심메뉴123123 출력됨
		System.out.println(subMenu + 500);
		System.out.println(menu + var2);
		
		String msg = "\"안녕\"하세요";
		System.out.println(msg);
		
		double d1 = 12.12; 
		double d2 = 0.1212e2;
		float f1 = 12.12f; //float 사용시 뒤에 f 붙혀야함
		
		boolean stop = true; // 참
		boolean open = true; // 참
		boolean close = false; // 거짓
		
		

		
		
		
		

	}
	

}
