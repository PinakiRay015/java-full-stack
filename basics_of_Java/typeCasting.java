//type casting in java
package basics_of_Java;

public class typeCasting {
    public static void main(String[] args)
    {
        //implicit type casting i.e. from smaller to bigger
        byte num1 = 12;
        int num2 = num1;
        System.out.println(num2);

        //explicit type casting i.e. from bigger to smaller
        long num3 = 123;
        int num4 = (int)num3;

        System.out.println(num4);


    }
}
