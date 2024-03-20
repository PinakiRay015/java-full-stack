//FizzBuzz is a fun game played generally by school children. It is simple game in which when your turn comes, you need to say the next number. So, here are rules of the game:
//        If number is divisible by 3, then you need to say Fizz
//        If number is divisible by 5, then you need to say Buzz
//        If number is divisible by 3 and 5 both, then you need to say FizzBuzz
//        Else you just need to say next number
package Fundamentals_of_Java.conditional_statements;

import java.util.Scanner;

public class FizzBuzz_Problem_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total students");
        int value = sc.nextInt();
        for(int i=1 ; i<=value ; i++)
        {
            if(i % 3 == 0)
            {
                if(i % 5 == 0)
                {
                    System.out.print("FizzBuzz ");
                }
                else
                {
                    System.out.print("Fizz ");
                }
            }
            else if(i % 5 == 0)
            {
                if(i % 3 == 0)
                {
                    System.out.print("FizzBuzz ");
                }
                else
                {
                    System.out.print("Buzz ");
                }
            }
            else
            {
                System.out.print(i+" ");
            }
        }
    }
}
