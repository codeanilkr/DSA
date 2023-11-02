package oracle.src.Intellipat.DSA;

import java.util.Scanner;



public class ApnaStringCompare {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter First num");
String name1 = sc.next();
System.out.println("Enter Second num");
String name2 = sc.next();

if(name1.equals(name2)){
    System.out.println("String Are Equal");
}else{
    System.out.println("Strings are not Equal");
}


    }
    
}
