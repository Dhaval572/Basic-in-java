// Single inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() 
	{
        System.out.println("Dog barks");
    }
}

public class Single_inheritance
{
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sound();
		
		Dog dog = new Dog();
		dog.sound();
	}
}