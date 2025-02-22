package constructor;

public class ConstructorChainingClass {

	String name;
	int age;
	
	ConstructorChainingClass(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	ConstructorChainingClass(String name){
		this(name, 18);
	}
}
