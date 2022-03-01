import java.util.Scanner;
public class LoopQuestion {
	
	/*
	Write a piece of code that prompts the user to repeatedly enter integer numbers and sums them up, until the user 
	enters a 0. Once the user enters a 0, your code should exit a while loop and print the sum. Here is a sample run:
	
	Enter a non-zero number to add or 0 to exit: 
	5
	Enter a non-zero number to add or 0 to exit: 
	4
	Enter a non-zero number to add or 0 to exit: 
	9
	Enter a non-zero number to add or 0 to exit: 
	0
	Result: 18
	*/
	public static int sumOfNumbers() {

		// FILL IN CODE
		Scanner sc = new Scanner(System.in);
		int num = -100;
		int sum = 0;
		while (num != 0) {
			System.out.println("Enter the number: ");
			num = Integer.parseInt(sc.nextLine());
			if (num != 0)
				sum += num;
		}
		return sum;

	}

	public static void main(String[] args) {
		int sum = sumOfNumbers();
		System.out.println(sum);
	}

}