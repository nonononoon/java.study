package study.quiz;

public class Quiz09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	/*	1) i가 0~10으로 11번 반복 
	 * 0 1 2 3 4 5 6 7 8 9 10 
	2) i가 1~9로 9번 반복 1 2 3 4 5 6 7 8 9
	3) i가 10 ~ 100 으로 10번 반복 10 20 30 40 50 60 70 80 90 100
	4) i가 25 50 75 100 해서 4번 반복 */
		
		for (int i =0; i<=10; i++) {
			System.out.println(i);
		}
		
		for (int i =1; i<10; i++) {
			System.out.println(i);
		}
		
		for (int i =10; i<=100; i=i+10) {
			System.out.println(i);
		}
		
		for (int i = 25; i<=100; i=i+25) {
			System.out.println(i);
		}   
		
		/* 5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복 */
		
		int i = 50;                                
		while(i<=55) {
			System.out.println(i);
			i++;
		}
		
		int i1 = 10;
		while(i1>=1) {
			System.out.println(i1);
			i1--;
		} 
		
		int i2 = 30;
		while(i2>=0) {
			System.out.println(i2);
			i2= i2-5;
		} 
		
		int i3 = 30;
		while(i3>=5) {
			System.out.println(i3);
			i3= i3-5;
		} 
		
		int i4 = 25;
		while(i4>=0) {
			System.out.println(i4);
			i4= i4-5;
		}  
	

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
