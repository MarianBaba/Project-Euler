package project.euler;

public class EvenFibonacciNumbers {
	
	private static int sum = 0;
	
	public static void main(String... strings) {
		//one of the best ways to implement fibonacci is iteratively
		
		int first = 0;
		int second = 1;
		
		while(true) {
			int res = first + second;
			first = second;
			second = res;
			if(res < 4000000) {
				if(res % 2 == 0) {
					sum += res;
				}
			} else {
				break;
			}
		}
		
		System.out.println(sum);
	}
}
