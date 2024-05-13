package shop;
import java.util.Scanner;
public class Shop
{
   public static void main (String[] args)
   {
      ShoppingCart cart = new ShoppingCart();
      Item item;
      String itemName;
      double itemcost;
      double totalPrice = 0;
      int weight;
      Scanner scan = new Scanner(System.in);
      String continueShopping = "yes";
      do
      {
    System.out.print("Enter The Name Of The Item: ");
    itemName = scan.next();
    System.out.print("Enter The Unit Price: ");
    itemcost = scan.nextDouble();      
    System.out.print("Enter The Weight: ");
   weight = scan.nextInt();
   totalPrice +=(weight*itemcost);
   cart.addToCart(itemName, itemcost, weight);
   System.out.println(cart.summary_information());
   System.out.println("Continue shoppping (yes/no)?");
   continueShopping = scan.next();
   }
  while (continueShopping.equals("yes"));
  System.out.println("our dear customer Please pay $"+ totalPrice);
   }}