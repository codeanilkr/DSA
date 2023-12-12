import java.util.Scanner;

public class fibonacciSequ {
    public static void main(String[] args){
        System.out.print("Enter The Number Of terms You want in the Fibonacci series ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
          System.out.print("Fibonacci sequence ");
        for(int i=0 ; i < a; i++){
          
        System.out.print( " " + fibonacci(i));
}
sc.close();
    }
    public static int fibonacci(int a){
        if(a<=1){
            return a;
        }
        return fibonacci(a-1) + fibonacci(a-2);
    }
}
