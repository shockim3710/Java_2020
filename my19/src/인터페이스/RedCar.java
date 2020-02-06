package 인터페이스;

public class RedCar implements car {

	@Override
	public void 엔진으로가다() {
		
		System.out.println("전기엔진으로 가다");

	}

	@Override
	public void 몇인용자동차다() {
		
		System.out.println("4인용 자동차다");

	}

}
