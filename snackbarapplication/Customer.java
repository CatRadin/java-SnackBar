package snackbarapplication;

public class Customer 
{
     //Feilds ---------------------------
     private static int maxId = 1; //Static means it will always point to the same point in memory. Its the same everywhere.
     private int id;
     String name;
     double cashOnHand;

     //Constructor

     public Customer(String name, double cashOnHand)
     {
         this.name = name;
         this.cashOnHand = cashOnHand;
     }
    
}
