package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class AssDess {
    public static void  main(String[] args){
System.out.println(" Enter Value Of Array Size");
Scanner sc= new Scanner(System.in);
int size = sc.nextInt();

System.out.println("Enter Value Of Array");
int num[] = new int[size]; 


//For Input
for(int i=0; i<size; i++){
    num[i] = sc.nextInt();
}

boolean isAssending = true;

for(int i =0; i<num.length-1; i++){
    if(num[i]>num[i+1]){
        isAssending = false;
    }
}
if(isAssending){
System.out.println("Shorted");
}
else{
    System.out.println("Not Shorted");
}












    }
}
