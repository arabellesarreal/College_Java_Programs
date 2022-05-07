public class ComplexNumberDemo
{
	public static void main (String[] args)
	{
		ComplexNumber cn1 = new ComplexNumber (4, 5);
		ComplexNumber cn2 = new ComplexNumber (3, -2);
		ComplexNumber cn3, cn4, cn5, cn6, cn7;
		System.out.println ("First ComplexNumber number: " + cn1);
		System.out.println ("Second ComplexNumber number: " + cn2);
		if (cn1.equals(cn2))
			System.out.println ("cn1 and cn2 are equal.");
		else
			System.out.println ("cn1 and cn2 are NOT equal.");
		cn4 = cn1.add(cn2);
		cn5 = cn1.subtract(cn2);
		cn6 = cn1.multiply(cn2);
		cn7 = cn1.divide(cn2);
		System.out.println ("cn1 + cn2: " + cn4);
		System.out.println ("cn1 - cn2: " + cn5);
		System.out.println ("cn1 * cn2: " + cn6);
		System.out.println ("cn1 / cn2: " + cn7);
	}
}

/*
Here are some examples to test your program:
If c1 = 4 + 5i and c2 = 3 -2i then
the sum of c1 and c2 is 7.0 + 3.0i
subtracting c2 from c1 is 1.0 + 7.0i
multiplying c1 and c2 is 22.0 + 7.0i
dividing c1 by c2 is 0.1538461538 + 1.7692307692i
 */
