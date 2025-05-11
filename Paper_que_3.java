/* Write a program in java which has an abstract class Shape, having three
subclasses: Triangle, Rectangle, and Circle. Define method area() in the
abstract class Shape and override area() method in subclasses to calculate the
area. */

abstract class Shape {

    abstract double area();
}

class Triangle extends Shape {

    private final double l1, l2;

    public Triangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    double area() {
        return (l1 *  l2) / 2;
    }
}

class Rectangle extends Shape {

    private final double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Paper_que_3 {

    public static void main(String[] args) {
        Shape triangle = new Triangle(4, 5);
        Shape rectangle = new Rectangle(4, 6);
        Shape circle = new Circle(3);

        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
