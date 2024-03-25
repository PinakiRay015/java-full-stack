package Fundamentals_of_Java.Object_Oriented_Programming.Inheritance;

class class1
{
    public void class1Property()
    {
        System.out.println("This is the property of class 1");
    }
}

class class2 extends class1
{
    public void class2Property()
    {
        System.out.println("This is the property of class 2");
    }
}

class class3 extends class2
{
    public void class3Property()
    {
        System.out.println("This is the property of class 3");
    }
}
public class MultiLevel {
    public static void main(String[] args)
    {
        class3 cls = new class3();
        cls.class1Property();
        cls.class2Property();
        cls.class3Property();
    }
}
