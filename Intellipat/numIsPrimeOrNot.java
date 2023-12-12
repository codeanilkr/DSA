import java.util.Scanner;

public class numIsPrimeOrNot {
    // Write A Program To Check A Number Is prime Or Not
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter an Integer Greater Than 1 = ");
int a = sc.nextInt();
if(a ==1){
    System.out.println("Not A Prime Number");
}
else{
    int i;
    for(i =2; i<a; i++)
    if(a%i == 0){
        System.out.println("Not A Prime Number");
        break;
    }
    if(i == a){
        System.out.println("Prime Number");
    }
}
sc.close();
    }
}
