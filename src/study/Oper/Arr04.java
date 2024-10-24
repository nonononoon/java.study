package study.Oper;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 배열 참조타입 vs int 기본타입
		
		/*	int a = 10;
		int b = a;
		System.out.println( a + " " + b);
		
		b=20;
		System.out.println( a + " " + b); */
		
		
		// 복사가 안된 케이스 
	/*	int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " "); //10 20 30 
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " "); //10 20 30 
		}
		System.out.println();
		
		arr2[0] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " "); //999 20 30
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " "); //999 20 30
		}
		System.out.println(); */
		
		
		// for 문으로 복사 된 케이스
	/*	int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[3]; // 새로운 주소 생성 
		// int 변수 기본값 초기값은 0
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
        arr2[0] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " "); 
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " "); 
		}
		System.out.println(); */
		
		// arraycopy 복사
		
	/*	int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[3];
		              //복사대상 위치 저장할대상 위치 갯수
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " "); //10 20 30 
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " "); //10 20 30 
		}
		System.out.println();
		
		arr2[0] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " "); //999 20 30
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " "); //999 20 30
		}
		System.out.println(); */
		
		
		
		//배열 항목 반복을 위해 향상된 for문
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i=0; i<5; i++) {
			System.out.print("arr["+ i + "]" + arr[i] + " " );
		} // 인덱스로 조절 가능함 i<5; 아닌 i<3 3만 돌수 있음 / 반복문 횟수 변경 가능
		System.out.println();
		
		   //값 들어있음 
		   // 변수명은 아무거나 써도됨
		for(int value : arr) {
			System.out.print(value + " "); //10 20 30 40 50 
			// 실제들어있는 값을 넣은거다 보니 처음부터 끝까지 반복 인덱스는 모름 
		}
		
		int index=0;
		for(int value : arr) {
			System.out.print(value + " ");
		    index++; //10 20 30 40 50 
		    // break; 
		    
		 int[] scores = {90, 95, 100, 80, 75};
		 int sum=0;
		 
		 for(int i=0; i<scores.length; i++) {
			 sum = sum + scores[i];
		 }
		    
		 sum = 0 ;
		for(int score : scores) {
			sum = sum + score;
		}
	  }
	}

}
