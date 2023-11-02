package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaArrayAcceding {
public static void main(String[] args){
System.out.println("Enter Size Of Array");
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
System.out.println("Enter Value Of Arrays");
int num[] = new int[size];

// For Input
for( int i = 0; i<size; i++){
    num[i] = sc.nextInt();
}

boolean isAssending = true;

for(int i =0; i<size-1; i++ ){
    if(num[i]>num[i+1]){
        isAssending = false;
    }
}
System.out.println("length " +num.length);
if(isAssending){
    System.out.println("Shorted");
}
else{
    System.out.println("Not Shorted");
}


}

    
}
