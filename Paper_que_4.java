/* Write a program in Java which has a class Student having two instance
variables enrollment no and name. Create 5 objects of Student class in main
method and display student’s name */

class Student {

    private final int enoNum;
    String name;

    public Student(String name, int enoNum) {
        this.enoNum = enoNum;
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name + ", Enrollment no: " + enoNum);
    }
}

public class Paper_que_4 {

    public static void main(String[] args) {
		Student s1 = new Student("Harsh", 3124345 );
		Student s2 = new Student("Bhavya", 3124346 );
		Student s3 = new Student("Aaditya", 3124347 );
		Student s4 = new Student("Priyank", 3124348 );
		Student s5 = new Student("Laracroft", 3124349 );

		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();

		// Short-cut techniqe😁
		// String[] names = {"Harsh", "Bhavya", "Aaditya", "Priyank", "Laracroft"};
		// Student[] students = new Student[5];
		
		// for (int i = 0; i < 5; i++) {
		// 	students[i] = new Student(names[i], 3124345 + i);
		// 	students[i].display();
		// }

    }
}