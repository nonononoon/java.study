package study.practice;

public class Monitor {

	// 필드선언(속성)
	int inch; // 인치수
	String make; // 제조사
	String model; // 모델명
	
	

	 /* 매개변수없는 기본생성자 Monitor() {} */
	
	
	// 매개변수 있는 생성자 초기화
	 Monitor(String  make, String model , int inch) 
	{
					// model 매개변수에 대한
		this.make = make; // m 전달받은변수
		this.model = model;
		this.inch =  inch;
	} 
	 
	 // 메소드 (동작/기능)
	 
	 void printInfo()
	 // 내가 가지고 있는 정보 출력
	 {
		 System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n",make , model, inch);
	 }
	

	
	
	
	
	
}
