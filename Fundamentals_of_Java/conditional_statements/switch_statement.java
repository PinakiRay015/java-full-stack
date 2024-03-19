//switch statement is used to switch between the given options
package Fundamentals_of_Java.conditional_statements;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 50;
        int num2 = 30;
        System.out.println("1->Addition");
        System.out.println("2->subtraction");
        System.out.println("Enter the option");
        int choice = sc.nextInt();
        switch (choice) //if the value of choice is 1 then case will get executed and if the value of choice is 2 then case 2 will get executed
        {
            case 1->System.out.println(num1+num2);
            case 2-> System.out.println(num1-num2);
            default -> System.out.println("Invalid option"); //if user enter neither 1 or 2 then default part will get run
        }
    }
}
