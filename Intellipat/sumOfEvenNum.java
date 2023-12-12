import java.util.Scanner;

public class sumOfEvenNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
           System.out.print("Enter Limit Of Nth positon  ");
        int n = sc.nextInt();
        System.out.println("Sum of Even Number Is " +sum(n));
       sc.close();
        }
        public static int sum(int n){
            int sum =0;
             for(int i = 0 ; i<=n; i++){
            if(i%2==0){
                sum += i;
            }  
        }
        return sum;

    }
}

