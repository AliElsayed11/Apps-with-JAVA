package data.structure;
public class LinkedList {
Node head; // head of list
public void insert (int data){
Node node= new Node ();
node.data = data;
node.next = null;
// If the Linked List is empty,
// then make the new node as head 
if(head==null){
head=node;
}
//if head is not empty  and we want to add a new element
else{
Node n=head;
// traverse to the end of the list
while (n.next!=null){
n=n.next;
}
n.next=node;
}}
// Method to display the nodes of the singly linked list
public void print_Data(){
Node node= head;
System.out.print("[");
// Traverse through the LinkedList
while(node.next!=null){
System.out.print(node.data);
System.out.print(",");
node=node.next;             // Go to next node
}
System.out.print(node.data);
System.out.print("]");
}
// Method to delete the first occurrence of data in the list
public void Delete(int index){
if (index==0){
head=head.next;
}
else{
Node n=head;
Node data=null;
for(int i=0;i<index-1;i++){
n=n.next;
}
data=n.next;
n.next=data.next;
}}}