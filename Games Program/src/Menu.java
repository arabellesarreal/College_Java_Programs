import java.util.Scanner;
public class Menu
{
	static int endGameNumber;
	static Scanner scan = new Scanner(System.in);
	public static void main(String [] args) throws InterruptedException
	{
		int choiceNumber = 0;
		endGameNumber = 7;
		while(choiceNumber != endGameNumber)
		{
			printMenuChoices();
			choiceNumber = readChoiceNumber();
			switch (choiceNumber)
			{
			case 1:
				FlipCoinGame.descriptiveMethod();
				break;
			case 2:
				HighLowGame.descriptiveMethod();
				break;
			case 3:
				RaceTrackGame.descriptiveMethod();
				break;
			case 4:
				ShapesGame.descriptiveMethod();
				break;
			case 5:
				SentenceGame.descriptiveMethod();
				break;
			case 6:
				Project_Stack_Of_Boxes.descriptiveMethod();
				break;
			default:
				System.out.println("         Invalid choice.  The game is over.");
				choiceNumber = endGameNumber;
				break;
			}//switch
		}//while
	}
	private static void printMenuChoices()
	{
		System.out.println(
				"                      There are 6 game programs this menu offers.\n"
				+ "                        1) Flip a coin a certain number of heads in a row.\n"
				+ "                        2) High low guess. \n"
				+ "                        3) Race three names to their finish line. \n"
				+ "                        4) Draw geometric shapes. \n"
				+ "                        5) Guess the characters in a string of words. \n"
				+ "                        6) Build a stack of six boxes. \n"
				+ "                        7) Quit playing these games. \n");
	}
	private static int readChoiceNumber()
	{
		int choiceNumber;
		choiceNumber = scan.nextInt();
		while(choiceNumber < 1 || choiceNumber > endGameNumber)
		{
			System.out.println("        the number must be 1" +
					" through " + endGameNumber + " inclusive");
			System.out.println("               please enter a proper choice.  ");
			choiceNumber = scan.nextInt();		}
		return choiceNumber;
	}
}
