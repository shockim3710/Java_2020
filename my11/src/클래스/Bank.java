package 클래스;

public class Bank {
	
	String name;
	String account;
	int money;
	
	public void 입금하다() {
		
		System.out.println("입금을 하셨습니다");
		
	}
	
	public void 출금하다() {
		
		System.out.println("출금을 하셨습니다");
		
	}
	
	
	

	@Override
	public String toString() {
		return "Bank [name=" + name + ", account=" + account + ", money=" + money + "]";
	}

}
