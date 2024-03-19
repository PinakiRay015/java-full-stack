//iterating elements of an array using for each loop(it is also known as enhanced loop)
package Fundamentals_of_Java.conditional_statements;

public class for_each_loop {
    public static void main(String[] args) {
        int []array = {10 , 20 , 30 , 40 , 50};
        String []Boys = {"Rohan", "Aman", "Bikash", "Ayush", "Abhisek"};
        for(int elements : array) //for each loop
        {
            System.out.print(elements+" ");
        }
        System.out.println("");
        for(String names : Boys) //for each loop
        {
            System.out.print(names+" ");

        }
    }
}
