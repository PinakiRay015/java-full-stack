package Fundamentals_of_Java.Arrays_And_Strings;

public class StringBuffer_and_stringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Rohan");
        //string buffer
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.append(" Ray")); //appending a string
        System.out.println(stringBuffer.insert(2 , "ooo")); //adding a string at a particular index location
        System.out.println(stringBuffer.delete(2, 5)); //deleting from substring from the string from the start(inclusive) and end(exclusive)
        System.out.println(stringBuffer.replace(0 , 5 , "Pinaki")); //replacing the substring with new substring mentioning the start(inclusive) and end(exclusive) points

    }
}
