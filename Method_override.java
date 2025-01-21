// Parent class
class Animal 
{
    void sound() 
	{
        System.out.println("Animals make sounds");
    }
}

// Subclass
class Dog extends Animal 
{
    @Override
    void sound() 
	{
        System.out.println("Dog barks");
    }
}

public class Method_override
{
	public static void main(String args[])
	{
		Animal myAnimal = new Animal(); 
        myAnimal.sound();

        Animal myDog = new Dog(); 
        myDog.sound();
	}
}