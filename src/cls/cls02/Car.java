package cls.cls02;

public class Car {
	
	// Car 라는 class 객체가 가지고 있는 필드 (속성)
	String model;  // 모델 null => 초기값생성 안했기 때문에 null
	String color; // 색깔 null => 초기값생성 안했기 때문에 null
	int price; // 가격 null => 초기값생성 안했기 때문에 null
	
	// 기본 생성자
	Car() { // 객체 생성 후 초기에 해야할 일 / 필드의 초기화 (필드변수에 저장할 값 세팅)
		System.out.println("Car 생성자 호출됨");
		color = "노랑"; // String color; 값이 노랑이됨 
	}
	
	// Car(){} 아무것도 없는 애들은 굳이 생성안해도 기본생성자 알아서 생김 
	
	Car(String m) 
	{
		System.out.println("매개변수 생성자 호출");
		model = model; // m 전달받은변수
	}

	Car(String model, String color) 
	{
					// model 매개변수에 대한
		this.model = model; // m 전달받은변수
		this.color = color;
		// this.model 필드값에 대한 
	}
}
