package cls.cls02;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car(); // 생성자 부르고   //  Car 생성자 호출됨 출력 
		Car car2 = new Car(); // 생성자 부르고  //  Car 생성자 호출됨 출력 
		Car car3 = new Car(); // 생성자 부르고  //  Car 생성자 호출됨 출력 
		
		// new Car();  ==> 생성자 호출
		// Car 라는 class 객체에 대한 인스턴스 만든게 car1
		
		System.out.println("main 끝"); // main 끝 출력
		
		
		System.out.println(car1.color); // null 출력 // 노랑출력 (필드값 노랑으로 바꿈)
		car2.color = "파랑";
		System.out.println(car2.color); // 파랑 출력 (필드값 노랑이지만 파랑으로 변경하기로 했기때문에 파랑 그대로 출력)
		
		System.out.println(car3.color); // 노랑 출력 (필드값 노랑으로 바꿈)
		System.out.println(car3.price); // 0 출력

		int num=10;
		
		Car car4 = new Car("모닝");
		System.out.println(car4.model); // 모닝 출력
		System.out.println(car4.color); // null 출력 
		
		Car car5 = new Car("캐스퍼" , "회색"); // String 타입에 대한 매게변수 2개 필요 
		System.out.println(car5.model); // 캐스퍼 출력
		System.out.println(car5.color); // 회색 출력
	}

}
