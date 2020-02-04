package 상속;

public class 개입양 {

	public static void main(String[] args) {
		
		개 dog = new 개();
		
		dog.owner = "나";
		dog.weight = 10;
		
		System.out.println(dog);
		
		dog.eat();
		dog.bark();

	}

}
