package Arrays;

public class PrintArrayAlternateNumbersByLoop {

	public static void main(String[] args) {
		System.out.println("---- Print Array Alternate ----");
		
		int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		for(int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
			i++;
		}

	}

}
