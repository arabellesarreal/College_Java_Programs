public class PersonDemo {
public static void main(String[] args) {
Person person1 = new Person();
Person person2 = new Person();
person1.readPersonData();
person2.readPersonData();
System.out.println("Person1 name: " + person1.getName());
System.out.println("Person1 age: " + person1.getAge());
System.out.println("Person2 name: " + person2.getName());
System.out.println("Person2 age: "+ person2.getAge());
System.out.println();
person1.setName("John Doe");
person2.setName("Jane Dean");
System.out.println("The next two lines should read \"John Doe\" and \"Jane Dean\".");
System.out.println(person1.getName());
System.out.println(person2.getName());
System.out.println();
person1.setAge(30);
person2.setAge(30);
System.out.println("The next two line should read \"30\" and \"30\".");
System.out.println(person1.getAge());
System.out.println(person2.getAge());
System.out.println();
person1.setPerson("John Dean", 31);
person2.setPerson("Jane Doe", 31);
System.out.println("The next two lines should read \"John Dean, 31\" and \"Jane Doe, 31\".");
System.out.println(person1.getName()+", "+person1.getAge());
System.out.println(person2.getName()+", "+person2.getAge());
System.out.println("\ngetNameTest");
System.out.println("Person1 name: " + person1.getName());
System.out.println("Person2 name: " + person2.getName());
System.out.println("\ngetAgeTest");
System.out.println("Person1 age: " + person1.getAge());
System.out.println("Person2 age: " + person2.getAge());
System.out.println("\nequalsTest.");
if (person1.equals(person2))
{
System.out.println("Person1 equals Person2.");
}
else
System.out.println("Person1 DOES NOT equal Person2.");
System.out.println("\nhasSameNameTest.");
if (person1.hasSameName(person2))
System.out.println("Person1 has the same name as Person2.");
else
System.out.println("Person1 DOES NOT have the name as Person2.");
System.out.println("\nisOlderThanTest.");
if (person1.isOlderThan(person2))
System.out.println("Person1 is older than Person2");
else
System.out.println("Person1 is NOT older than Person2.");
System.out.println("\ntoStringTest");
System.out.println("Person1.");
String toStringVariable = person1.toString();
System.out.println(toStringVariable);
System.out.println("Person2.");
String toStringVariable2 = person2.toString();
System.out.println(toStringVariable2);
}
}