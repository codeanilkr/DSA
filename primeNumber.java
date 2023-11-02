package oracle.src;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Greater Than 1 : ");
        int i ;
        int a = sc.nextInt();

        if(a==1){
System.out.println("Not Prime Number");
System.exit(1);
}
else{
for(i = 2; i < a; i++){
if(a % i == 0){
    System.out.println("Not Prime Number");
    break;
}
}
if(i==a){
System.out.println("Prime Number");
}
}

    sc.close();
    
}}
