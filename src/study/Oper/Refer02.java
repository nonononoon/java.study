package study.Oper;

public class Refer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String day = "MONDAY";
		
		String day2 = "TUESDAY";
		
		String day3 = "FRIDAY";
		
		String today = "WEDNESDAY";
		
		if(today.equals(day3)) {
			System.out.println("퇴근준비");
		}
		
		Week day11 = Week.MON;
		Week day22 = Week.TUE;
		
		//if(day22 != Week.TUE) false 이므로 미출력
		if(day22 == Week.TUE) {
			System.out.println("화요일 ~ "); // true 이므로 화요일 ~  출력
		}
		
		Menu memu3 = Menu.JMP; 
		
	}

}
