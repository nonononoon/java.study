package study.Oper;

public class iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* for ( 초기; 조건; 증감; ) {
		 	실행문;
		  }
		  
		   
		   while(조건) {
		   	 실행문;
		   }
		   
		*/
				
		// for 
		
	/*	for ( int i = 1; i<=5; i++) { // 초기; 조건; 증감;
			System.out.println("피곤하다");
		}
		*/
		
		// while 
		
	    int j = 1; // 초기화 부분 앞에 미리 적어야함 
		while(j<=5) { // 조건식
			System.out.println("자고싶다"); // 무한반복 .. 
			j++; // 증감식 
			break;
		}	
		
	       while(true) {
			System.out.println("무한반복"); 
			break;
		} // 그 이후 코드 실행 안될수 있기때문에 조심 해야 함 
		
		int k = 10;
		do {
			System.out.println("k do while");
		} while(k<5); // 한번은 실행 후 false 이기에 더 이상 실행 x
		
		
		k = 1;
		while(true) {
		//	System.out.println(k); 
			k++; // 무한루프
		/*	k++; 
		System.out.println(k); 순서가 바뀌면 2 3 4 5 6 7 8 9 10 */
	
			if(k == 10) { // k가 10이 되는 순간 break;
				break; // 멈추기 
			}
				
		
		
		
		for(int i=1; i<=10; i++) {
			
			// 1 2 3 4 5 6 7 8 9 10
			
		/*	if(i==5)
				break;
			// 1 2 3 4 5 */ // 5에서 break
			if(i==5)
				continue;
			
			System.out.println(i);
			// 1 2 3 4 6 7 8 9 10 // continue 인 5 제외 하고 그 밑 실행 
			
		}
		
		
		}
		
		for (int i = 1; i<=5; i++) {
			
			for (int m = 1; m<=i; m++) {
				System.out.println("*");
		}
		
				
			
			
		}
	}
}

	

			
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



