package study.quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		    +자연수 (정수) 5개의 수를 차례대로 입력 받는다.
			몇번째 수인가요? : 그에 해당하는 수를 출력
			ex) 10 20 30 50 90
			몇번째 수인가요? 5
			결과 : 90
		 */
		
    	Scanner scanner =  new Scanner (System.in);
     	
	/*	
		int[] numArr  = new int[5];  // 5개 받아야함 
		// 정수 인게 확실하게 때문에 
		
		System.out.print("자연수를 입력하세요");
		
	//	numArr[0] = scanner.nextInt();
	//	numArr[1] = scanner.nextInt();
	//	numArr[2] = scanner.nextInt();
	//	numArr[3] = scanner.nextInt();
	//	numArr[4] = scanner.nextInt();
		
		
		for (int i= 0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();		
			} 	
			System.out.print("몇번째 수 인가요? : ");
			int index = scanner.nextInt();	 
			System.out.print("결과 : " + numArr[index-1]); */
		
    	int[] numArr  = new int[5];
    	
    	System.out.print("자연수를 입력하세요");
    	
    	for (int i= 0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();		
		}
    	
    	System.out.print("결과 : ");
    	for (int i=4; i>=0; i--) // 거꾸로 출력 
    		{ System.out.print(numArr[i] + " ");
		} 

		

	 /* 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1 2 3 4
		5 6 7 8
		9 10 11 12
		13 14 15 16  */
   
		int [][] num = {   {1,2,3,4} , {5,6,7,8} , 
				{9,10,11,12} , {13,14,15,16}  };
		
		for (int i=0; i<num.length; i++) {
			for (int j=0; j<num.length; j++) {
				            // j<4; 해도됨 
				System.out.print(num[i][j] + "");
			}
			System.out.println("");
		} 
		
		
		
		
		
		
		
		
		
		
			
			
		
		
		
	}

}
