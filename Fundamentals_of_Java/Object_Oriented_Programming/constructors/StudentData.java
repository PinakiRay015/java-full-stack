//default constructor and parameterized constructor
package Fundamentals_of_Java.Object_Oriented_Programming.constructors;

class Student
{
    String city;
    private int marks;
    private String name;
    private int roll;

    public Student() //default constructor
    {
        this.name = "Rohan";
        this.roll = 56;
        this.marks = 67;
    }

    public Student(String city) //parameterized constructor
    {
        this.city = city;
        System.out.println("The student belongs from the city: "+city);
    }

    void display()
    {
        System.out.println("Name of the student is "+name);
        System.out.println("Roll number of the student is "+roll);
        System.out.println("Marks obtained by the student is "+marks);
    }
}
public class StudentData {
    public static void main(String[] args)
    {
        Student student = new Student();
        student.display();
        new Student("Baripada");
    }
}
