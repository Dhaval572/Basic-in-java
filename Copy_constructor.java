class Person
{
	String name;

	Person(String name)
	{
		this.name = name;
	}
	
	Person(Person other)
	{
		this.name = other.name;
	}

	void display()
	{
		System.out.println("Name: " + name);
	}
}

public class Copy_constructor
{
	public static void main(String[] args)
	{
		Person person1 = new Person("John");
		Person person2 = new Person(person1);

		System.out.println("Person 1:");
        person1.display();

		System.out.println("Person 2 (copied from Person 1):");
        person2.display();
	}
}