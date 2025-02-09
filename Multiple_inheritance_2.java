interface Parent1 
{
    default void printMessage() 
    {
        System.out.println("Message from Parent1");
    }
}

interface Parent2 
{
    default void printMessage() 
    {
        System.out.println("Message from Parent2");
    }
}

class Child implements Parent1, Parent2 
{
    @Override
    public void printMessage() 
    {
        Parent1.super.printMessage();
    }
}

public class Multiple_inheritance_2
{
    public static void main(String[] args) 
    {
        Child child = new Child();
        child.printMessage();
    }
}