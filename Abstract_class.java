abstract class Animal 
{
    abstract void sound(); // Abstract function

    void eat() 
    {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal 
{
    @Override
    void sound() 
    {
        System.out.println("The dog barks.");
    }
}

// You can also make abstract class which inherits from abstract class
abstract class Cat extends Animal
{
	// Statements
}

public class Abstract_class
{
	public static void main(String args[])
	{
		Animal myDog = new Dog();

        myDog.sound();
        myDog.eat();
	}
}