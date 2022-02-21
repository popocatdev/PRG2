package MathClass;

public class Exam1 {
	// Math클래스는 이름 그대로 수학계산을 위한 클래스
	// 코싸인, 싸인, 탄젠트, 절대값, 랜덤값을 구할 수 있는 클래스
	// Math클래스는 생성자가 private으로 되어 있기 때문에 new 연산자를 이용하여 객체를 생성할 수 없다.
	// 객체를 생성할 수는 없지만 모든 메소드와 속성이 static으로 정의되어 있기 때문에 객체를 생성하지 않고도 사용할 수 있다.
	public static void main(String[] args) {
		
		// 가장 큰값 계산
		int value1 = Math.max(5, 30);
		System.out.println(value1);
		
		//가장 작은값 계산
		int value2 = Math.min(5, 30);
		System.out.println(value2);
		
		//절대값 계산
		System.out.println(Math.abs(-10));
		
		//! 랜덤한 값 계산
		System.out.println(Math.random());
		
		// 제곱근
		System.out.println(Math.sqrt(25));
		
		int value6 = Math.max(5, 20);
        int value7 = Math.min(5, -5);
        int value8 = Math.abs(-10);
        double value9 = Math.random();
        double value10 = Math.sqrt(25);  
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
	}
	
}
