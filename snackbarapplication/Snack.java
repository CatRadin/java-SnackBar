package snackbarapplication;

public class Snack 
{

    //Feilds ------------------
    private static int maxId = 1; //Static means it will always point to the same point in memory. Its the same everywhere.
    private int id;

    private String name;
    private int quantity;
    private double cost;

    private int vendingMachineId;


    //Constructor ----------------------------------
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    //Getters and Setters --------------------------

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

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }




}
