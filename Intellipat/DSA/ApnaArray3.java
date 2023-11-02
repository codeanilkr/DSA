package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaArray3 {
    public static void main(String[] args){
        System.out.println("Enter Size Of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
for(int i=0; i<size; i++){
num[i]= sc.nextInt();
}
System.out.println("Enter Value Of x to Search");
int x = sc.nextInt();

        for(int i=0; i<num.length; i++){
            if(num[i]==x)
            System.out.println("x Number Found at " +i);
        }
    }
    
}
