package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaArray6 {
    public static void main(String[] args){
        System.out.println("Enter The Value of Array");
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
System.out.println("Enter Value of Arrays");
int num[] = new int[size];

for(int i =0; i<size; i++){
    num[i] = sc.nextInt();
} 
// System.out.println("Enter Value You Want to search");
// int x = sc.nextInt();

int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;


for(int i =0; i<num.length; i++){
if(num[i]<min){
    min= num[i];
}
if(num[i]>max){
    max=num[i];
}


}
System.out.println("Largest Number " + max);

System.out.println("Minimum Number " + min);





    }
    
}
