import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        System.out.println(set);
if(set.contains(1)){
    System.out.println("Set Contains 1");
}if(!set.contains(6)){
    System.out.println("Does Not Contain 6");
}
set.remove(1);
System.out.println(set);
System.out.println(" Size of Set " +set.size());

// Iterator
Iterator it = set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    }
    
}
