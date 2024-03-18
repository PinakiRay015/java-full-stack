package Fundamentals_of_Java.Arrays_And_Strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String string = "Rohan Ray"; //normal declaration
        String string1 = new String("Pinaki"); //new keyword declaration

        //String methods
        System.out.println(string.compareTo(string1)); //compares the string lexicographically
        System.out.println(string.replace(string , "ajay")); //replace the string with new string
        System.out.println(string.length()); //tells the length of the string
        System.out.println(string.contains("han")); //checks weather a string contains a substring in it?
        System.out.println(string.trim()); //removes any leading and trailing white spaces
        System.out.println(string.concat(string1)); //concat two strings
        System.out.println(string.indexOf('a')); //returns the index position of the character
        System.out.println(string.substring(1 , 6)); //returns the sub-string of a string from beginner(index) to ending(exclusive)
        System.out.println(string.toUpperCase()); //converts the string to uppercase;
        System.out.println(string.toLowerCase()); //converts the string to lowercase;
    }
}
