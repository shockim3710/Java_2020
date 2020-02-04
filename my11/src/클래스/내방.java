package 클래스;

public class 내방 {

	public static void main(String[] args) {
		
	 // 내 방에 강아지 1마리 필요
	 // new를 하면 클래스의 멤버변수들이 RAM에 복사됨
	 // 클래스 객체
		강아지 dog = new 강아지();
		
		dog.age = 5;
		dog.color = "노랑";
		
		dog.꼬리를흔들다();
		dog.사람을잘따른다();
		System.out.println("----------------------");
		
		붕어빵틀 붕어빵1 = new 붕어빵틀();
		
		붕어빵1.두께 = "두껍게";
		붕어빵1.소 = "팥";
		
		붕어빵1.붕어빵을담다();
		붕어빵1.붕어빵을먹다();
		System.out.println("----------------------");
		
		붕어빵틀 붕어빵2 = new 붕어빵틀();
		
		붕어빵2.두께 = "얇게";
		붕어빵2.소 = "생크림";
		
		붕어빵2.붕어빵을담다();
		붕어빵2.붕어빵을먹다();
		System.out.println("----------------------");
		
		휴대폰 폰1 = new 휴대폰();
		
		폰1.기종 = "삼성갤럭시";
		폰1.색깔 = "파란색";
		
		System.out.println(폰1.기종);
		System.out.println(폰1.색깔);
		
		폰1.휴대폰을키다();
		폰1.전화를하다();		
		System.out.println("----------------------");
		
		휴대폰 폰2 = new 휴대폰();
		
		폰2.기종 = "애플아이폰";
		폰2.색깔 = "흰색";
		
		System.out.println(폰2.기종);
		System.out.println(폰2.색깔);
		
		폰2.휴대폰을키다();
		폰2.전화를하다();
		
		
	}

}
