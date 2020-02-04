package 상속;

public class 개 extends 동물{
	
	String owner;
	
	public void bark() {
		
		System.out.println("짖다");
		
	}

	public String toString() {
		return "개 [owner=" + owner + ", weight=" + weight + "]";
	}


}
