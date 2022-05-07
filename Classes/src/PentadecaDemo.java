public class PentadecaDemo
{
	public static void main(String[] args)
	{
		Pentadeca Pentadeca1 = new Pentadeca ("123p");
		Pentadeca Pentadeca2 = new Pentadeca ("126p");
		Pentadeca Pentadeca4, Pentadeca5, Pentadeca6, Pentadeca7;
		Pentadeca Pentadeca8 = new Pentadeca(1999);
		System.out.println ("Pentadeca number Pentadeca8: " + Pentadeca8);
		System.out.println ("First Pentadeca number: " + Pentadeca1);
		System.out.println ("Second Pentadeca number: " + Pentadeca2);
		if (Pentadeca1.equals(Pentadeca2))
			System.out.println ("Pentadeca1 and Pentadeca2 are equal.");
		else
			System.out.println ("Pentadeca1 and Pentadeca2 are NOT equal.");
		Pentadeca4 = Pentadeca1.add(Pentadeca2);
		Pentadeca5 = Pentadeca1.subtract(Pentadeca2);
		Pentadeca6 = Pentadeca1.multiply(Pentadeca2);
		Pentadeca7 = Pentadeca1.divide(Pentadeca2);
		System.out.println (Pentadeca1 + " + " + Pentadeca2 + " is: " +
				Pentadeca4);
		System.out.println (Pentadeca1 + " - " + Pentadeca2 + " is: " +
				Pentadeca5);
		System.out.println (Pentadeca1 + " * " + Pentadeca2 + " is: " +
				Pentadeca6);
		System.out.println (Pentadeca1 + " / " + Pentadeca2 + " is: " +
				Pentadeca7);
		System.out.println ();
		int number = 6;
		System.out.println ("using the integer " + number + " as the argument "
				+ "to the math operators ");
		Pentadeca4 = Pentadeca1.add(number);
		Pentadeca5 = Pentadeca1.subtract(number);
		Pentadeca6 = Pentadeca1.multiply(number);
		Pentadeca7 = Pentadeca1.divide(number);
		System.out.println (Pentadeca1 + " + " + number + " is: " + Pentadeca4);
		System.out.println (Pentadeca1 + " - " + number + " is: " + Pentadeca5);
		System.out.println (Pentadeca1 + " * " + number + " is: " + Pentadeca6);
		System.out.println (Pentadeca1 + " / " + number + " is: " + Pentadeca7);
		String value = "6p";
		System.out.println ("using the String " + "\"" + value + "\"" + " as the argument" +
				"to the math operators ");
		Pentadeca4 = Pentadeca1.add(value);
		Pentadeca5 = Pentadeca1.subtract(value);
		Pentadeca6 = Pentadeca1.multiply(value);
		Pentadeca7 = Pentadeca1.divide(value);
		System.out.println (Pentadeca1 + " + " + value + " is: " + Pentadeca4);
		System.out.println (Pentadeca1 + " - " + value + " is: " + Pentadeca5);
		System.out.println (Pentadeca1 + " * " + value + " is: " + Pentadeca6);
		System.out.println (Pentadeca1 + " / " + value + " is: " + Pentadeca7);
	}
}
//Pentadeca number Pentadeca8: 8D4p
//First Pentadeca number: 123p
//Second Pentadeca number: 126p
//Pentadeca1 and Pentadeca2 are NOT equal.
//123p + 126p is: 249p
//123p - 126p is: -3p
//123p * 126p is: 14E43p
//123p / 126p is: 0
//using the integer 6 as the argument to the math operators
//123p + 6 is: 129p
//123p - 6 is: 11Cp
//123p * 6 is: 6D3p
//123p / 6 is: 2Dp
//using the String "6p" as the argument to the math operators
//123p + 6p is: 129p
//123p - 6p is: 11Cp
//123p * 6p is: 6D3p
//123p / 6p is: 2Dp