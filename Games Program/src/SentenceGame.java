import java.util.Scanner;
import java.util.Arrays;
public class SentenceGame
{
	public static Scanner scan = new Scanner(System.in);
	public static boolean quitProgram = false; 
	public static String stringOfWords;
	public static char[] splitString;
	public static char[] hiddenString;
	public static char guessedLetter;
	final public static String ALPHABET = "abcdefghijklmnopqrstuvwxyz ";
	public static char[] choicesLeft = ALPHABET.toCharArray();
	public static String spaces = "                      ";
	public static String spacesBetween = "\n\n\n\n\n\n\n\n";

	public static void descriptiveMethod() throws InterruptedException
	{

		introduction();
		boolean continueSearch = true;
		
		while(quitProgram == false)
		{
			initialSetup();
			while(continueSearch)
			{
				choicesLeft();
				System.out.println(spaces + "Please guess a character");
				System.out.println(spacesBetween);
				guessedLetter = scan.nextLine().charAt(0);
				
				System.out.println("Character read: " + guessedLetter);
				
				choicesLeft[ALPHABET.indexOf(guessedLetter)] = ' ';
				runThroughLetters();

				if(Arrays.equals(splitString, hiddenString))
				{
					continueSearch = false;
				}
				
				printCurrentResult();
			}
			continueSearch = true;
			choicesLeft = ALPHABET.toCharArray();
			quitProgram();
		}
		quitProgram = false;
	}
	private static void quitProgram()
	{
		String choice;
		System.out.println(spaces + "Congrats! You guessed it!");
		System.out.println(spaces + "Would you like to play again?");
		System.out.println(spaces + "    please enter yes or no  ");
		choice = scan.nextLine();
		if(choice.equals("no"))
		{
			quitProgram = true;
		}else
			if(choice.equals("yes"))
			{
				quitProgram = false;
			}
	}
	private static void runThroughLetters()
	{
		int i = 0;
		for (char currentLetter : splitString)
		{
			if(currentLetter == guessedLetter)
			{
				hiddenString[i] = guessedLetter;
			}
			i++;
		}
	}
	private static void initialSetup()
	{
		System.out.println(spaces + "Please enter a string of words.");
		System.out.println(spacesBetween);
		stringOfWords = scan.nextLine();
		splitString = stringOfWords.toCharArray();
		hiddenString = new char[stringOfWords.length()];
		Arrays.fill(hiddenString, '?');
		printCurrentResult();
	}
	private static void introduction()
	{
		System.out.println
		("                      This game prompts for a string of words.  It \r\n" + 
				"                      then allows the player to guess the characters\r\n" + 
				"                      in the string of words. It keeps track of the \r\n" + 
				"                      characters guessed and tells the player when he\r\n" + 
				"                      wins.\r\n" + 
				"\r\n");
		System.out.println(spacesBetween);
	}
	private static void printCurrentResult()
	{
		System.out.println(spaces + "Originial String: " + stringOfWords);
		System.out.print(spaces +   "Guessed String:   ");
		for (char element : hiddenString)
		{
			System.out.print(element);
		}
		System.out.println();
		System.out.println();
	}
	private static void choicesLeft()
	{
		System.out.println(spaces + "Characters to choose from: ");
		System.out.print(spaces);
		for (char element : choicesLeft)
		{
			System.out.print(element);
		}
		System.out.println();
		System.out.println();
	}
}
