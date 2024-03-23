package Fundamentals_of_Java.Object_Oriented_Programming.Inheritance;

class android
{
    void os()
    {
        System.out.println("Runs on android os");
    }
}

class Samsung extends android
{
    void battery()
    {
        System.out.println("Gives 6000 Mah battery support");
    }
}
public class mobile {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.os();
        samsung.battery();
    }
}
