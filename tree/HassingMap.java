import java.util.*;
public class HassingMap {
    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        // Insertation
        map.put("India", 100);
        map.put("China", 110);
        map.put("USA", 70);
        map.put("Rusia", 60);

        // Searching
        if(map.containsKey("India")){
            System.out.println("Key Value Contains");
        }
        else{
            System.out.println("key Not Available");
        }
        
        System.out.println(map);

        // Key Exists (map.get)
        System.out.println(map.get("India"));
          System.out.println(map.get("Nepal"));


    }
    
}
