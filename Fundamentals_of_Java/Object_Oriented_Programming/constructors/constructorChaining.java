//Constructor chaining in java means to connect multiple constructors and link to each other.
//Here in this example i called the default constructor which is linked to the 2-parameter constructor and it's again connect to 3-parameter constructor.
//So that's why the 3-parameter constructor gets printed first and then the 2-parameter and then the default constructor.
package Fundamentals_of_Java.Object_Oriented_Programming.constructors;

class vehicle
{
    public vehicle()
    {
        this(5);
        System.out.println("Default constructor");
    }

    public vehicle(int x)
    {
        this(5 , 6);
        System.out.println(x);
        System.out.println("2 parameterized constructor");
    }

    public vehicle (int x , int y)
    {
        System.out.println(x * y);
        System.out.println("3 parameterized constructor");
    }
}
public class constructorChaining {
    public static void main(String[] args)
    {
        new vehicle();
    }
}
