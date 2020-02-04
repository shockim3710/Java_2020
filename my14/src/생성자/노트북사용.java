package 생성자;

public class 노트북사용 {
	
	public static void main(String[] args) {
		
		노트북 n1 = new 노트북(1000); // new의 멤버변수에는 쓰레기값X
		노트북 n2 = new 노트북("삼성", 1000);
		
		System.out.println(n1);
		System.out.println(n2);

	}

}
