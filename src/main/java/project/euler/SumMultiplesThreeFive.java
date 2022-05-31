package project.euler;

public class SumMultiplesThreeFive {
	//Find the sum of all the multiples of 3 or 5 below 1000.
	private static int sum = 0;
	
	public static void main(String... strings) {
		for(int i = 0; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
