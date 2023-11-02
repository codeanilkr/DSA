package oracle.src;

import java.util.Scanner;

public class Swap2Number {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number A= ");
int a = sc.nextInt();
System.out.println("Enter Second Number B= ");
int b = sc.nextInt();

// int temp = a;
// a = b;
// b= a;
a = a+b;
b= a-b;
a = a-b;
System.out.println("After Swaping A =" + a);
System.out.println("After Swaping B =" + b);
sc.close();
    }
    
}
