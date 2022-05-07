public class Pentadeca
{
	private String stringValue;
	private int integerValue;
	private static final int BASE = 15;
	public Pentadeca(String stringValue)// explicit constructor
	{
		setPentadecaNumber(stringValue);
	}
	public Pentadeca(int integerValue)
	{
		setPentadecaNumber(integerValue);
	}
	public Pentadeca(Pentadeca value)
	{
		return;
	}
	private int getPentadecaInt()
	{
		return this.integerValue;
	}
	private String getPentadecaString()
	{
		return this.stringValue;
	}
	public void setPentadecaNumber(Pentadeca other)
	{

	}
	public void setPentadecaNumber(int other)
	{
		this.integerValue = other;
	}
	public void setPentadecaNumber(String other)
	{
		this.stringValue = other;
		checkCharacterInput(this.stringValue);
	}
	public Pentadeca getPentadecaNumber()// one line of code
	{
		Pentadeca answer = new Pentadeca();
		return answer;
	}
	public boolean equals(Pentadeca other)
	{
		return true;
	}
	public void read( )
	{

	}
	private int convertStringNumberToIntegerValue(String stringNumber)
	{
		int total = 0;
		for(int i = 0; i < stringNumber.length(); i++)
		{
			total += (Math.pow(BASE,(stringNumber.length()-i-1))*characterToInteger(stringNumber.charAt(i)));
		}
		return total;
	}
	private String removeBaseCharacterP(String stringNumber) //done
	{
		return stringNumber = stringNumber.substring(0,stringNumber.indexOf('p'));
	}
	private int characterToInteger(char digitChar)// switch statement
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
	private void checkCharacterInput(String stringNumber)
	{
		char check = '0';
		for(int i = 0; i < stringNumber.length(); i++)
		{
			check = stringNumber.charAt(i);
			if(!(check <= 57 && check >= 48) && !(check >= 65 && check <= 69))
			{	
				System.out.println("invalid string");
				System.exit(0);
			}
		}
	}
	public String toString() //done
	{
		return stringValue + "p";
	}
	private String integerDigitToStringDigit(int integerDigit)// switch statement
	{
		
	}
}
//public Pentadeca add(int n)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca subtract(int n)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca multiply(int n)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca divide(int n)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca add(Pentadeca other)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca subtract(Pentadeca other)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca multiply(Pentadeca other)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca divide(Pentadeca other)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;	
//}
//public Pentadeca add(String other)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca subtract(String other)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca multiply(String other)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
//public Pentadeca divide(String other)
//{
//	Pentadeca answer = new Pentadeca();
//	return answer;
//}
