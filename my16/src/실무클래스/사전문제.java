package 실무클래스;

import java.util.HashMap;

public class 사전문제 {

	public static void main(String[] args) {
		
		HashMap dic = new HashMap();

		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("melon", "메론");
		
		System.out.println(dic);
		System.out.println(dic.get("banana"));
		System.out.println(dic.get("apple"));

	}

}
