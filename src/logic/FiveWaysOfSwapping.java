package logic;

public class FiveWaysOfSwapping {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		System.out.println("Befor Swapping : " + a + " " + b);
		
		
		//5  Single statement Swapping
		// 10  20
		b = a + b - ( a = b );
		System.out.println("After Swapping : " + a + " " + b);
		
		
		
		
		
		//4  by using - bitwise XOR (^) // binary (10 - 1010) (20 - 10100)
		a = a ^ b;  // 10 ^ 20 = 30
		b = a ^ b;  // 30 ^ 20 = 10
		a = a ^ b;  // 30 ^ 10 = 20
		System.out.println("After Swapping : " + a + " " + b);
		
		
		
		
		
		//3  By * and / operator(a and b should not be 0 then only it will work)
		a = a * b;  // 10 * 20 = 200
		b = a / b;  // 200 / 20 = 10
		a = a / b;  // 200 / 10 = 20
		System.out.println("After Swapping : " + a + " " + b);
		// in case of 0 it will give exception
		
		
		
		
		//2  Without using third variable 
		a = a + b;
		b = a - b;
		a = a - b;
		 System.out.println("After Swapping : " + a + " " + b);
	
		
		
		
		//1  by third var
		int t = a;
		    a = b;
		    b = t;
		
		    System.out.println("After Swapping : " + a + " " + b);
		

	}

}
