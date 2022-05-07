
public class PentaMethodsTest
{
	public static int BASE = 15;
	public static void main(String[] args)
	{
		String p1 = "123";
		String p2 = "126p";
		//addInt(p1,p2);
		//removeBaseCharacterP(p1);
		//		checkCharacterInput("123456789ABCDE");
		//checkCharacterInput("FGJDHEUO");
		convertStringNumberToIntegerValue(p1);
	}
	public static void convert(String p1)
	{
		int power = 0;
		for(int i = 0; i < p1.length()-1; i++)
		{

		}
	}
	public static void addInt(String p1,String p2)
	{

	}
	public static void removeBaseCharacterP(String stringNumber)
	{
		stringNumber = stringNumber.substring(0,stringNumber.indexOf('p'));
		System.out.println(stringNumber);
	}
	private static void checkCharacterInput(String stringNumber)
	{
		char check = '0';
		for(int i = 0; i < stringNumber.length(); i++)
		{
			check = stringNumber.charAt(i);
			if(!(check <= 57 && check >= 48) && !(check >= 65 && check <= 69))
			{	System.out.println("invalid string");
			System.exit(0);}
		}
	}
	private static int characterToInteger(char digitChar)// switch statement
	{
		int intChar = 0;
		switch(digitChar)
		{
		case '0':
			intChar = 0;
			break;
		case '1':
			intChar = 1;
			break;
		case '2':
			intChar = 2;
			break;
		case '3':
			intChar = 3;
			break;
		case '4':
			intChar = 4;
			break;
		case '5':
			intChar = 5;
			break;
		case '6':
			intChar = 6;
			break;
		case '7':
			intChar = 7;
			break;
		case '8':
			intChar = 8;
			break;
		case '9':
			intChar = 9;
			break;
		case 'A':
			intChar = 10;
			break;
		case 'B':
			intChar = 11;
			break;
		case 'C':
			intChar = 12;
			break;
		case 'D':
			intChar = 13;
			break;
		case 'E':
			intChar = 14;
			break;
		}
		return intChar;
	}
	private static int convertStringNumberToIntegerValue(String stringNumber)
	{
		int total = 0;
		for(int i = 0; i < stringNumber.length(); i++)
		{
			total += (Math.pow(BASE,(stringNumber.length()-i-1))*characterToInteger(stringNumber.charAt(i)));
		}
		return total;
	}
}
