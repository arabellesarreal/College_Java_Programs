import java.util.Scanner;
public class StudentDemo
{
public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	Student person = new Student ();// one Student
	int numberOfStudents, i;
 	System.out.println("Enter number of Students:");
 	numberOfStudents = scan.nextInt( );

	for(i = 0; i < numberOfStudents; i++)
 	{
   		person.readInput();
      	person.calculateGrade();
       	person.writeOutput();
       	
	}

    }
}
/* sample output with numbers that are accurately computed:
Student John J Smith
had these scores
	First quiz 7
	Second quiz 8
	Midterm exam 90
	Final exam 80
the total score is 81.25
the letter grade is "B"  */
