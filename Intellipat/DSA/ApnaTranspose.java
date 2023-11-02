package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaTranspose {
    public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int col = sc.nextInt();

int[][] matrix = new int[row][col]; 


// For input
for(int i =0; i<row; i++){

for(int j=0; j<col; j++){
matrix[i][j] = sc.nextInt();
}
}

// OutPut
for(int j=0; j<col; j++){

for(int i=0; i<row; i++){
    System.out.print(matrix[i][j] + " ");
}System.out.println();
}
// System.out.println();






    }
    
}
