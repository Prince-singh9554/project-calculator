package java_tutorial;

import java.util.Scanner;

public class calculator1 {

	public static void main(String[] args) {

		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");
		num1 = scanner.nextInt();
		System.out.print("Enter second number:");
		num2 = scanner.nextInt();
		float output;
		int choice = 0;
		while (choice != 5) {
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit code");
			System.out.println("enter your choice :");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				output = num1 + num2;
				System.out.println("result: " + output);
				break;

			case 2:
				output = num1 - num2;
				System.out.println("result: " + output);
				break;

			case 3:
				output = num1 * num2;
				System.out.println("result: " + output);
				break;

			case 4:
				output = num1 / num2;
				System.out.println("result: " + output);
				break;

			case 5:
				System.out.println("exit");
				break;

			default:
				System.out.println("You have entered wrong choice");
				System.out.println("please enter choice between 1 to 5 only\n");
				break;
			}
		}
		System.out.println("code is terminated");

	}
}
