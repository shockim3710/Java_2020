package 실무클래스;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add(100);
		list.add(11.22);
		list.add(false);
		list.add('남');
		
		System.out.println(list);
		System.out.println(list.size() + "개");
		
		list.remove(3);
		
		System.out.println(list);
		System.out.println(list.size() + "개");
		
	}

}
