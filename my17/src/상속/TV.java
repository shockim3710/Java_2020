package 상속;

public class TV extends Object{ // extends Object 생략 되있는 것
	
	String color;
	int size;
	
	public TV(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	public void 키다() {
		
		System.out.println("TV를 키다");
		
	}

	@Override
	public String toString() {
		return "TV [color: " + color + ", size: " + size + "]";
	}
	

}
