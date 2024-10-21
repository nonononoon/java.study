package study.Oper;

public class iteration03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	for(int i=1; i<=5; i++) { 
			
			//실행문 
			System.out.println("for i 내부 실행문 시작" + i);
			for(int j=1; j<=3; j++) {
				System.out.println("for j 실행문 " + j);
			}
			System.out.println("for i 내부 실행문 끝" + i);
		} */
		
		for(int i =0; i<3; i++) {
			for(int j=1; j<=2; j++) {
				System.out.println("방 쓸자");
				for(int l=1; l<=3; l++) {
					System.out.println("방 닦기");
					for(int m=1; m<=1; m++) {
						System.out.println("쓰레기정리");
					}
				}
			}
			
		}
		
	}
	
}


