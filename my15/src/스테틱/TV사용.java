package 스테틱;

public class TV사용 {

	public static void main(String[] args) {
		
		TV t1 = new TV("검정", 100);
		
		System.out.println(t1);
		System.out.println(TV.count + "대");
		
		TV t2 = new TV("파랑", 200);
		
		System.out.println(t2);
		System.out.println(TV.count + "대");
		
	}

}
