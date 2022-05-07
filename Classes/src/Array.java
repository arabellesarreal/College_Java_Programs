import java.util.Arrays;
public class Array
{
	public static int[] numbers = new int[5];
	public static double average;
	public static void main(String[] args)
	{	
		int smallest = 100;
		int largest = 0;
		double total = 0;
		
		for(int i = 0; i <numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100+1);
			total += numbers[i];
			if(smallest > numbers[i])
				smallest = numbers[i];
			if(largest < numbers[i])
				largest = numbers[i];
		}
		average = total/numbers.length;
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("Smallest number: " + smallest);
		System.out.println("Largest number: " + largest);
		System.out.println("Average: " +  average);
		System.out.println("Standard Deviation: " + standardDeviation());
	}
	public static double standardDeviation()
	{
		double standardTotal = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			standardTotal += Math.pow((numbers[i] - average),2);
		}
		return Math.sqrt(standardTotal/numbers.length);
	}
}
