import java.util.Scanner;
public class ShapesGame
{
	public static int amountOfLines = 0;
	public static int amountOfStars = 0;
	public static int amountOfSpaces = 0;
	public static int widthOfShape = 0;
	public static int choiceNum = 0;
	public static Scanner scan = new Scanner(System.in);
	public static boolean quitProgram = false;

	public static void descriptiveMethod() throws InterruptedException
	{
		System.out.print("               This game draws geometric shapes.\r\n"); 
		while(quitProgram == false)
		{
			boolean validNumber = false;
			while(validNumber == false)
			{
				introduction();
				choiceNum = scan.nextInt();
				switch(choiceNum)
				{
				case 1:
					howManyLines();
					drawTriangle();
					validNumber = true;
					break;
				case 2:
					howManyLines();
					drawDiamond();
					validNumber = true;
					break;
				case 3:
					howManyLines();
					howCharactersWide();
					drawTrapezoid();
					validNumber = true;
					break;
				case 4:
					howManyLines();
					howCharactersWide();
					drawParallelogram();
					validNumber = true;
					break;
				case 5:
					drawPineTree();
					validNumber = true;
					break;
				default:
					validNumber = false;
				}
			}
			drawAnotherShape();
		}
	}
	private static void drawAnotherShape()
	{
		System.out.println(
				"                      Would you like to draw another shape?\r\n" + 
				"                                     (yes/no)");
		
		String answer = scan.nextLine();
		answer = scan.nextLine();
		
		if(answer.equals("yes"))
		{
			quitProgram = false;	
		}else
			if(answer.equals("no"))
			{
				quitProgram = true;
			}
	}
	private static void howCharactersWide()
	{
		switch(choiceNum)
		{
		case 3:
			System.out.println("How many characters wide would you like the trapezoid?");
			widthOfShape = scan.nextInt();
			break;
		case 4:
			System.out.println("How many characters wide would you like the parallelogram?");
			widthOfShape = scan.nextInt();
			break;
		}
	}
	private static void howManyLines()
	{
		switch(choiceNum)
		{
		case 1:
			System.out.println("How many lines would you like in the triangle?");
			amountOfLines = scan.nextInt();
			break;
		case 2:
			System.out.println("How many lines would you like in the diamond?");
			amountOfLines = scan.nextInt();
			break;
		case 3:
			System.out.println("How many lines would you like in the trapezoid?");
			amountOfLines = scan.nextInt();
			break;
		case 4:
			System.out.println("How many lines would you like in the parallelogram?");
			amountOfLines = scan.nextInt();
			break;
		}
	}
	private static void introduction()
	{
		System.out.println
		( 
				"               Which shape would you like?\r\n" + 
						"                 1) Triangle\r\n" + 
						"                 2) Diamond\r\n" + 
						"                 3) Trapezoid \r\n" + 
						"                 4) Parallelogram \r\n" + 
						"                 5) Pine Tree \r\n" + 
				"               Please choose a number.");
	}
	private static void drawTriangle()//spacing formatting left
	{
		for(int currentLine = amountOfLines; currentLine > 0; currentLine--)
		{
			amountOfSpaces = currentLine;
			if(amountOfStars == 0)
			{
				amountOfStars = 1;
			}else
				amountOfStars += 2;
			for(int currentSpaces = amountOfSpaces; currentSpaces > 0; currentSpaces--)
			{
				System.out.print(" ");
			}
			for(int currentStar = amountOfStars; currentStar > 0; currentStar--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		amountOfSpaces = 0;
		amountOfStars = 0;
		amountOfLines = 0;
	}
	private static void drawDiamond()
	{
		int topHalf = 0;
		int bottomHalf = 0;
		if(amountOfLines%2 == 0)
		{
			topHalf = amountOfLines/2;
			bottomHalf = amountOfLines/2;
		}else 
		{
			topHalf = amountOfLines/2;
			bottomHalf = amountOfLines/2 +1;
		}
		//top of triangle
		for(int currentLine = topHalf; currentLine > 0; currentLine--)
		{
			amountOfSpaces = currentLine;
			if(amountOfStars == 0)
			{
				amountOfStars = 1;
			}else
				amountOfStars += 2;
			for(int currentSpaces = amountOfSpaces; currentSpaces > 0; currentSpaces--)
			{
				System.out.print(" ");
			}
			for(int currentStar = amountOfStars; currentStar > 0; currentStar--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		amountOfSpaces = 0;
		amountOfStars = 0;
		amountOfLines = 0;
		//bottom of triangle
		for(int currentLine = bottomHalf; currentLine > 0; currentLine--)
		{
			amountOfStars = (currentLine * 2) - 1;
			for(int currentSpaces = 0; currentSpaces < amountOfSpaces; currentSpaces++)
			{
				System.out.print(" ");
			}
			amountOfSpaces += 1;
			for(int currentStar = amountOfStars; currentStar > 0; currentStar--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		amountOfSpaces = 0;
		amountOfStars = 0;
		amountOfLines = 0;
	}
	private static void drawTrapezoid()
	{
		for(int currentLine = 0; currentLine < amountOfLines; currentLine++)
		{
			if(amountOfStars == 0)
			{
				amountOfStars = currentLine + widthOfShape;
			}else amountOfStars += 2;

			amountOfSpaces = amountOfLines - currentLine;
			for(int currentSpaces = amountOfSpaces; currentSpaces > 0; currentSpaces--)
			{
				System.out.print(" ");
			}
			for(int currentStar = amountOfStars; currentStar > 0; currentStar--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		amountOfSpaces = 0;
		amountOfStars = 0;
		amountOfLines = 0;
		widthOfShape = 0;
	}
	private static void drawParallelogram()
	{
		for(int currentLine = amountOfLines; currentLine > 0; currentLine--)
		{
			amountOfSpaces = currentLine;
			amountOfStars = widthOfShape;
			for(int currentSpaces = amountOfSpaces; currentSpaces > 0; currentSpaces--)
			{
				System.out.print(" ");
			}
			for(int currentStar = amountOfStars; currentStar > 0; currentStar--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		amountOfSpaces = 0;
		amountOfStars = 0;
		amountOfLines = 0;
	}
	private static void drawPineTree()
	{
		//top
		String spaces = "               ";
		amountOfLines = 5;
		for(int currentLine = amountOfLines; currentLine > 0; currentLine--)
		{
			amountOfSpaces = currentLine;
			if(amountOfStars == 0)
			{
				amountOfStars = 1;
			}else
				amountOfStars += 2;
			for(int currentSpaces = amountOfSpaces; currentSpaces > 0; currentSpaces--)
			{
				System.out.print(" ");
			}
			System.out.print(spaces);
			for(int currentStar = amountOfStars; currentStar > 0; currentStar--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//first and second trapezoid
		widthOfShape = 7;
		amountOfLines = 6;
		spaces = "           ";
		for(int i = 0; i < 2; i++)
		{
			if(i == 1)
			{
				widthOfShape = 15;
				amountOfLines = 7;
				spaces = "      ";
			}
			amountOfStars = 0;
			for(int currentLine = 0; currentLine < amountOfLines; currentLine++)
			{
				if(amountOfStars == 0)
				{
					amountOfStars = currentLine + widthOfShape;
				}else amountOfStars += 2;

				amountOfSpaces = amountOfLines - currentLine;
				for(int currentSpaces = amountOfSpaces; currentSpaces > 0; currentSpaces--)
				{
					System.out.print(" ");
				}
				System.out.print(spaces);
				for(int currentStar = amountOfStars; currentStar > 0; currentStar--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		//stump
		spaces = "                  ";
		for(int i = 0; i < 4; i ++)
		{
			System.out.print(spaces);
			for(int x = 0; x < 5; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}