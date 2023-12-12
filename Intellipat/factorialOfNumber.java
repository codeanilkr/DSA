import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args){
        System.out.println("Enter Non Negative Integer ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

System.out.println(fact(a));

sc.close();    
}
    public static int fact(int a){
        if(a<0){
            return -1;
        }
        else if(a == 0 || a == 1){
            return 1;
        }
        else{
            int facto =1;
            for(int i =2; i<=a ;i++){
                facto *= i;
            }
            return facto;
        }
    }
    
}
