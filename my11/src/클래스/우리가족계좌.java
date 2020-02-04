package 클래스;

public class 우리가족계좌 {

	public static void main(String[] args) {
		
		// 우리가족 계좌정보
		// ---------------------------
		// 이름		계좌이름		금액
		// ---------------------------
		// 홍길동		튼튼적금		1000
		// 홍기사		다음적금		3000
		// 홍길순		튼튼예금		2000

		
		// 입금하다, 출금하다
		// 아버지는 입금하다, 딸은 출금하다
				
		Bank father = new Bank();
		
		father.name = "홍길동";
		father.account = "튼튼적금";
		father.money = 1000;
		
		System.out.println(father);
		
		father.입금하다();
		
		
		Bank mother = new Bank();
		
		mother.name = "홍기사";
		mother.account = "다음적금";
		mother.money = 3000;
		
		System.out.println(mother);
		
		
		Bank d = new Bank();
		
		d.name = "홍길순";
		d.account = "튼튼예금";
		d.money = 2000;
		
		System.out.println(d);
		
		d.출금하다();
		

	}

}
