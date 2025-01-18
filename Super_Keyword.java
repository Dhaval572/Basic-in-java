// Super keyword in java

class Animal 
{
   	public String name;

    Animal(String name) 
    {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    public void speak() 
    {
        System.out.println("Animal makes a sound");
    }
};

class Dog extends Animal 
{
    Dog(String name) 
    {
        super(name);
        System.out.println("Dog Constructor called");
    }

	@Override
    public void speak() 
    {
        System.out.println("Dog barks");
    }
};

public class Super_Keyword 
{
    public static void main(String args[]) 
    {
        Dog dog = new Dog("Buddy");
        dog.speak();
    }
};
