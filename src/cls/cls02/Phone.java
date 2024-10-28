package cls.cls02;

public class Phone {

	//필드
	String model; // 기본값 x, 무조건 필요 o
	int price; // 기본값 : 100
 	int battery;  // 기본값 : 3000
	
	
	//기본생성자
//	Phone(){
		
//	}
	
	Phone(String model){
		this(model,100,3000);  // model 넘어왔고 
//		this.model = model;
//		this.price = 100;
//		this.battery = 3000;
	}
	
	Phone(String model , int price){
		this(model,price,3000);  // model 넘어왔고 , price 넘어왔음 
//		this.model = model;
//		this.price = price;
//		this.battery = 3000;
	}
	Phone(String model, int price, int  battery){ // 호출 
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
}
