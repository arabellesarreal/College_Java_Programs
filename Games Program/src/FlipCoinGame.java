import java.util.Scanner;
public class FlipCoinGame
{
	//*** These variables can be seen throughout the class.
	//*** They can be very useful when you need the same value
	//*** in several places.
	//private static int globalValue1 = 10; //*** Eclipse makes them blue
	//private static int globalValue2 = 20;
	private static String spaces = "                     ";
	//*** this Scanner can be used throughout the class.
	private static Scanner scan = new  Scanner(System.in);
	//*** This method controls two while loops. The outer loop allows the game to 
	//*** be played repeatedly.  The inner loop is the game.
	public static void descriptiveMethod() throws InterruptedException
	{
		introduction();
		int value;  //*** This is a local variable and can only be seen 
		//*** in this block of code.  Eclipse makes them brown.
		int numberOfHeads = 0;
		String choice = "Yes";
		while(choice.equalsIgnoreCase("Yes"))
		{
			System.out.println(spaces + "You have two implementations from which to choose. \n"
					+ spaces + "1) Please trace the code as the coin is flipped. \n"
					+ spaces + "2) Please just give the number of flips. \n"
					+ spaces + "Please choose 1 or 2.");
			value = readChoiceNumber();

			if(value == 1)
			{
				System.out.println(spaces + "Please enter the number of heads in a row you would like.");
				numberOfHeads = scan.nextInt();
				flipWithTrace(numberOfHeads);
			}else 
			{
				if(value == 2) {
					System.out.println(spaces + "Please enter the number of heads in a row you would like.");
					numberOfHeads = scan.nextInt();
					flipWithoutTrace(numberOfHeads);
				}
			}
			choice = shouldIStayInLoop();
		}
	}

	private static void flipWithTrace(int numberOfHeads) throws InterruptedException//done
	{
		int heads = 1;
		int tails = 2;
		int flipResult = 0;
		int currentRowOfHeads = 0;
		int currentNumberOfFlips = 0;
		
		System.out.println(spaces + "We started to flip.");
		
		while(numberOfHeads != currentRowOfHeads)
		{
			Thread.sleep(1000);// 1000 is a second.
			flipResult = (int)((Math.random() * 2) + 1);
			if(flipResult == tails)
			{
				System.out.println(spaces + "You flipped tails.");
				System.out.println(spaces + "You must reset the count of heads to zero.");
				currentRowOfHeads = 0;
			}else {
				if(flipResult == heads)
				{
					System.out.println(spaces + "You flipped heads!");
					currentRowOfHeads++;
					System.out.println(spaces + "The number of heads is " + currentRowOfHeads);
				}
			}
			currentNumberOfFlips++;
			System.out.println(spaces + "So far you have flipped the coin " + currentNumberOfFlips + " times. \n \n");
		}
		System.out.println(spaces + "Congratulations! It took you " + currentNumberOfFlips 
				+ "\n" + spaces + "flips to get " + numberOfHeads + " heads in a row.");
	}
	private static void flipWithoutTrace(int numberOfHeads) throws InterruptedException//done
	{
		int heads = 1;
		int tails = 2;
		int flipResult = 0;
		int currentRowOfHeads = 0;
		int currentNumberOfFlips = 0;
		
		while(numberOfHeads != currentRowOfHeads)
		{
			flipResult = (int)((Math.random() * 2) + 1);
			if(flipResult == tails)
			{
				currentRowOfHeads = 0;
			}else {
				if(flipResult == heads)
				{
					currentRowOfHeads++;
				}
			}
			currentNumberOfFlips++;
		}
		System.out.println(spaces + "It took " + currentNumberOfFlips + " flips to get "
				+ "\n" + spaces + numberOfHeads + " heads in a row.\n\n");
	}
	private static void introduction() throws InterruptedException//done	
	{
		System.out.println(spaces +"This game repeatedly flips a coin. \n"
				+ spaces + "This game prompts you for the number of \n" 
				+ spaces + "times you would like heads to appear in \n"
				+ spaces + "a row.  It then flips the coin until that \n" 
				+ spaces + "number of heads in a row are flipped.");

	}
	private static int readChoiceNumber()//done
	{
		Scanner scan = new Scanner(System.in);
		int choiceNumber;
		String indent = "                   ";
		choiceNumber = scan.nextInt();
		while(choiceNumber < 1 || choiceNumber > 2)
		{
			System.out.println(indent + "the number must be a 1 or 2");
			System.out.println(indent + "    please enter a proper choice.  ");
			choiceNumber = scan.nextInt();
		}
		return choiceNumber;
	}
	private static String shouldIStayInLoop()//done
	{
		String choice;
		System.out.println(spaces + "Would you like to flip the coin again?");
		System.out.println(spaces + "             (yes or no)  ");
		choice = scan.nextLine();
		choice = scan.nextLine();
		return choice;
	}
}