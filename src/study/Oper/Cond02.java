package study.Oper;

public class Cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int dice = 6 ;
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		}
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		} else {
			System.out.println("주사위 수 대로 전진");
		}
		
		
		
		if (dice == 1) {
			
		} else if (dice == 2) {
			// 이부분이 true 면 이부분이 실행 후 끝
			
		} else if (dice == 3) {
			
		} else  if (dice == 4){
		
		} else if (dice == 5) {
			
		} 
		
		
		
		switch(dice) {
		case 1 :   // dice == 1
			System.out.println("case1");
		case 2 :   // dice == 2  이부분이 true면 밑에 부분이 전체 실행
			System.out.println("case2");
		case 3 :   // dice == 3 
			System.out.println("case3");
			break; // 멈추고 나가라~
			
		case 4 :   // dice == 4 
			System.out.println("case4");
			break; // 멈추고 나가라~
		case 5 :   // dice == 5
			System.out.println("case5");
			break; // 멈추고 나가라~
			default:  // else if 끝낼수도 있고 혹은 else 로 끝내도됨
				System.out.println("default");//else 같은 의미 위에 내용에 없으면 이걸 실행하겠다~
			
		}
		
		//8시출근:청소  9시출근:회의  10시출근:업무 11시출근:외근
		
		int showTime = 8;
		
		if (showTime <= 8 ) {
			
		} 
		if (showTime <= 9 ) {
			
		}
		if (showTime <= 10 ) {
			
		}
		if (showTime <= 11 ) {
			
		}
		
		
		if (showTime <= 8 ) { 
			//청소 회의 업무 외근
			
		} else if (showTime <= 9 ) { 
			//회의 업무 외근
			
		} else if (showTime <= 10 ) {
			//업무 외근
			
		} else if (showTime <= 11 ) {
			//외근
		}
		
		switch (showTime ) {
		case 8:
			//청소 회의 업무 외근 
		case 9:
			// 회의 업무 외근 
		case 10:
			// 업무 외근 
		case 11:
			// 외근
		}
		
		switch (showTime ) {
		case 8:
			// 청소
			break;  // <- 청소만 실행 
		case 9:
			// 회의
		case 10:
			// 업무
		case 11:
			// 외근
		}
		
		int goBadTime = 21; // 잠든시간
		int sleepTime = 9; // 잔 시간
		
		if(goBadTime <= 21) {
			// 일찍 잤구낭 	
			if(sleepTime >= 9) {
				// 많이 잤구나 
			} else {
				// 조금 잤구나
				
			}
			
		} else {
			// 늦게 잤구나
		if(sleepTime >=9) {
			// 많이 잤구나
			
		} else {
			// 조금 잤구나
			
		}
	
		}
			if (goBadTime <= 21 && sleepTime >= 9) {
				// 일찍 많이
			} else if (goBadTime <=21 && ! (sleepTime >=9) ) {
				// 일찍 조금
			} else if (goBadTime > 21 && sleepTime >=9 ) {
				
			}
		
	}

}
