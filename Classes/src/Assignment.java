import java.util.Scanner;
public class Assignment
{
	public static int firstInt = 1;
	public static int secondInt = 40;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("This program finds the prime numbers between "
				+ "\ntwo client entered Numbers.");
		initialEntry();
		primeNumber();
	}
	public static void initialEntry()
	{
		System.out.println("Please enter two integer numbers."
				+ "\nThe first is smaller than the second.");
		firstInt = scan.nextInt();
		secondInt = scan.nextInt();
		while(firstInt > secondInt)
		{
			System.out.println("Please enter two integer numbers."
					+ "\nThe first must be smaller than the second.");
			firstInt = scan.nextInt();
			secondInt = scan.nextInt();
		}
	}
	public static void primeNumber()
	{
		System.out.println("The prime numbers between " + firstInt + " and " + secondInt + " are:");
		boolean prime = false;
		for(int currentNum = firstInt; currentNum <= secondInt; currentNum++)
		{
			if(currentNum <= 3 && currentNum != 1)
			{
				System.out.println(currentNum);
			}
			for(int divisor = 2; divisor < currentNum/2; divisor++)
			{
				if(currentNum%divisor == 0)
				{
					prime = false;
					break;
				}
				else prime = true;
			}
			if(prime == true)
				System.out.println(currentNum);
		}
	}
}
