package study.Oper;

public class iteration01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("월요일");       // 1회 출력
		
		for(int i=1; /*초기화*/ i<=10; /*조건식*/ i++ /*증감식*/) {
			System.out.println("화요일"); // 10회 반복 출력 반복 횟수는 그 횟수만큼 형태 맞춰주면됨
		}														
		for(int i=35; i<45; i++) { // 10회 반복 출력 조건식 다른 방법 
			// 35 36 37 38 39 40 41 42 43 44
			System.out.println("수요일");
		}
		                   // j=j+1 해도됨
		for(int j=1; j<=5; j++) {
			// 1 2 3 4 5  
			System.out.println("오늘은 공부" + j + "일차");
		}
		
		
		// 10~100 까지 10단위 합 
		// 10 + 20 + 30 + ... 100
		int sum = 0; // 덧셈 연산 할때는 변수선언시 초기값은 0으로 하는게 좋음
		
		for( int n =10; n <=100;  n=n+10 ) {
			sum = sum + n;
			// +10 
			// +20 
			// ... +100 
		}
		System.out.println("10~100까지 (10단위) 합 : " + sum);
		// sum = 0 변수값 저장후 필요없으면 밑에서 부터 sum 다시 초기화 하면됨
		// sum 도 쓰고 sum 을 또 쓰고 싶으면 sum2 = 0 이런식으로 다시 변수선언후 초기화
		
		// 1 2 3 4 5 6 7 8 9 10 반복 
		 // 10 20 30 40 50 60 70 80 90 100
		for( int n =1; n <=10;  n++ ) {
			sum = sum + (n*10);
		} System.out.println("10~100까지 (10단위) 합 : " + sum);
		// 1100 이 나온 이유는 28~29라인에 sum 값이 550이 나와있기때문에 550+550=1100나옴
		
		for(int k=2; k<20; k=k*2 ) {
			// k : 2 4 8 16 까지
		} 
		
		for(int k=400; k>100; k=k-50) {
			 // k = 350 300 250 200 150 까지
		}
		
		for(int k=100; k>=90; k--) {
			// k = 100 99 98 97 96 95 ... 91 90 까지
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}
