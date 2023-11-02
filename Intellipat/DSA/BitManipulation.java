package oracle.src.DSA.Intellipat.DSA;

public class BitManipulation {
    public static void main(String[] args){
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

// if((bitmask & n) == 0){
//     System.out.println("Bit Was Zero");
// }else{
//     System.out.println("Bit Was One");
// }
// Set Bit
int newnum = bitmask | n;
System.out.println(newnum);


    }
    
}
