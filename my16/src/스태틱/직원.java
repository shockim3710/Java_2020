package 스태틱;

public class 직원 {
	
	String name;
	String s;
	int age;
	static int count;
	static int sum;
	
	public 직원(String name, String s, int age) {
		
		count++;
		sum = sum + age;

		this.name = name;
		this.s = s;
		this.age = age;
	}
	
	public String toString() {
		return "직원 [이름: " + name + ", 성별: " + s + ", 나이: " + age + "]";
	}
	
	public static int avg() { 
		
		// static 메소드는 객체생성 하지않아도
		// 클래스 이름으로 접근해서 사용가능
		
		return sum / count;
		
	}

}
