package Fundamentals_of_Java.Object_Oriented_Programming.classes_and_objects;

import java.util.Scanner;

class student
{
    //data members
    int studentID;
    String studentName;
    int studentAge;

    Scanner sc = new Scanner(System.in);

    //member functions
    public void getData()
    {
        System.out.println("Enter the student name");
        studentName = sc.nextLine();
        System.out.println("Enter the student ID");
        studentID = sc.nextInt();
        System.out.println("Enter the age of the student");
        studentAge = sc.nextInt();
    }

    public void displayData()
    {
        System.out.println("The name of the student is "+studentName+" of id: "+studentID+" having an age of "+studentAge);
    }
}
public class studentData {
    public static void main(String[] args) {
        student student = new student(); //creating an object of student class
        student.getData();
        student.displayData();

        student student1 = new student(); //creating another object of student class
        student1.getData();
        student1.displayData();
    }
}
