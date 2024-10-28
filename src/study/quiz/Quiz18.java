package study.quiz;

public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int [][] arr = new int [4][4];
		for (int i=0; i<arr.length; i++) 
			       //   i < 5
		{
			for (int j=0; j<arr[i].length; j++)
				       //   j < 5
			{
				if (i == j) {
					arr[i][j] = 1;
				} else if (i > j) {
					arr[i][j] = 3;
				}  else 
					arr[i][j] = 2;
			}
		}
	   for (int i=0; i<arr.length; i++) {
		for (int j=0; j<arr[i].length; j++) {
			System.out.print(arr [i][j] + " ");
		} 
		System.out.println();
		

	}			
			
			
	}

}
