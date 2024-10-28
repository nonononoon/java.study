package cls.cls02;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p1 = new Phone("갤럭시"); // 기본생성자 
	    Phone p2 = new Phone("아이폰"); 
	    // p1 p2 와 같이 기본 생성자 만들때는 
	    
	    /*	Phone(String model){
		this.model = model; } 생성 해줘야함 */
	    
	    Phone p3 = new Phone("갤럭시" , 300, 4000); 
	    // 기본생성자 생성 안할때는 
	    
	    /* Phone(){} 생성 해줘야함 */
	    

	}

}
