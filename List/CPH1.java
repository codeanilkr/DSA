package List;

public class CPH1 {
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
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;

}
// Add Last

public void addLast(String data){
    if(head == null){
        System.out.println("List is null");
        return;
    }
Node currNode = head;
Node newNode = new Node(data);
while(currNode.next != null){
    currNode = currNode.next;
}
currNode.next = newNode;

}
// Delete First Node
public void delFirst(){
    if(head == null){
        System.out.println("List is empety");
        return;
    }
    head = head.next;
}

// Delete Last Node
public void delLast(){
      if(head == null){
        System.out.println("List is empety");
        return;
    }
    Node lastNode = head.next;
    Node secondLast = head;
    while(secondLast.next != null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;
    }
    secondLast.next = null;
}

// Print List
public void printList(){
    Node currNode = head;
  
    while(currNode != null){
        System.out.print(currNode.data + "  -> ");
        currNode = currNode.next;
    }
    System.out.println("Null");
}
// Reverse LinkedList(Itrative Mathod)
public void reverseList(){
Node currNode = head.next;
Node prevNode = head;
if(head == null || head.next == null){
    return;
}
while(currNode != null){
    Node nextNode = currNode.next;
    currNode.next = prevNode;
    prevNode = currNode;
    currNode = nextNode;
}
head.next = null;
head = prevNode;
}

public Node reverseListRecursive(Node head){
    if(head == null || head.next == null){
    return head;
}
Node newHead = reverseListRecursive(head.next);
head.next.next = head;
head.next = null;
return newHead;
}
}
