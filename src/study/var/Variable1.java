package study.var;

public class Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 변수 선언
		int number1;  // 정수형 숫자 변수
		int floor; // 선언만 한 상태 값은 x 
		
		int x,y,z;  // 같은 타입 변수 여러개 한번에 작성 가능
		
		int score; // 선언
		
		int point = 50; // 선언 + 값 저장 = 초기화
		
		score = 90;
		
		// level = 99; 선언하지 않은 변수명 사용 불가능 
		
		// time = 16; 선언 후 다음 줄에서 사용 해야 함 , 선언 전에는 사용 불가
		int time; // 선언
		time = 16;
		
		int minute = time + 9; 
					// 16 + 9 
		
		// int myFloor = floor + 7; 값이 없는 변수를 계산할수 없다
		
		int totalScore = point + point + score + point + score; // 변수는 한번 담은 후 지속 사용 가능 

		System.out.println("출력합니다.");
		System.out.println(totalScore);
		System.out.println(totalScore + point);
		
		System.out.println(totalScore);    //330
		totalScore = totalScore + point;   //380
		//	380 저장 <- totalScore =	330 + 50
		System.out.println(totalScore);    //380
		
		x = 10; //10
		y = x;  //x 이므로 10
		z = x + y; // 10+x=20
		
		int a = 10;
		int b = 20;
		
		// a : 10 , b : 20
		// a : 20 , b : 10
		
		/* 서로 값 바꾸기 실패
		a = b; // a:20 b:20
		b = a; // a:20 b:20
		*/
		
		int c = a; // a:10 b:20 c:10
		a = b; // a:20 b:20
		b = c; // a:20 b:20 c:10
		
		
		
		// main 이라는 메소드 한개에 다 적었기 때문에 전체 영향 y
	}

}
