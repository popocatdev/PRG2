package StringBuffer;

import java.util.Random;

public class Exam2 {
	public String randomName() {
		StringBuffer sb = new StringBuffer();
		
		String[] firstNames = {"Tod", "John", "Michael"};
		String[] lastNames = {"Smith", "Brown", "Davis"};
		
		// 0~2 사이의 임의의 숫자 선택	
		int random1 = new Random().nextInt(3);
		// 랜덤하게 이름 뽑기
		String firstName = firstNames[random1];
		
		// 0~2 사이의 임의의 숫자 선택	
		int random2 = new Random().nextInt(3);
		// 랜덤하게 이름 뽑기
		String lastName = lastNames[random2];
		
		// sb에 이름(fistName) 공백(" ") 성(lastname) 순으로 append해 보세요.
        // 단 메소드 체이닝을 이용해야 합니다.
		String sb1 = new StringBuffer().append(firstName).append(" ").append(lastName).toString();
		
		return sb1;
	}
	public static void main(String[] args) {

	}
}
