package Arrays;

import java.util.stream.IntStream;

// Printing alternate Numbers Using IntStream
public class PrintArrayAlternateNumbers {

	public static void main(String[] args) {
		int array [] = {1,2,3,4,5,6,7,8,9,10};
		
		//generate stream of int 0 to length   filter num even    maps each index to corrosponding element     prints each element to consol 
		IntStream.range(0, array.length).filter(i -> i % 2 == 0).map(i -> array[i]).forEach(System.out::println);

	}

}
