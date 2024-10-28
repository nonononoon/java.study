package study.quiz;

public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int [][] arr = new int [4][4];
		int num=1;
		
		for (int i=0; i<arr.length; i++)
				   //	i<4;
		{
			for (int j=0; j<arr.length; j++)
							//	j<4;
			{
				          
				arr[i][j] = num;
				num++;
			}
		}	
				
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		} 
		
		int [][] arr1 = new int [4][4];
		int num1=1;
		
		for (int i=0; i<arr1.length; i++)
				   //	i<4;
		{
			for (int j=0; j<arr1.length; j++)
							//	j<4;
			{
				          
				arr1[j][i] = num1;
				num1++;
			}
		}	
				
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1.length; j++) {
				System.out.printf("%3d", arr1[i][j]);
			}
			System.out.println();
		} 
	
		
		int [][] arr = new int [4][4];
		int num=16;
		
		for (int i=0; i<arr.length; i++)
				   //	i<4;
		{
			for (int j=0; j<arr.length; j++)
							//	j<4;
			{
				          
				arr[i][j] = num;
				num--;
			}
		}	
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		
		}
		*/
		
		

		int [][] arr = new int [4][4];
		int num=16;
		
		for (int i=0; i<arr.length; i++)
				   //	i<4;
		{
			for (int j=0; j<arr.length; j++)
							//	j<4;
			{
				          
				arr[j][i] = num;
				num--;
				System.out.printf("%3d", arr[i][j]);
			}
		}	System.out.println();
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		
		}

	}			
		
		
	

}
