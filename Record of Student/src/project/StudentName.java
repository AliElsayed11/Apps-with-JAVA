package project;
import java.util.Scanner;
public class StudentName {
private String firstname;
    private String middlename;  
    private String lastname; 
    private int flatnumber; 
    private int housenumber; 
    private String street; 
    private String area_or_district; 
    private String city; 
    private String governerate; 
    private String country; 
    private int postal_code; 

        Scanner sc = new Scanner(System.in);  
public void NewStudent() {  
        System.out.print("Enter the fisrt Name: ");  
        firstname = sc.nextLine();  
        System.out.print("Enter the middle name: ");  
        middlename = sc.nextLine();
        System.out.print("Enter the last Name: ");  
        lastname = sc.nextLine();
        System.out.print("Enter the flat number: ");  
        flatnumber=sc.nextInt();
        System.out.print("Enter the house number: ");  
        housenumber=sc.nextInt();
        System.out.print("Enter the street: ");  
        street = sc.nextLine();
        System.out.print("Enter the area_or_district: ");  
        area_or_district= sc.nextLine();
        System.out.print("Enter the city: ");  
        city= sc.nextLine();
        System.out.print("Enter the governerate: ");  
        governerate= sc.nextLine();
        System.out.print("Enter the country: ");  
        country= sc.nextLine();
        System.out.print("Enter the postal_code: ");  
        postal_code= sc.nextInt();
}  
public void showAccount() {  
        System.out.println("the fisrt Name: " + firstname);  
        System.out.println("the middle name: " + middlename);  
        System.out.println("the last Name: " + lastname);  
        System.out.println("the flat number: " + flatnumber);
        System.out.println("the house number: " +housenumber);  
        System.out.println("the street: " +street);  
        System.out.println("the area_or_district: " +area_or_district);  
        System.out.println("the city: " +city);  
        System.out.println("the governerate: " +governerate);  
        System.out.println("the country: " +country);  
        System.out.println("the postal_code: " +postal_code);  
    }  



}

