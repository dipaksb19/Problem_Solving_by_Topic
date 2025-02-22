package constructor;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("---- Constructor Chaining ----");
		
		ConstructorChainingClass obj = new ConstructorChainingClass("Dipak");
		
		System.out.println(obj.name + " " + obj.age);

	}

}
