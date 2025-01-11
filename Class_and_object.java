
class Person {

    String name;
    int age;

    // Public constructure
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() 
	{
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Class_and_object 
{

    public static void main(String[] args)
	{
		Person person1 = new Person("Dhaval", 18);
		person1.introduce();

		Person person2 = new Person("XYZ", 00);
		person2.introduce();
    }
}
