package numbers;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println("---Checking Number is Prime or No----");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int flag = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				flag = flag + 1;
			}
		}
		if(flag == 2) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not prime");
		}

	}

}
