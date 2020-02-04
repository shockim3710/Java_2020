package 실무클래스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class exam {

	public static void main(String[] args) {
		
		ArrayList ski = new ArrayList();
		
		// 순서를 가지는 데이터의 형태 (제일 사용 많음)
		// = list
		
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		
		System.out.println("스키대회 수상자 순서 " + ski);
		
		ski.remove(1);
		
		System.out.println("최종 스키대회 수상자 순서 " + ski);
		
		
		System.out.println("------------------------------------------");
		
		LinkedList movie = new LinkedList();
		
		// 대기줄의 형태를 가지는 자료의 형태
		// = queue
		
		movie.add("백두산");
		movie.add("히트맨");
		movie.add("남산의 부장들");
		
		System.out.println("영화 목록 " + movie);
		
		movie.remove();
		
		System.out.println("현재 남은 영화 목록 " + movie);
		
		movie.remove();
		
		System.out.println("현재 남은 영화 목록 " + movie);
		
		movie.remove();
		
		System.out.println("현재 남은 영화 목록 " + movie);
		
		
		System.out.println("------------------------------------------");
		
		HashSet bag = new HashSet();
		
		// 중복된 데이터를 자동으로 체크해주는 자료의 형태
		// = set
		
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("돈");
		
		System.out.println("가방에 넣을 물건 " + bag);

		bag.add("휴대폰");
		
		System.out.println("가방에 넣을 물건 (중복제외) " + bag);
		
		
		System.out.println("------------------------------------------");
		
		HashMap 단축키 = new HashMap();
		
		// 키:값의 쌍으로 저장해야 하는 자료의 형태
		// = map
		
		단축키.put(1, "엄마");
		단축키.put(2, "아빠");
		단축키.put(3, "친구");
		단축키.put(4, "동생");
		
		System.out.println("휴대폰 단축키 목록 " + 단축키);
		System.out.println("단축키 2번: " + 단축키.get(2));
		
	}

}
