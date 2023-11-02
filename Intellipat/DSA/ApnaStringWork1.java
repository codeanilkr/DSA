package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaStringWork1 {
    public static void main(String[] args){
System.out.println("Enter Value of array");
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
String[] array = new String[size];
int toLength = 0;

for(int i=0; i<size; i++){
array[i]= sc.next();
toLength+= array[i].length();

}
System.out.println(toLength);

    }
}
