package StringClass;

public class Exam1 {
	//String클래스는 문자열을 다룰때 사용하는 클래스
	//String클래스는 불변클래스 이다.
	
	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);
		
		//문제발생 사례
		String str3 = str1 + str2;
		System.out.println(str3);
		//문자열과 문자열을 더하게 되면 내부적으로는 다음과 같은 코드가 실행
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		
		
		//문자열을 반복문 안에서 더하는 것은 성능상 문제가 생길 수 있으니 반드시 피하자.
		//성능상 문제생길 수 있는 예제 소스
		String str5 = "";
		for(int i=0; i<100; i++) {
			str5 =str5+"+";
		}
		System.out.println(str5);
		
		//위예제 개선 소스
		StringBuffer sb = new StringBuffer();
		for(int i =0; i<100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
	}
}
