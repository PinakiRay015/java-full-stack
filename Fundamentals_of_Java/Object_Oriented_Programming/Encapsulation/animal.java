package Fundamentals_of_Java.Object_Oriented_Programming.Encapsulation;

class mammal
{
    private String skinColor;

    void setSkinColor(String skinColor)
    {
        this.skinColor = skinColor;
    }

    String getSkinColor()
    {
        return this.skinColor;
    }
}
public class animal extends mammal {
    public static void main(String[] args) {
        animal animal = new animal();
        animal.setSkinColor("Deep brown");
        System.out.println("The color of the skin is: "+animal.getSkinColor());
    }
}
