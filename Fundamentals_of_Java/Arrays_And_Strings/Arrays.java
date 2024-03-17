package Fundamentals_of_Java.Arrays_And_Strings;

public class Arrays {
    public static void main(String[] args) {
        int []array = new int[5]; //initializing a one dimensional array of size 5
        for(int i=0,j=10 ; i<array.length ; i++,j++) //initializing values inside arrays
        {
            array[i] = j;
        }

        for(int i : array) //displaying of element inside array
        {
            System.out.print(array[i]+" ");
        }
    }
}
