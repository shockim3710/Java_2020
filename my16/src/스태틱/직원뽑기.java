package 스태틱;

public class 직원뽑기 {

	public static void main(String[] args) {
		
		직원 n1 = new 직원("임아무개", "남", 24);
		직원 n2 = new 직원("김아무개", "여", 23);
		직원 n3 = new 직원("박아무개", "남", 25);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println();
		
		System.out.println("전체 직원 수: " + 직원.count + "명");
		// System.out.println("직원들의 평균 나이: " + (직원.sum / 직원.count) + "세");
		System.out.println("직원들의 평균 나이: " + 직원.avg() + "세");
		System.out.println("첫번째 직원의 이름: " + n1.name);
		
		String m1 = "100";
		int m2 = Integer.parseInt(m1);
		System.out.println("내년 나이는: " + (m2+1) + "세");
		
	}

}
