package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class Apna2D2 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int col = sc.nextInt();

int[][] num = new int[row][col];

// Input
for(int i=0; i<row; i++){
    for(int j=0; j<col; j++){
        num[i][j] = sc.nextInt();
    }
}
//for OutPut
// boolean isMatch = true;
int x = sc.nextInt();

for(int i=0; i<row; i++){
for(int j= 0; j<col; j++){
   
// System.out.print(num[i][j]);
 if(x == num[i][j]){

    System.out.println("Number Found at " + i + j);
 }
 
}
System.out.println();
}








    }
}
