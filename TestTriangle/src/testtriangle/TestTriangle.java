package testtriangle;
import java.util.Scanner;
public class TestTriangle {
private double side1 = 0.0;
private double side2 = 0.0;
private double side3 = 0.0;
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter three sides of the Triangle");
double side1 = input.nextDouble();
double side2 = input.nextDouble();
double side3 = input.nextDouble();
System.out.println("Enter the color of the Triangle");
String color = input.next();
System.out.println(" Is the Triangle filled? Reply with 'T' or 'F' ");
String filled = input.next(); 
try{
Triangle o=new Triangle(side1, side2, side3);
System.out.println("The Triangle Sides are \n side 1: " + side1 + "\n Side 2: " + side2 + "\n Side 3: " + side3);
System.out.println("The Triangle's Area is " +o.getArea()) ;
System.out.println("The Triangle's Perimeter is "+ o.getPerimeter());
System.out.println("The Triangle's Color is " + color );
System.out.println("Is the Triangle filled? " +filled );
Triangle k4=new Triangle();
Triangle k5=new Triangle();
System.out.println(k4.compareTo(k5) );
}
catch (IllegalTriangleException error) {
System.out.println("Error");
error.printStackTrace();}}}
/** used to handle exceptions and errors.
with other details like the line number and class name where the exception occurred */
