import java.util.Scanner;

public class maxOf3Num {
    // Write a Java program to find the maximum of three numbers.
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
int a = sc.nextInt();
System.out.println("Enter Second Number");
int b = sc.nextInt();
System.out.println("Enter Third Number");
int c = sc.nextInt();
int max = a;
if(b>max){
    max = b;
}
if(c>max){
    max = c;
}
System.out.println("Maximum = " +max);

sc.close();
    }
}
