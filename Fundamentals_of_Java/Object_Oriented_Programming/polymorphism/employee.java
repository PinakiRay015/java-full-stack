package Fundamentals_of_Java.Object_Oriented_Programming.polymorphism;

class experiencedEmployee
{
    public void shift()
    {
        System.out.println("Experienced employee having Day shift");
    }
}

class fresherEmployee extends experiencedEmployee
{
    @Override
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
    }
}
