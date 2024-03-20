//jump statement in java. Jump statement usually contains "break" and "continue"
package Fundamentals_of_Java.conditional_statements;

import java.util.Scanner;

public class jump_statements {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the message");
            String msg = sc.nextLine();
            if(msg.equals("quit"))
            {
                break;  //If the user will enter the "quit" keyword then the loop will get close
            }
            if(msg.equals("pass"))
            {
                continue; //If the user will enter the "pass" keyword then it will continue the loop AGAIN without executing the remaining operation below the continue statement inside the loop
            }
            System.out.println("Hello developers!!");
            System.out.println("Thanks for choosing java");
            System.out.println("Your message is: "+msg);
        }
    }
}
