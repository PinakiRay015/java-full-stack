//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//The abstract keyword is a non-access modifier, used for classes and methods:
//1) Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//2) Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
//An abstract class can have both abstract and regular methods:
package Fundamentals_of_Java.Object_Oriented_Programming.Encapsulation;

abstract class employee
{
    void name()
    {
        System.out.println("The name of the employee is Rakesh");
    }

    abstract void salary();
}

class experienced extends employee
{
    void salary()
    {
        System.out.println("The salary of experienced employee is of around 15 LPA");
    }
}
public class abstraction {
    public static void main(String[] args)
    {
        experienced exp = new experienced();
        exp.name();
        exp.salary();
    }
}
