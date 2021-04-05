package snackbarapplication;

public class VendingMachine 
{
    //Feilds ---------------------------
    private static int maxId = 1; //Static means it will always point to the same point in memory. Its the same everywhere.
    private int id;
    String name;

    //Constructor ----------------------
    public vendingMachine(String name)
    {
        this.name = name;
    }

    //Getters & Setters ----------------

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


}
