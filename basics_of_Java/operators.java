package basics_of_Java;

public class operators {
    public static void main(String[] args) {
        System.out.println("Operators in java");
        int a = 10;
        int b = 5;
        System.out.println("======Arithmetic operator======");
        System.out.println(a+b); //1) addition
        System.out.println(a-b); //2) subtraction
        System.out.println(a*b); //3) multiplication
        System.out.println(a/b); //4) division
        System.out.println(a%b); //5) modulus

        System.out.println("======Assignment operator======");
        int c = a;
        System.out.println(c);
        c += a; //c + a i.e 10 + 10
        System.out.println(c);
        c -= a; // c - a i.e 20-10
        System.out.println(c);
        c *= a; // c * a i.e 10 * 10
        System.out.println(c);

        System.out.println("======Relational operator======"); //it is a kind of boolean operator
        System.out.println(a == b); //equal to
        System.out.println(a > b); //greater than
        System.out.println(a >= b); //greater than or equal to
        System.out.println(a!=b); //not equal to
        System.out.println(a<b); //smaller than
        System.out.println(a<=b); //smaller than equal to

        System.out.println("======Logical operators======"); // it is used to check multiple conditions
        System.out.println(a>b && b<a); //AND operator... need both conditions to be satisfying to get true
        System.out.println(a>b || b==a); //OR operator... need any one condition to be satisfying to get true
        System.out.println(!(a >b && b<a)); //NOT operator... if condition is satisfying then it returns false.

        System.out.println("======Ternary Operator======"); //shortcut method of if-else statement
        System.out.println((a>b) ? "This is true" : "This is false"); //if the statement is true then it will print 1st statement otherwise the second statement
    }
}
