public class BookDemo
{//*** There has to be a program that uses the Book class.
public static void main(String[] args)
{
//*** Four instances of Books are created.
//*** new is used to give the Book instances memory.
Book schoolBook = new Book( );
Book bedReadingBook = new Book( );
Book cookBook = new Book( );
Book newBook = new Book();
newBook.setBook("Computers","IT", 10, 200);
System.out.println("newBook is. "+ newBook);
System.out.println("Enter school book information.");
//*** The method readBookData() is called.
//*** An instance of Book is needed to connect this Demo
//*** program with the Book class.
schoolBook.readBookData( );
System.out.println("Enter bed reading book information.");
bedReadingBook.readBookData( );
System.out.println("Enter cookbook information.");
cookBook.readBookData( );
//*** schoolBook calls its getBookCost() method. A double is
//*** returned and converted to a String and printed.
System.out.println("The cost of your school book is $" + schoolBook.getCost());
//*** The Book toString() method is invoked automatically in a
//*** System.out.println() method.
//*** Could invoke it with bedReadingBook.toStirng().
System.out.println("Your bed reading book is " + bedReadingBook);
//*** schoolBook invokes its equals()method.
//*** bedReadingBook is brought in and the instance variables are
//*** compared. If they are equal the method returns true
if(schoolBook.equals(bedReadingBook))
{
System.out.println("The school and bed reading books are the same!");
}
else
{
System.out.println("Your school book is not the same as your bed reading book!" );
}
//*** The add() method is called. A new instance of Book is created.
//*** The add operations dictated by the method
//*** body are performed on bedReadingBook and cookBook.
//*** The new instance of Book is returned and assigned to newBook.
newBook = bedReadingBook.add(cookBook);
System.out.println("Creating a new book from the bed reading "
+ "book added to the cookbook is\n " + newBook);
}
}