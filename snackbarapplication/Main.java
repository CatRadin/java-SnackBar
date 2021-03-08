package snackbarapplication;
public class Main
{
  private static void workWithData()
  {
    System.out.println("Initial compile is working");

    // Customers: Jane + Bob (String name, double cashOnHand)
      Customer cust1 = new Customer("Jane", 45.25);
      Customer cust2 = new Customer("Bob", 33.14);

   // VendingMachine food, drink and office~!
      VendingMachine food = new VendingMachine("Food");
      VendingMachine drink = new VendingMachine("Drink");
      VendingMachine office = new VendingMachine("Office");

  // Snack (String name, int quantity, double cost, int vendingMachineId)
      Snack chips = new Snack("Chips", 36, 1.75, food.getId());
      Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
      Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
      Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
      Snack water = new Snack("Water", 20, 2.75, drink.getId());


  // PROCESSING of the application!~

      cust1.buySnack(3, soda.getCost());
      soda.buySnackQuantity(3);
      System.out.println();
      System.out.println(cust1 + " cash on hand " + "$" + cust1.getCashOnHand());
      System.out.println("Quantity of soda  is " + soda.getQuantity());

      
      cust1.buySnack(1, pretzel.getCost());
      pretzel.buySnackQuantity(1);
      System.out.println();
      System.out.println(cust1 + " cash on hand " + "$" + cust1.getCashOnHand());
      System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

      
      cust2.buySnack(2, soda.getCost());
      soda.buySnackQuantity(2);
      System.out.println();
      System.out.println(cust2 + " cash on hand " + "$" + cust2.getCashOnHand());
      System.out.println("Quantity of soda is " + soda.getQuantity());

      
      cust1.addCash(10);
      System.out.println();
      System.out.println(cust1 + " cash on hand " + "$" + cust1.getCashOnHand());

      
      cust1.buySnack(1, chocolateBar.getCost());
      chocolateBar.buySnackQuantity(1);
      System.out.println();
      System.out.println(cust1 + " cash on hand " + "$" + cust1.getCashOnHand());
      System.out.println("Quantity of chocolate bar  is " + chocolateBar.getQuantity());

      
      pretzel.setQuantity(12);
      System.out.println();
      System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

      
      cust2.buySnack(3, pretzel.getCost());
      pretzel.buySnackQuantity(3);
      System.out.println();
      System.out.println(cust2 + " cash on hand " + "$" + cust2.getCashOnHand());
      System.out.println("Quantity of pretzel is " + pretzel.getQuantity());

      System.out.println();
      System.out.println("******* STRETCH GOALS *******");
      System.out.println();

      System.out.println("Snack: " + chips.getName());
      System.out.println("Vending Machine: " + food.getName());
      System.out.println("Quantity: " + chips.getQuantity());
      System.out.println("Total Cost: " + "$" + chips.getTotal(chips.getQuantity()));
      System.out.println();

      System.out.println("Snack: " + chocolateBar.getName());
      System.out.println("Vending Machine: " + food.getName());
      System.out.println("Quantity: " + chocolateBar.getQuantity());
      System.out.println("Total Cost: " + "$" + chocolateBar.getTotal(chocolateBar.getQuantity()));
      System.out.println();

      System.out.println("Snack: " + pretzel.getName());
      System.out.println("Vending Machine: " + food.getName());
      System.out.println("Quantity: " + pretzel.getQuantity());
      System.out.println("Total Cost: " + "$" + pretzel.getTotal(pretzel.getQuantity()));
      System.out.println();

      System.out.println("Snack: " + soda.getName());
      System.out.println("Vending Machine: " + drink.getName());
      System.out.println("Quantity: " + soda.getQuantity());
      System.out.println("Total Cost: " + "$" + soda.getTotal(soda.getQuantity()));
      System.out.println();

      System.out.println("Snack: " + water.getName());
      System.out.println("Vending Machine: " + drink.getName());
      System.out.println("Quantity: " + water.getQuantity());
      System.out.println("Total Cost: " + "$" + water.getTotal(water.getQuantity()));
      System.out.println();




  }

  public static void main(String[] args)
  {
    workWithData();
  }

}