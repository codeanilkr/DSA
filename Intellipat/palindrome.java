import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        System.out.print("Enter String To Check It is Palindrome Or Not ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String revesedStr = "";
        int strLength = str.length();
        for(int i =strLength-1; i>=0; i--){
            revesedStr = revesedStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(revesedStr.toLowerCase())){
            System.out.println(str + " Is a palindrome Number");
        }
        else{
            System.out.println(str + " is Not A Paliondrome Number");
        }
        sc.close();
    }
}
