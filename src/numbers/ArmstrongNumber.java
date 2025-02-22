package numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("---Number is Armstrong or Not---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int t1 = num;
		int t2 = num;
		int length = 0;
		
		while(t1 != 0) {
			t1 = t1 / 10;
			length = length + 1;
		}
		
		System.out.println("The length is : " + length);
		
		int rem;
		int arms = 0;
		while(t2 != 0) {
			rem = t2 % 10;
			int mul = 1;
			for(int i = 1; i <= length; i++) {
				mul = mul * rem;
			}
			arms = arms + mul;
			t2 = t2 / 10;
		}
		
		if(num == arms) {
			System.out.println("The number is Armstrong");
		}else {
			System.out.println("The number is not Armstrong");
		}
		

	}

}
