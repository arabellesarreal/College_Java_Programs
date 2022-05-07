import java.util.Scanner;
public class Book
{
	private String title;
	private String category;
	private double cost;
	private int pageNumber;
	public void readBookData( )
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the title of the book?");
		this.title = scan.nextLine( );
		System.out.println("What is the category of the book?");
		this.category = scan.nextLine( );
		System.out.println("How many pages does it have?");
		this.pageNumber = scan.nextInt( );
		while(pageNumber <= 0)
		{
			System.out.println("Number of pages must be positive.");
			System.out.println("How many pages does it have?");
			this.pageNumber = scan.nextInt( );
		}
		System.out.println("What is the cost?");
		this.cost = scan.nextDouble( );
		while(cost <= 0)
		{
			System.out.println("Cost must be positive.");
			System.out.println("What is the cost?");
			this.cost = scan.nextDouble( );
		}
	}
	public String getTitle( )
	{
		return this.title;
	}
	public double getCost( )
	{ 
		return this.cost;
	}
	public String getCategory( )
	{ 
		return this.category;
	}
	public int getPageNumber()
	{
		return this.pageNumber;
	}
	public void setTitle(String title)
	{ 
		this.title = title;
	}
	public void setCategory(String category)
	{ 
		this.category = category;
	}
	public void setPageNumber(int pageNumber)
	{ 
		this.pageNumber = pageNumber;
		if(this.pageNumber <= 0)
		{
			System.exit(0);
		}
	}
	public void setCost (int cost)
	{
		this.cost = cost;
		if(this.cost <= 0)
		{
			System.exit(0);
		}
	}
	public void setBook(String title, String category, double cost, int pageNumber)
	{	
		this.title = title;
		this.cost = cost;
		this.category = category;
		this.pageNumber = pageNumber;
	}
	public void setBook(Book b)
	{	
		this.title = b.title;
		this.cost = b.cost;
		this.category = b.category;
		this.pageNumber = b.pageNumber;
	}
	public Book add(Book other)
	{
		Book answer = new Book();
		answer.title = other.title;
		answer.cost = other.cost + this.cost;
		answer.category = other.category;
		answer.pageNumber = other.pageNumber + this.pageNumber;
		return answer;
	}
	public String toString()
	{
	return "\nTitle     "+ title + 
			"\n" + "Category  " + category 	+ 
			"\n" + "Cost      " + cost +
			"\npages     " + pageNumber;
	}
	public boolean equals(Book n)
	{	return this.title.equalsIgnoreCase(n.title)
			&& this.category.equalsIgnoreCase(n.category)
			&& cost == n.cost && pageNumber == n.pageNumber;
	}
}