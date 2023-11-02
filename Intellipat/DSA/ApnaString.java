package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaString {
    public static void main(String[] args){
       
 
Scanner sc = new Scanner(System.in);
 System.out.println("Enter First Name");
String Firstname = sc.next();
        System.out.println("Enter Lat Name");
String Lastname = sc.next();
String FullName = Firstname + " " + Lastname;

System.out.println("Your Name Is : " + FullName.length());

// Crat At
for(int i =0; i<FullName.length(); i++){
    System.out.println("Position " + i + " " + FullName.charAt(i));
}

    }

}
