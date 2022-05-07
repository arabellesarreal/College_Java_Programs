import java.util.Scanner;
public class RaceTrackGame
{
	//*** These variables can be seen throughout the class.
	//*** They can be very useful when you need the same value
	//*** in several places.
	private static String spaces = "                     ";
	private static String startTopTrack = "The race begins                                     FINISH|";
	private static String topraceTrack =  "The race continues                                  FINISH|";
	private static String raceTrack =    "                                                       |";
	//private static String raceTrack =    "-------------------------------------------------------|";
	private static String sue = "Sue";
	private static String tom = "Tom";
	private static String joy = "Joy";
	private static int suesCurrentPlace = 0;
	private static int tomsCurrentPlace = 0;
	private static int joysCurrentPlace = 0;
	private static String winner = "no one";
	//*** this Scanner can be used throughout the class.
	private static Scanner scan = new  Scanner(System.in);
	//*** This method controls two while loops. The outer loop allows the game to 
	//*** be played repeatedly.  The inner loop is the game.
	public static void descriptiveMethod() throws InterruptedException
	{
		introduction();
		scan.nextLine();
		String choice = "Yes";
		String raceStart = "Yes";
		while(choice.equalsIgnoreCase("Yes"))
		{
			suesCurrentPlace = 0;
			tomsCurrentPlace = 0;
			joysCurrentPlace = 0;
			while(winner == "no one")
			{
				if(raceStart == "Yes")
				{
					raceStart = "Already Started";
					raceStart();
				}else
				{
					System.out.println(spaces + topraceTrack);
				}
				suesLane(); 
				tomsLane();
				joysLane(); 
				Thread.sleep(100);
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}
			System.out.println(spaces + "The winner is " + winner + "!");
			winner = "no one";
			suesCurrentPlace = 0;
			choice = shouldIStayInLoop();
		}
	}
	private static void suesLane() throws InterruptedException
	{
		String racerMovement = raceTrack.substring(0,suesCurrentPlace) + sue + raceTrack.substring(suesCurrentPlace);

		suesCurrentPlace = suesCurrentPlace +(int)((Math.random()*5) +1);
		if(suesCurrentPlace >= raceTrack.length())
		{
			suesCurrentPlace = (raceTrack.length()-1);
			System.out.println(spaces + raceTrack.substring(0,raceTrack.length()-1) + " " + sue);
			winner = sue;
			return;
		}
		System.out.println(spaces + racerMovement);
	}
	private static void tomsLane() throws InterruptedException
	{
		String racerMovement = raceTrack.substring(0,tomsCurrentPlace) + tom + raceTrack.substring(tomsCurrentPlace);
		tomsCurrentPlace = tomsCurrentPlace +(int)((Math.random()*5) +1);
		if(tomsCurrentPlace >= raceTrack.length())
		{
			tomsCurrentPlace = (raceTrack.length()-1);
			System.out.println(spaces + raceTrack.substring(0,raceTrack.length()-1) + " " + tom);
			winner = tom;
			return;
		}
		System.out.println(spaces + racerMovement);
	}
	private static void joysLane() throws InterruptedException
	{
		String racerMovement = raceTrack.substring(0,joysCurrentPlace) + joy + raceTrack.substring(joysCurrentPlace);
		joysCurrentPlace = joysCurrentPlace +(int)((Math.random()*5) +1);
		if(joysCurrentPlace >= raceTrack.length())
		{
			joysCurrentPlace = (raceTrack.length()-1);
			System.out.println(spaces + raceTrack.substring(0,raceTrack.length()-1) + " " + joy);
			winner = joy;
			return;
		}
		System.out.println(spaces + racerMovement);
	}
	private static void introduction() throws InterruptedException
	{
		System.out.println("" +
				spaces + "This game races three names. The random number generator \n" +
				spaces + "from the Math class repeatedly gives each name a random number \n" +
				spaces + "between 1 and 5.  As the names move these random distances \n" +
				spaces + "we see which name gets to the finish line first.\n" +
				spaces + "Press enter to begin the race.\n");
	}
	private static void raceStart() throws InterruptedException
	{
		System.out.println(""+
				spaces + startTopTrack);
	}
	private static String shouldIStayInLoop()
	{
		String choice;
		System.out.println(spaces + "Would you like to watch the race again?");
		System.out.println(spaces + "    please enter yes or no  ");
		choice = scan.nextLine();
		return choice;
	}
}