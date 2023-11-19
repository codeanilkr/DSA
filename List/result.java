package List;

public class result {
    public static void main(String[] args){
        CPH1 list = new CPH1();
        list.addFirst("Node1");
        list.addFirst("Node2");
        list.addFirst("Node3");
        list.addFirst("Node4");
        list.printList();
        list.addLast("Node5");
           list.printList();
        list.addLast("Node6");
           list.printList();
        list.addLast("Node7");
           list.printList();
        list.printList();
        list.delFirst();
        list.printList();
        list.delLast();
        list.printList();
        list.reverseListRecursive();
        list.printList();
    }
}
