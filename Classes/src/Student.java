import java.util.Scanner;
public class Student
{
	Scanner scan = new Scanner(System.in);
	private String name;
	private int firstQuiz;
	private int secondQuiz;
	private int midtermExam;
	private int finalExam;
	private int grade = -1;
	private double total;
	private String letterGrade;
	
	public void readInput()
	{
		System.out.println("Enter Student's Full Name:");
		name = scan.nextLine();
		while(grade > 10 || grade < 0)
		{
			System.out.println("Enter the first quiz grade: ");
			grade = scan.nextInt();
		}
		firstQuiz = grade;
		grade = -1;
		while(grade > 10 || grade < 0)
		{
			System.out.println("Enter the second quiz grade: ");
			grade = scan.nextInt();
		}
		secondQuiz = grade;
		grade = -1;
		while(grade > 100 || grade < 0)
		{
			System.out.println("Enter the midterm exam grade: ");
			grade = scan.nextInt();
		}
		midtermExam = grade;
		grade = -1;
		while(grade > 100 || grade < 0)
		{
			System.out.println("Enter the final exam grade: ");
			grade = scan.nextInt();
		}
		finalExam = grade;
	}
	public void calculateGrade()
	{
		total = computeTotalScore();
		computeFinalGrade();
	}
	public void writeOutput()
	{
		System.out.println("Student " + name + 
				"\nhad these scores" + 
				"\n    First quiz " + firstQuiz +
				"\n    Second quiz " + secondQuiz +
				"\n    Midterm exam " + midtermExam +
				"\n    Final exam " + finalExam +
				"\nthe total score is " + total + 
				"\nthe letter grade is \"" + letterGrade + "\" ");
	}
	private double computeTotalScore()
	{
		return (0.5*finalExam) + (0.25*midtermExam) + (((firstQuiz + secondQuiz)*5)*0.25);
	}
	private void computeFinalGrade()
	{
		if(total >= 90)
			letterGrade = "A";
		else
			if(total <= 89 && total > 80)
				letterGrade = "B";
			else
				if(total <= 79 && total > 70)
					letterGrade = "C";
				else
					if(total <= 69 && total > 60)
						letterGrade = "D";
					else
						if(total <= 60)
							letterGrade = "F";
	}
}