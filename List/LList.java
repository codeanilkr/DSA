package List;

public class LList {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
// Add First
Node head;
public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        return;
    }
    newNode.next = head;
    head = newNode;
}

public void printList(){
    Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
    }
}
public static void main(String[] args){
    LList list = new LList();
    list.addFirst("Node-1");
     list.addFirst("Node-2");
      list.addFirst("Node-3");
       list.addFirst("Node-4");
       list.printList();
}
    
}
