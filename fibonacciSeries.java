import java.util.Scanner;
import java.util.ArrayList;

public class javaFile5 {
	static int currentIndex;
	static int currentNumber;

	static public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		System.out.print("enter a range for fibonacci series: ");
		int seriesRange = Integer.parseInt(scanner.nextLine());
		numbers.add(0);
		numbers.add(1);

		while (currentNumber < seriesRange) {
			currentNumber = numbers.get(currentIndex) + numbers.get(currentIndex + 1);
			if (currentNumber > seriesRange) {
				break;
			} else {
				numbers.add(currentNumber);
			}
			currentIndex += 1;
		}

		numbers.forEach(number -> {
			System.out.println(number);
		});

	}
}
