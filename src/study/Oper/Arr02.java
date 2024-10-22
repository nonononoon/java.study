package study.Oper;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] 1차원배열
		// int[][][] 3차원배열
		
		int[][] nArr1 = new int [3][5]; // 2차원배열 3행5열
		
		/*    0  1 2  3 4
		 *  0 ㅁ ㅁ ㅁ ㅁ ㅁ
		 *  1 ㅁ ㅁ ㅁ ㅁ ㅁ
		 *  2 ㅁ ㅁ ㅁ ㅁ ㅁ
		 */
		
		int[][] nArr2 = new int [2][3]; // 2행3열.
		// 기본값 0 
		 //     0  1 2
		//    0 ㅁ ㅁ ㅁ 
		 //*  1 ㅁ ㅁ ㅁ
		
		int[] nA = {1,2,3,4,5,6};
		int[][] nArr3 = {    {1,2,3,}, {4,5,6}   };
		
		System.out.println(nArr3[0][2]);
		
		
		
		
		for(int i=0; i<nArr3.length; i++) {
			
			for(int j=0; j<nArr3[i].length; j++) {
				       // j<nArr3[0].length; 해도됨 
				System.out.print(nArr3[i][j] + "");
			}
			System.out.println();
		}  
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		/*    0  1 2  
		 *  0 ㅁ ㅁ ㅁ 
		 *  1 ㅁ ㅁ ㅁ 
		 */
	}

}
