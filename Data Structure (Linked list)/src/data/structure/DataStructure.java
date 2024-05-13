package data.structure;
public class DataStructure {
public static void main(String[] args) {
LinkedList list = new LinkedList();
list.insert(15);
list.insert(17);
list.insert(20);
list.insert(25);
list.insert(200);
System.out.println("the linked list before delete:");
list.print_Data();
list.Delete(3);
System.out.println();
System.out.println("the linked list after delete:");
list.print_Data();
}}
