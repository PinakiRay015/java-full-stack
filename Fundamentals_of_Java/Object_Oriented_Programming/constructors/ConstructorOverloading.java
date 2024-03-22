package Fundamentals_of_Java.Object_Oriented_Programming.constructors;

class ferrari
{
    public ferrari(int modelNumber)
    {
        System.out.println("Model number: "+modelNumber);
    }

    public ferrari(String modelName)
    {
        System.out.println("Model name: "+modelName);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        new ferrari("sf90");
        new ferrari(8494);
    }
}
