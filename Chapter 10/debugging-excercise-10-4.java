// A customer's purchase is approved if the
// purchase does not exceed the credit limit
public class DebugTen4
{
   public static void main(String args[])
   {
      int id = 12241;
      String name = "Franklin";
      double credit = 1000.00;
      double purchase = 1325.77;
      //missing the new keyword
      DebugCustomerMakingPurchase cust = new DebugCustomerMakingPurchase(id, name, credit, purchase);

      
      cust.display();
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class DebugCustomer
{
    protected int idNumber; //private
    protected String name; //private
    protected double creditLimit; //private
    //change parameter to credit & to a public class
    public DebugCustomer(int id, String name, double credit) 
    {
       idNumber = id;
       this.name = name; //this keyword
       creditLimit = credit;
    }
    public void display()
    {
        //closing quote missing after # & missing '+' after name
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;
    public DebugCustomerMakingPurchase(int id, String name, double credit, double purchAmount)
    {
       super(id, name, credit); //super to fill in superclass
       amountOfPurchase = purchAmount;
       if(amountOfPurchase > credit) //creditLimit not defined
          overLimit = true;
       else
          overLimit = false; //false
    }
    @Override
    public void display()
    {
       super.display(); //display both outputs
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit) //remove the closing semi
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
