import java.util.Scanner;
public class Averagingnumbers
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in);
System.out.println("What is your first number?");
		int firstNumber= userInput.nextInt();
		System.out.println("What is your second number?");
		int secondNumber= userInput.nextInt();
		System.out.println("What is your third number?");
		int thirdNumber= userInput.nextInt();
		double average = (firstNumber+secondNumber+thirdNumber)/3.0;
		System.out.println("The average of " +firstNumber+", "+secondNumber+", and "+thirdNumber+" is "+average);
			}

	}
