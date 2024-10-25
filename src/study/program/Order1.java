package study.program;

import java.util.Scanner;

public class Order1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("메뉴 선택 : ");
		int menu;
		int count;
		String order;
		// 수량 변수 선언  (누적수량) 
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		
			while (true) {
				System.out.println("==========메뉴==========");
				System.out.println("1. 아메리카노\t3500원 ");
				System.out.println("2. 카페라떼\t4100원 ");
				System.out.println("3. 바닐라라떼\t4300원 ");
				System.out.println("=======================");
				
				
				System.out.print("메뉴 선택 : ");
					menu = scanner.nextInt();
					if(menu ==1 || menu ==2 || menu ==3) {
						
	
					System.out.print("수량 선택 : ");
					count = scanner.nextInt();
					
					if(menu == 1)
						menu1Count += count;
					
					if(menu == 2)
						menu2Count += count;
					
					if(menu == 3)
						menu3Count += count;
					
					
					
					
					scanner.nextLine();
					System.out.print("추가 주문하시겠습니까? (y/n): ");
					order = scanner.nextLine(); 
					
					if(order.equals("y") || order.equals("n")) {
						break;	
					} else 
						System.out.println("잘못입력하셨습니다. 다시 입력하세요. ");
					
					if(order.equals("n")) {
						
						
					 if(menu1Count > 0)
						 System.out.printf("아메리카노 %d잔 : %d원\n" , menu1Count, menu1Count*3500);
					 if(menu2Count > 0)
						System.out.printf("카페라떼 %d잔 : %d원\n" , menu2Count, menu2Count*4100);
					 if(menu3Count > 0)
						System.out.printf("바닐라라떼 %d잔 : %d원\n" , menu3Count, menu3Count*4300);
						int total = menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
						System.out.println ("총액 : " + total + "원" );
					   
						break;	
					}
		
					
					}else {
						System.out.println("잘못입력하셨습니다. 다시 입력하세요. ");
				}	
					
					
					
					
					
					
					
					
					
				
						
					}	
			
			
			
	
	
	
	

		
		
	    
	}

}
