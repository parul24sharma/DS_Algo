class Main{
	public static void main(String ar[]){
		LinkedList l = new LinkedList();
		l.insertNode(5);
		l.insertNode(7);
		l.deleteNode(5);
		l.printLinkedList();
	}
}
class LinkedList{
 private class Node{
  int data;
  Node next;
  public Node(int d){
   this.data = d;
  }
 }
 Node head;
 Node current;
 Node previous;
 
 void insertNode(int d){
  if(head==null){
   head = new Node(d);
  }else{
   current=head;
   while(current.next !=null){
    current=current.next;
   }
   current.next = new Node(d);
  }
 }
 void deleteNode(int key){
  if(head==null){
   System.out.println("cant delete Empty");
  }else{
   previous=null;
   current=head;
   while(current !=null){
    if(current.data==key){
     if(previous!=null){
      previous.next = current.next;
     }else{
      head=current.next;
     }
    break;
    }
    previous=current;
    current=current.next;
   }
  }
 }

 void printLinkedList(){
   if(head==null){
   System.out.println("Empty List");
  }else{
   current=head;
   int c=1;
   while(current.next !=null){
    System.out.println("Element "+ c++ +" "+ current. data);
    current=current.next;
   }
   System.out.println("Element "+ c +" "+ current. data);
  }
 }
}

