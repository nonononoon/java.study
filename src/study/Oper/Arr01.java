package study.Oper;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score1 = 100;
		int score2 = 85;
		int score3 = 75;
		int score4 = 65;
		int score5 = 40;
		
		int sum = 0 ;
		sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;
		
		System.out.printf("총점:%d 평균:%.2f\n" , sum, avg);				
		
		/* sum = sum + score1; 반복문 기준 
		 * sum = sum + score2;
		 * sum = sum + score3;
		 * sum = sum + score4;
		 * sum = sum + score5;
		 */
		
		//scores scoreArr  scoreArray // 변수명 정할때 배열이라고 알수있게 정하기
		int[] scoreArr = {100, 85, 75, 65, 40}; // 인덱스배열선언
		//		indexs	=	0  1   2   3   4
		sum = 0;
		sum = scoreArr[0] + scoreArr[1] + scoreArr[2]
				+ scoreArr[3] + scoreArr[4];
		
		sum = 0;
		sum = sum + scoreArr[0];
		sum = sum + scoreArr[1];
		sum = sum + scoreArr[2];
		sum = sum + scoreArr[3];
		sum = sum + scoreArr[4];
		
		sum = 0;
		for(int i=0; i<5; i++) {
			// 배열길이가 5개라서 5로 설정함  
			sum = sum + scoreArr[i];
		}				// 0 + 1 + 2 + 3 + 4 
		System.out.println("총합: " + sum);
		
		int[] pointArr = null;
		pointArr = new int[] {1, 2, 3, 4, 5}; // 가능
		
		pointArr = new int[5]; // 3개 배열 만들꺼다 라고 미리 선언 
		pointArr[0] = 1;
		pointArr[1] = 2;
		pointArr[2] = 3;
		pointArr[3] = 4;
		pointArr[4] = 5;
		
	     //	(double) 강제변환 int 정수이므로   
		
		for(int i=0; i<5; i++) {
			
			pointArr[i] = i+1;
		}          //  0= 0+1  1=1+1 2=2+1
		
		
		for(int i=1; i<=5; i++) {
			
			pointArr[i-1] = i;  

		}
		
		for (int i=0; i<5; i++) {
			System.out.print (pointArr[i] + " ");
		}   
			System.out.println();  // 1 2 3 4 5 출력
		
			
			
			int[] intArr = new int[5];
			double[] doubleArr = new double[10];
			String[] strArr = new String[30];
			boolean[] boolArr = new boolean[4];
			
			
			// 기본값 설정 안하면 초기값 셋팅 됨 
			
			for(int i=0; i< intArr.length; i++) {
				         // 0 1 2 3 4 
				System.out.print(intArr[i] + "");
			}
			System.out.println();
			
			for(int i=0; i< doubleArr.length; i++) {
							// 0 1 2 3 4 ... 9
				System.out.print(doubleArr[i] + "");
			}	
			System.out.println();
			
			for(int i=0; i< strArr .length; i++) {
				         // 0 1 2 3 4 ... 29
				System.out.print(strArr[i] + "");
			}	
			System.out.println();
			
/*			
			boolArr[2] = true; // falsefalsetruefalse
			for(int i=0; i< boolArr .length; i++) {
				       // 0 1 2 3  
				// falsefalsefalsefalse 
				System.out.print(boolArr[i] + "");
			}	
			System.out.println();*/
			
		
			
		
	}

}
