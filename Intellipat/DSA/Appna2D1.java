package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class Appna2D1 {
    public static void main(String[] args){

        System.out.println("Enter Value of row and Col");
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int col = sc.nextInt();

int[][] num = new int[row][col];

for(int i = 0 ; i<row; i++){

for(int j=0; j< col; j++){
num[i][j] = sc.nextInt();
}
}

//For Opt Put
for(int i = 0; i<row; i++){
    for(int j=0; j<col; j++){
        System.out.print(num[i][j] + " ");
    }
    System.out.println();
}





    }
    
}
