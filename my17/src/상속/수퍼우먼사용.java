package 상속;

public class 수퍼우먼사용 {

	public static void main(String[] args) {
		
		우먼 수퍼우먼 = new 우먼();
		
		수퍼우먼.gender = "여";
		수퍼우먼.name = "마돈나";
		수퍼우먼.speed = 300;
		
		System.out.println(수퍼우먼);
		
		수퍼우먼.먹다();
		수퍼우먼.잠자다();
		수퍼우먼.섬세하다();

	}

}
