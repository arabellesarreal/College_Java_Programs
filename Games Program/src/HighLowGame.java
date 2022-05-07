import java.util.Scanner;
public class HighLowGame
{
	//*** These variables can be seen throughout the class.
	//*** They can be very useful when you need the same value
	//*** in several places.
	
	private static String spaces = "                     ";
	//*** this Scanner can be used throughout the class.
	private static Scanner scan = new  Scanner(System.in);
	//*** This method controls two while loops. The outer loop allows the game to 
	//*** be played repeatedly.  The inner loop is the game.
	public static void descriptiveMethod() throws InterruptedException//done
	{
		introduction();
		int playerGuess;
		int amountOfTries = 1;
		int randomNumber;
		String choice = "Yes";
		while(choice.equalsIgnoreCase("Yes"))
		{
			System.out.println(spaces + "Please guess the number.");
			playerGuess = readChoiceNumber();
			randomNumber = createRandomNumber(); 
			while(playerGuess != randomNumber)
			{
				amountOfTries++;
				isPlayerHighOrLow(playerGuess,randomNumber);
				playerGuess = scan.nextInt();
			}
			System.out.println(spaces + "Good job! You got the total with " + amountOfTries + " tries." );
			choice = shouldIStayInLoop();
			amountOfTries = 0;
		}
	}
	private static int createRandomNumber() throws InterruptedException //done
	{
		return (int)((Math.random() * 100) + 1);
	}
	private static void isPlayerHighOrLow(int playerGuess, int answer) throws InterruptedException //done
	{
		if(playerGuess > answer) {
			System.out.println(spaces + "You were hi.");
			System.out.println(spaces + "Please guess again.");
		}else
		{
			System.out.println(spaces + "You were low.");
			System.out.println(spaces + "Please guess again.");
		}
	}
	private static void introduction() throws InterruptedException //done
	{
		System.out.println("" +
				spaces + "This program allows you to guess a random integer\n" + 
				spaces +"between 1 and 100 inclusive.  The computer creates\n" + 
				spaces +"a random number and tells you if your guess was 	\n" + 
				spaces +"correct, hi or low.");
	}
	private static int readChoiceNumber()//done
	{
		Scanner scan = new Scanner(System.in);
		int choiceNumber;
		String indent = "                   ";
		choiceNumber = scan.nextInt();
		while(choiceNumber < 1 || choiceNumber > 100)
		{
			System.out.println(indent + "the number must be 1 through 100 inclusive");
			System.out.println(indent + "    please enter a proper guess.  ");
			choiceNumber = scan.nextInt();
		}
		return choiceNumber;
	}
	private static String shouldIStayInLoop()//done
	{
		String choice;
		System.out.println(spaces + "Would you like to play this game again?");
		System.out.println(spaces + "    please enter yes or no  ");
		choice = scan.nextLine();
		choice = scan.nextLine();
		return choice;
	}
}