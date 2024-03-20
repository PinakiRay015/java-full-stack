//Access modifiers in java.
//There are four types of Java access modifiers:
//Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
//Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
//Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
//Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
package Fundamentals_of_Java.Object_Oriented_Programming.Access_Modifiers;

class studentBio
{
    int marks;

    private int studentRoll; //private access modifier. accessible within only the class. In order to access we need to use getters and setters.

    protected String collegeName = "IIT KGP"; //protected access modifiers. Accessible from within or outside through a child class
    public int getStudentRoll() //getter function to return the roll number
    {
        return studentRoll;
    }

    public void setStudentRoll() //setter function to set the roll number
    {
        studentRoll = 149;
    }

    void studentMarks() //default access modifier. Accessible from anywhere within the package
    {
        marks = 90;
    }

    public void display() //public access modifier. Accessible from anywhere like within/outside the package and within/outside the class
    {
        System.out.println("Mark obtain by student is: "+marks);
    }

}

class College extends studentBio
{
    public void clgName()
    {
        System.out.println("The name of the college is "+collegeName);
    }
    }
public class student {
    public static void main(String[] args) {
        studentBio student = new studentBio();
        College college = new College();
        student.studentMarks();
        student.display();
        student.setStudentRoll();
        System.out.println("The roll number of student is "+student.getStudentRoll());
        college.clgName();

    }
}
