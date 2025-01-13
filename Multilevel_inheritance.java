// In multilevel inheritance, a class is derived from another class, which is also derived from another class, creating a chain of inheritance.
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Playing");
    }
}

public class Multilevel_inheritance
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		animal.eat();

		Dog dog = new Dog();
		dog.bark();

		Puppy puppy = new Puppy();
		puppy.play();
	}
}