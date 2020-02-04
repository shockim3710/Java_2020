package 클래스;

public class 커피전문점 {

	public static void main(String[] args) {
		
		계산기 cal = new 계산기();
		
		int result = cal.add(2000, 3800);
		cal.minus(result);
		
		System.out.println("------------------------");
		
		int result2 = cal.gob(3000, 4);
		cal.nan(result2, 4);

	}

}
