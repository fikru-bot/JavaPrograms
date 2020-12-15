package io.program.exam;

public class SingleAndTwoDimentionalArray {
// single dimentional array
	public static void main(String[] args) {
		int[] numbers = new int[5];
		//int[] numbersa = {23, 34, 45, 56, 56};
		numbers[0] = 12;
		numbers[1] = 45;
		numbers[2] = 67;
		numbers[3] = 89;
		numbers[4] = 76;
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		

	}

}
