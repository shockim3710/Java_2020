package 생성자;

public class 키보드 {
	
	String name;
	int price;
	int count;
	
	public 키보드(int p, int c) {
		
		price = p;
		count = c;
		
	}
	
	public 키보드(int p, String n, int c) {
		
		name = n;
		price = p;
		count = c;
		
	}

	public String toString() {
		return "키보드 [name: " + name + ", price: " + price + ", count: " + count + "]";
	}


}
