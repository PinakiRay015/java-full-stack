// Constructor is a special method implicitly initiated during the instantiation of a class or object.
// There is no need to explicitly call the constructor; it's invoked automatically when an object is created.
package Fundamentals_of_Java.Object_Oriented_Programming.constructors;

class android
{
    //constructor.(It should be of same name as of class)
     public android() {   //default constructor
         System.out.println("Based on android 14");
    }

    public android(int modelNumber)   //parameterized constructor
    {
        System.out.println("Model number is "+modelNumber);
    }

    //function to display the model name
    public void modelName()
    {
        System.out.println("Samsung galaxy f54");
    }
}
public class sample {
    public static void main(String[] args) {
        // Creating an object of the Android class
        // The constructor is automatically called upon object creation
        android android = new android();

        //calling the parameterized constructor
        new android(56748);
        // Calling the modelName method
        android.modelName();
    }
}
