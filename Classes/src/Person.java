						import java.util.Scanner;
public class Person
{
	private String name;
	private int age;
	public void readPersonData()
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("What is this person's name?");
	name = scan.nextLine();
	System.out.println("What is this person's age?");
	age = scan.nextInt();
	while(age <= 0)
	{
		System.out.println("Person's age must be positive.");
		System.out.println("What is this person's age?");
		age = scan.nextInt();
	}
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setPerson(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public boolean equals(Person n)
	{
		return this.name.equalsIgnoreCase(n.name) && this.age == n.age;
	}
	public boolean hasSameName(Person n)
	{
		return this.name.equalsIgnoreCase(n.name);
	}
	public boolean hasSameAge(Person n)
	{
		return this.age == n.age;
	}
	public boolean isOlderThan(Person n)
	{
		return this.age > n.age;
	}
	public String toString()
	{
		return "Name: " + name + 
				"\nAge: " + age;
	}
}
