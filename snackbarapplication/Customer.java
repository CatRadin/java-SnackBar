package snackbarapplication;

public class Customer 
{
     //Feilds ---------------------------
     private static int maxId = 1; //Static means it will always point to the same point in memory. Its the same everywhere.
     private int id;
     private String name;
     private double cashOnHand;

     //Constructor ----------------------

     public Customer(String name, double cashOnHand)
     {

        maxId++;
        id = maxId;

         this.name = name;
         this.cashOnHand = cashOnHand;
     }

     //Getters & Setters -----------------------

     public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand)
    {
        this.cashOnHand = cashOnHand;
    }

    //Methods ---------------------------------

    // Add cashOnHand
  public void addCash(double addCash)
  {
    this.cashOnHand += addCash;
  }

// Buy snacks
  public void buySnack(int snackQuantity, double snackCost)
  {
    this.cashOnHand -= snackCost * snackQuantity;
  }

    //Two String Overide
    @Override
    public String toString()
    {
      return "Customer: " + name;
  
    }
    
}
