package oracle.src.Intellipat.DSA;

import java.util.Scanner;

public class ApnaSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        // Input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix Is :");

        int rowStart = 0;
        int rowEnd = row - 1; // Update the rowEnd index
        int colStart = 0;
        int colEnd = col - 1; // Update the colEnd index

        // Spiral Traversal
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse Right
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            // Traverse Down
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            // Traverse Left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--;
            }

            // Traverse Up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
    
}
