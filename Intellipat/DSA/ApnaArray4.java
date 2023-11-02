package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaArray4 {
    public static void main(String[] args){
System.out.println("Enter Size Of Array");
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
System.out.println("Enter Value Of Arrays");
int num[] = new int[size];


for(int i =0; i<size; i++){
    num[i] = sc.nextInt();
}
for(int i=0; i<size; i++){
    System.out.println("Value Of Array " + num[i]  );
}



    }














}