package Fundamentals_of_Java.Object_Oriented_Programming.polymorphism;

import java.util.Scanner;

class studentAcademyBio
{
    String name;
    int marks;
    public studentAcademyBio(String name , int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public void print()
    {
        System.out.println("Name of the student is "+name);
        System.out.println("Marks obtained by the student is "+marks);
    }
}

class studentSportsBio extends studentAcademyBio
{
    String sports;

    public studentSportsBio(String sports, String name, int marks)
    {
        super(name , marks);
        this.sports = sports;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Sports activity taken by the student: "+sports);
    }
}
public class methodOverride {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter the sports club taken by the student");
        String sports = sc.nextLine();
        System.out.println("Enter the total marks obtained by the student");
        int marks = sc.nextInt();

        studentSportsBio stdData = new studentSportsBio(sports , name , marks);
        stdData.print();
    }
}
