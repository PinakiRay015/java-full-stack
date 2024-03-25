package Fundamentals_of_Java.Object_Oriented_Programming.Inheritance;

import org.w3c.dom.ls.LSOutput;

class androidDevice
{
    public void os()
    {
        System.out.println("This is android 14");
    }
}

class samsungF54 extends androidDevice
{
    public void processor()
    {
        System.out.println("Comes with mediatek processor");
    }
}

class redmiNote13 extends androidDevice
{
    public void processor()
    {
        System.out.println("Comes with snapdragon processor");
    }
}
public class hierarchical {
    public static void main(String[] args)
    {
        samsungF54 samsungF54 = new samsungF54();
        System.out.println("====Samsung f54======");
        samsungF54.os();
        samsungF54.processor();
        redmiNote13 redmiNote13 = new redmiNote13();
        System.out.println("======Redmi note 13======");
        redmiNote13.os();
        redmiNote13.processor();
    }
}
