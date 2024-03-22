package Fundamentals_of_Java.Object_Oriented_Programming.classes_and_objects;

class employee
{
    String name;
    int age,salary;

    public employee(String name , int age, int salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public employee()
    {
        System.out.println("The average salary is around 9 LPA");
    }

    public void show()
    {
        System.out.println("Employee name: "+name);
        System.out.println("Age of the employee: "+age);
        System.out.println("Salary of the employee: "+salary);
        System.out.println("");
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        new employee();
        employee employee1 = new employee("Rakesh" , 22 , 50000);
        employee1.show();
        employee employee2 = new employee("Rohan" , 22 , 60000);
        employee2.show();
    }
}
