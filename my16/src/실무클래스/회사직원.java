package 실무클래스;

import java.util.HashSet;

public class 회사직원 {

	public static void main(String[] args) {
		
		HashSet work = new HashSet();
		
		work.add("디자이너");
		work.add("프로그래머");
		work.add("DB관리자");
		
		System.out.println("팀원 목록 " + work);
		
		work.add("디자이너");
		
		System.out.println("팀원 목록 (중복제외) " + work);
		

	}

}
