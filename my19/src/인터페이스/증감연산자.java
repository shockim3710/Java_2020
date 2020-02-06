package 인터페이스;

public class 증감연산자 {

	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.println(++a); // 증가시키고 출력
		System.out.println(a++); // 출력처리를 하고 증가
		System.out.println(a);
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		
		System.out.println(x); // ++ 한 후
		System.out.println(y); // -- 하기전
		System.out.println(z);

	}

}
