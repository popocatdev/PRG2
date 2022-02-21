//Object 클래스는 모든 클래스의 최상위 클래스
//equals : 객체가 가진 값을 비교할 때 사용
//toString : 객체가 가진 값을 문자열로 반환
//hashCode : 객체의 해시코드 값 반환
//사용자가 알맞게 오버라이딩 후 사용

package objectOverriding;

import java.util.Objects;

public class Student {
	String name;
	String number;
	int birthYear;
	
	//source > generate 
	//비교할 값 선택 후 run
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}


	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동 ";
		s1.number = "1234";
		s1.birthYear = 1995;
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.number = "1234";
		s2.birthYear = 1995;		
		
		if(s1.equals(s2))
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		System.out.println(s1);
		
		System.out.println(s1.toString());
	}
}
