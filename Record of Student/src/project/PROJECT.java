package project;
import java.util.Scanner;
public class PROJECT {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("How many number of student do you want to input? ");  
int n = sc.nextInt();  
StudentName c[]= new StudentName[n];  
for (int i = 0; i < c.length; i++) {  
c[i] = new StudentName();  
c[i].NewStudent();  
}  
int ch;  
do {  
System.out.println("\n ***University Registration System***");  
System.out.println("1. Display all account details \n 2.Exit   ");           
System.out.println("Enter your choice: ");  
ch = sc.nextInt();  
switch (ch) {  
case 1:  
for (int i = 0; i < c.length; i++) {  
c[i].showAccount();  
}               
break;  
case 2:  
System.out.println("See you soon...");  
break;  
}}
while (ch != 2);  
}}    


