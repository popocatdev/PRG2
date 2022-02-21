package StringBuffer;

public class Exam1 {
	
	public static void main(String[] args) {
		// 스트링버퍼 : 아무 값도 가지고 있지 않은 StringBuffer객체를 생성
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		
		String str = sb.toString();
		System.out.println(str);
		
		
		// StringBuffer가 가지고 있는 메소드들은 대부분 자기 자신, this를 반환
		// 자기 자신의 메소드를 호출하여 자기 자신의 값을 바꿔나가는 것을 메소드체이닝 이라고 한다
		// StringBuffer클래스는 메소드 체인 방식으로 사용할 수 있도록 만들어져 있다.
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("Hello");
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
		
		String str2 = new StringBuffer().append("Hello").append(" ").append("World").toString();
		
		System.out.println(str2);
		
	}
}
