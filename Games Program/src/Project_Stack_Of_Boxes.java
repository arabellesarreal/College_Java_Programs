import java.util.Scanner;
public class Project_Stack_Of_Boxes
{
	public static boolean box1 = false;
	public static boolean box2 = false;
	public static boolean box3 = false;
	public static boolean box4 = false;
	public static boolean box5 = false;
	public static boolean box6 = false;
	public static boolean trace = false;
	public static int count = 0;
	public static Scanner scan = new Scanner(System.in);
	public static void descriptiveMethod() throws InterruptedException
	{
		//	Write a sixth game program using the random number generator to generate six integer numbers.  Use them to indicate one of six boxes. 

		introduction();
		int boxNumber = 0;
		
		while(allBoxesStacked() != true)
		{

			
				boxNumber = (int)((Math.random()*6) + 1);
				System.out.println("Current box number: " + boxNumber);
				switch(boxNumber)
				{
				case 1:

					box1 = true;
					break;

				case 2:

					box2 = true;
					break;

				case 3:
					box3 = true;
					break;

				case 4:

					if(box1 == true && box2== true)
					{
						box4 = true;
					}else resetBoxes();
					break;

				case 5:

					if(box2 == true && box3== true)
					{
						box5 = true;
					}else resetBoxes();
					break;

				case 6:
					if(box4 == true && box5== true)
					{
						box6 = true;
					}else resetBoxes();
					break;
				}
				if(trace)
				{
					count++;
					Thread.sleep(200);
					currentStack();
				}else
				{
					count++;
					currentStack();
				}
				System.out.println("Boxes used so far: " + count);
				//allBoxesStacked();
			
		}
		count = 0;
	}
	private static void introduction()
	{
		System.out.println(
				"               Which version do you want?\r\n" + 
				"                 1) Watch trace.\r\n" + 
				"                 2) Go directly to Solution.\r\n" + 
				"               Please choose a number.\r\n");
		int number = scan.nextInt();
		if(number == 1)
		{
			trace = true;
		}else
			if(number == 2)
			{
			trace = false;
			}
	}
	private static boolean allBoxesStacked()
	{
		String enter;
		if
		(
				box1 == true &&
				box2 == true &&
				box3 == true &&
				box4 == true &&
				box5 == true &&
				box6 == true)
		{
			System.out.println("This pyramid took " + count + " boxes.");
			System.out.println("Please press enter");
			enter = scan.nextLine();
			return true;
		}else
			return false;
	}
	private static void resetBoxes()
	{
		box1 = false;
		box2 = false;
		box3 = false;
		box4 = false;
		box5 = false;
		box6 = false;
	}
	private static void currentStack()
	{
		if(box1 == true && box2 == false && box3 == false)
		{
			stack1();
		}
		if(box1 == false && box2 == true && box3 == false)
		{
			stack2();
		}
		if(box1 == false && box2 == false && box3 == true)
		{
			stack3();
		}
		if(box1 == true && box2 == true && box3 == false && box4 == false)
		{
			stack12();
		}
		if(box1 == true && box2 == false && box3 == true)
		{
			stack13();
		}
		if(box1 == false && box2 == true && box3 == true && box5 == false)
		{
			stack23();
		}
		if(box1 == true && box2 == true && box3 == true && box4 == false && box5 == false)
		{
			stack123();
		}
		if(box1 == true && box2 == true && box3 == false && box4 == true)
		{
			stack124();
		}
		if(box1 == false && box2 == true && box3 == true && box4 == false && box5 == true)
		{
			stack235();
		}
		if(box1 == true && box2 == true && box3 == true && box4 == false && box5 == true)
		{
			stack1235();
		}
		if(box1 == true && box2 == true && box3 == true && box4 == true && box5 == false)
		{
			stack1234();
		}
		if(box1 == true && box2 == true && box3 == true && box4 == true && box5 == true && box6 == false)
		{
			stack12345();
		}
		if(box1 == true && box2 == true && box3 == true && box4 == true && box5 == true && box6 == true)
		{
			stackCompleted();
		}
	}
	private static void stack1()
	{
		System.out.println(
				"                          _________  \r\n" + 
						"                         |         | \r\n" + 
						"                         |    1    | \r\n" + 
						"                         |         | \r\n" + 
				"                         |_________| ");

	}
	private static void stack2()
	{
		System.out.println(
				"                                          _________  \r\n" + 
						"                                         |         | \r\n" + 
						"                                         |    2    | \r\n" + 
						"                                         |         | \r\n" + 
				"                                         |_________| ");

	}
	private static void stack3()
	{
		System.out.println(
				"                                                          _________  \r\n" + 
						"                                                         |         |\r\n" + 
						"                                                         |    3    |\r\n" + 
						"                                                         |         |\r\n" + 
				"                                                         |_________|");
	}
	private static void stack12()
	{
		System.out.println(
				"                          _________       _________      \r\n" + 
						"                         |         |     |         |     \r\n" + 
						"                         |    1    |     |    2    |     \r\n" + 
						"                         |         |     |         |     \r\n" + 
				"                         |_________|     |_________|     ");

	}
	private static void stack13()
	{
		System.out.println(
				"                          _________                       _________      \r\n" + 
						"                         |         |                     |         |     \r\n" + 
						"                         |    1    |                     |    3    |     \r\n" + 
						"                         |         |                     |         |     \r\n" + 
				"                         |_________|                     |_________|     ");

	}
	private static void stack23()
	{
		System.out.println(
				"                                          _________       _________      \r\n" + 
						"                                         |         |     |         |     \r\n" + 
						"                                         |    2    |     |    3    |     \r\n" + 
						"                                         |         |     |         |     \r\n" + 
				"                                         |_________|     |_________|     ");
	}
	private static void stack123()
	{
		System.out.println(
				"                          _________       _________       _________\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
						"                         |    1    |     |    2    |     |    3    |\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
				"                         |_________|     |_________|     |_________|");

	}
	private static void stack124()
	{
		System.out.println(
				"                                  _________  \r\n" + 
						"                                 |         | \r\n" + 
						"                                 |    4    | \r\n" + 
						"                                 |         | \r\n" + 
						"                                 |_________| \r\n" + 
						"                          _________       _________      \r\n" + 
						"                         |         |     |         |     \r\n" + 
						"                         |    1    |     |    2    |     \r\n" + 
						"                         |         |     |         |     \r\n" + 
				"                         |_________|     |_________|     ");

	}
	private static void stack235()
	{
		System.out.println(
				"                                                  _________  \r\n" + 
						"                                                 |         | \r\n" + 
						"                                                 |    5    | \r\n" + 
						"                                                 |         | \r\n" + 
						"                                                 |_________| \r\n" + 
						"                                          _________       _________      \r\n" + 
						"                                         |         |     |         |     \r\n" + 
						"                                         |    2    |     |    3    |     \r\n" + 
						"                                         |         |     |         |     \r\n" + 
				"                                         |_________|     |_________|     ");

	}
	private static void stack1235()
	{
		System.out.println(
				"                                                  _________   \r\n" + 
						"                                                 |         |  \r\n" + 
						"                                                 |    5    |  \r\n" + 
						"                                                 |         |  \r\n" + 
						"                                                 |_________|  \r\n" + 
						"                          _________       _________       _________\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
						"                         |    1    |     |    2    |     |    3    |\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
				"                         |_________|     |_________|     |_________|");

	}
	private static void stack1234()
	{
		System.out.println(
				"                                  _________   \r\n" + 
						"                                 |         |  \r\n" + 
						"                                 |    4    |  \r\n" + 
						"                                 |         |  \r\n" + 
						"                                 |_________|  \r\n" + 
						"                          _________       _________       _________\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
						"                         |    1    |     |    2    |     |    3    |\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
				"                         |_________|     |_________|     |_________|");

	}
	private static void stack12345()
	{
		System.out.println(
				"                                  _________       _________  \r\n" + 
						"                                 |         |     |         | \r\n" + 
						"                                 |    4    |     |    5    | \r\n" + 
						"                                 |         |     |         | \r\n" + 
						"                                 |_________|     |_________| \r\n" + 
						"                          _________       _________       _________\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
						"                         |    1    |     |    2    |     |    3    |\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
				"                         |_________|     |_________|     |_________|");

	}
	private static void stackCompleted()
	{
		System.out.println(
				"                                          _________ \r\n" + 
						"                                         |         |\r\n" + 
						"                                         |    6    |\r\n" + 
						"                                         |         |\r\n" + 
						"                                         |_________|\r\n" + 
						"                                  _________       _________  \r\n" + 
						"                                 |         |     |         | \r\n" + 
						"                                 |    4    |     |    5    | \r\n" + 
						"                                 |         |     |         | \r\n" + 
						"                                 |_________|     |_________| \r\n" + 
						"                          _________       _________       _________\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
						"                         |    1    |     |    2    |     |    3    |\r\n" + 
						"                         |         |     |         |     |         |\r\n" + 
				"                         |_________|     |_________|     |_________|");
	}

}
