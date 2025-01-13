// Java does not support multiple inheritance through classes directly, but it allows a class to implement multiple interfaces. 

interface Animal 
{
    void eat();
}

interface Domestic 
{
    void pet();
}

class Dog implements Animal, Domestic 
{
    public void eat() {
        System.out.println("Eating");
    }
    
    public void pet() 
	{
        System.out.println("Being petted");
    }
}

public class Interface_based_multiple_inheritance
{
	public static void main(String args[])
	{
		Dog dog = new Dog();
		dog.eat();
		dog.pet();
	}
}