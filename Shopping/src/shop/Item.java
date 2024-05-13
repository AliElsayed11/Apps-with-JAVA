package shop;
import java.text.NumberFormat;
public class Item
{
    private String name;
    private double price;
    private int weight;
    //  Create a new item with the given attributes.
    public Item (String itemName, double itemPrice, int Purchased)
    {
        name = itemName;
        price = itemPrice;
        weight = Purchased;
    }
    // Return a string with the information about the item
    public String toString ()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t\t" + weight + "\t\t"+ fmt.format(price*weight));
    }
    public double getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
    public int getQuantity()
    {
        return weight;     }}