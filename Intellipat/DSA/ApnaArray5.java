package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaArray5 {
    public static void main(String[] args){
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter Neme");
        String name[] = new String[size];
        for(int i =0; i<size; i++){
            name[i] = sc.next();
        }
        for(int i=0; i<name.length; i++){
System.out.println("At Postion " + (i+1) + " Name Is " + name[i]);
        }
    }
}
