package Fundamentals_of_Java.conditional_statements;

public class nested_if_else {
    public static void main(String[] args) {
        int sp = 800;
        int bp = 700;

        if(sp>bp)
        {
            System.out.println("profit");
        }
        else
        {
            if(bp==sp)
            {
                System.out.println("No profit no loss");
            }
            else
            {
                System.out.println("loss");
            }
        }
    }
}
