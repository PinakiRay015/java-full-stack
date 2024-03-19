package Fundamentals_of_Java.conditional_statements;

public class else_if {
    public static void main(String[] args)
    {
        int sellingPrice = 200;
        int buyingPrice = 100;

        if(sellingPrice > buyingPrice)
        {
            System.out.println("Profit");
        } else if (buyingPrice > sellingPrice) {
            System.out.println("loss");
        }
        else
        {
            System.out.println("No profit no loss");
        }
    }
}
