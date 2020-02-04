package 스테틱;

public class Mouse {
	
	String color;
	String company;
	int price;
	
	public Mouse(String color, String company, int price) {
		super();
		this.color = color;
		this.company = company;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mouse [color: " + color + ", company: " + company + ", price: " + price + "]";
	}
	

}
