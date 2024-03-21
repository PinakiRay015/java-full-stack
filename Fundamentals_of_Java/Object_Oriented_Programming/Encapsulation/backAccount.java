//Encapsulation in Java is a process of wrapping code and data together into a single unit.
//Here essential data were wrapped into single unit named accountInfo. To control the data member getters and setters were used.
package Fundamentals_of_Java.Object_Oriented_Programming.Encapsulation;

class accountInfo
{
    private long accNumber;
    private String name;
    private float amount;

    long getAccNumber()
    {
        return this.accNumber;
    }

    void setAccNumber(long accNumber)
    {
        this.accNumber = accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
public class backAccount extends accountInfo {
    public static void main(String[] args)
    {
        backAccount myAccount = new backAccount();
        myAccount.setAccNumber(5768949);
        myAccount.setName("Pinaki sankar ray");
        myAccount.setAmount(150450.50f);
        System.out.println("Dear "+myAccount.getName()+" Your account number "+myAccount.getAccNumber()+" amount "+myAccount.getAmount()+" has debited");
    }
}
