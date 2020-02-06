package 캐스팅;

import javax.swing.JButton;

public class 기본형캐스팅 {

	public static void main(String[] args) {
		
		byte a = 100; // 1 바이트
		int b = 120; // 4 바이트
		
		b = a; // 큰 <= 작 : 큰 것으로 자동변환해서 들어감
			   // int <= byte (자동형변환)
			   // 형변환 = 캐스팅 (casting)
		
		a = b; // 작 <= 큰 : 작은 것으로 강제 변환해서 들어감
			   // byte <= int (강제형변환)
		
		// 형변환 (캐스팅, casting)
		// - 클래스간 형변환은 상속관계에 있을때만 가능
		// - 부모클래스와 자식클래스만 형변환이 가능
		// - Component: 부모클래스, Jbutton: 자식클래스
		// - 클래스간에 크고, 작다는 무엇으로 판단?
		//   = 부모가 크고, 자식이 작음
		
		Component c = new Component();
		JButton b = new JButton();
		
		c = b; // 큰 <= 작, 자동형변환
		b = (JButton) c; // 작 <= 큰, 강제형변환
		
		// add (Component c) <= b, l, t
		// = 다형성 (오버로딩)
		

	}

}
