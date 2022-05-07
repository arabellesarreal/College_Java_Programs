package add_multiply_binary;
import java.util.Scanner;
public class AddMultiplyBinary {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		String biNum = "0";
		Scanner input = new Scanner(System.in);
		//------------Number 1------------
		
		System.out.println("Is your first number Binary or Decimal?");
		String bORd = input.nextLine();
		
		if(bORd.equals("Binary")) {
			System.out.println("What is your Binary Number?");
			biNum = input.nextLine();
			num1 = convertIntoDecimal(biNum);
		}else {
			System.out.println("What is your Decimal Number?");
			num1 = input.nextInt();
		}
		
		//-------------Number 2-------------
		
		System.out.println("Is your second number Binary or Decimal?");
		String bORd2 = input.nextLine();
		
		if(bORd2.equals("Binary")) {
			System.out.println("What is your Binary Number?");
			biNum = input.nextLine();
			num2 = convertIntoDecimal(biNum);
		}else {
			System.out.println("What is your Decimal Number?");
			num2 = input.nextInt();
		}
		
		//---Result---
		System.out.println("Do you want to Add or Multiply these numbers for binary conversion? Type x or +");
		String AddOrMult = input.nextLine();
		if(AddOrMult.equals("+")) {
			System.out.println("Your two numbers added together is " + convertIntoBinary((num1+num2)) + " in Binary.");
			
		}else {
			if(AddOrMult.equals("x")) {
				System.out.println("Your two numbers multiplied together is " + convertIntoBinary((num1*num2)) + " in Binary");
			}
			input.close();
		}
	}
	public static int convertIntoDecimal(String num) { 
		int answer=0;
		for(int i= num.length()-1; i >= 0; i--) {
			if(num.charAt(i) == '1') {
				answer += Math.pow(2,i);
			}else {
				answer += 0;
			}
		}
		return answer;
	}
	public static String convertIntoBinary(int num) {
		
		String result = "";
		int powerOf = -1;
		int remainder = 0;
		int totalRemain = num;
		//highest 1
		for(int i = 0; num-remainder >= 0; i++) {
			powerOf++;
			remainder += Math.pow(2,i);
		}
		for(int i = powerOf; i >= 0; i--) {
			if(totalRemain-Math.pow(2,i)>=0) {
				result= result + "1";
				totalRemain= totalRemain-(int)Math.pow(2,i);
			}else {
					result= result + "0";
				}
		}
		return result;
	}
}
