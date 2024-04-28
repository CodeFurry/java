import java.util.Scanner;
import java.util.ArrayList;

public class javaFile4 {
	public static void main(String[] args) {
		int multiples = 0; 
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> primes = new ArrayList<Integer>();

		System.out.print("Enter a range of numbers for prime check: ");
		int range = Integer.parseInt(scanner.nextLine());

		for (int number = 1; number <= range; number++) {
			for (int multiplier = 1; multiplier <= number; multiplier++) {
				if (number % multiplier == 0) {
					multiples += 1;
				}
			}
			if (multiples <= 2) {
				primes.add(number);
				System.out.println(number);
			}
			multiples = 0;
		}

		System.out.printf("total primes: %d", primes.size());

	}
}
