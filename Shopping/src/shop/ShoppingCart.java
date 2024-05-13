package shop;
import java.text.NumberFormat;
public class ShoppingCart
{
    private int count;      
    private double totalCost;  
    private Item shopping_cart[];
    // an empty shopping cart with a capacity of 10 items.
    public ShoppingCart()
    {
        shopping_cart = new Item[10];
        count = 0;
        totalCost = 0.0;
    }
    //  Adds an item to the shopping cart.
    public void addToCart(String itemName, double itemcost, int weight)
    {
   if (count == shopping_cart.length)
   {
   increaseSize();
   }
  shopping_cart[count] = new Item(itemName, itemcost, weight);
  totalCost += (itemcost * weight);
  count++;
 } 
    //  Returns the contents of the cart together with summary information.
    public String summary_information()
    {
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
  String contents = "\nThe Shopping Cart\n";
  contents += "\nItem\tUnit Price\tWeight\tTotal\n";
  
        for (int i = 0; i < count; i++)
            contents += shopping_cart[i] + "\n";
        contents += "\nTotal Cost: " + fmt.format(totalCost);
        contents += "\n";
        return contents;
    }
    //  Increases the capacity of the shopping cart by 3
    private void increaseSize ()
    {
        Item[] temp = new Item[shopping_cart.length + 3];

        for (int num = 0; num < shopping_cart.length; num++)
        {
            temp[num] = shopping_cart[num];
            shopping_cart = temp;
        }}}