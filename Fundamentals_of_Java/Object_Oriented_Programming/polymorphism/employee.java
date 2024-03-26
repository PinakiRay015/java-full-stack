//polymorphism in java. Polymorphism can be achieved by two methods. one is method overloading (compile time polymorphism) and other one is
//method overriding (runtime polymorphism).
package Fundamentals_of_Java.Object_Oriented_Programming.polymorphism;

class experiencedEmployee
{
    public void shift()
    {
        System.out.println("Experienced employee having Day shift");
    }

    public void shift(int num1, int num2)  //method overloading. It is also called static polymorphism which is a compile time polymorphism.
    {
        System.out.println("Number of night shift employees are of "+num1+" and number of day shift employees are of "+num2);
    }
}

class fresherEmployee extends experiencedEmployee
{
    @Override       //method overriding. It is also called dynamic polymorphism which is a runtime polymorphism.
    public void shift()
    {
        super.shift();
        System.out.println("Fresher having Night shift");
    }
}

public class employee {
    public static void main(String[] args)
    {
        fresherEmployee freshEmp = new fresherEmployee();
        freshEmp.shift();
        freshEmp.shift(12000 , 4000);
    }
}
