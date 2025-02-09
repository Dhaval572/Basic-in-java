// In hierarchical inheritance, multiple classes inherit from a single superclass.
class Animal 
{
    void eat() 
	{
        System.out.println("Eating");
    }
}

class Dog extends Animal 
{
    void bark() 
	{
        System.out.println("Barking");
    }
}

class Cat extends Animal 
{
    void meow() 
	{
        System.out.println("Meowing");
    }
}

public class Hierarchical_Inheritance
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		animal.eat();
		
		Dog dog = new Dog();
		dog.bark();

		Cat cat = new Cat();
		cat.meow();
	}
}