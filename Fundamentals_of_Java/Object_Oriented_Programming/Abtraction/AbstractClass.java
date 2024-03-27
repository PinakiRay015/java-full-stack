package Fundamentals_of_Java.Object_Oriented_Programming.Abtraction;

abstract class animal
{

    public abstract void roar();
    public void sleep()
    {
        System.out.println("Zzz");
    }
}

class Dog extends animal
{
    public void roar()
    {
        System.out.println("Bow bow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.roar();
        dog.sleep();

    }
}
