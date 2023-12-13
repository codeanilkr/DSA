package AssignmentCoreJavaCoreClasses;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for matrix A:");
        int rowsA = sc.nextInt();
        System.out.println("Enter the number of columns for matrix A:");
        int colsA = sc.nextInt();

        System.out.println("Enter the number of rows for matrix B:");
        int rowsB = sc.nextInt();
        System.out.println("Enter the number of columns for matrix B:");
        int colsB = sc.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] matrixA = new int[rowsA][colsA];
            int[][] matrixB = new int[rowsB][colsB];
            int[][] resultMatrix = new int[rowsA][colsB];

            System.out.println("Enter elements for matrix A:");
            enterMatrixElements(sc, matrixA);

            System.out.println("Enter elements for matrix B:");
            enterMatrixElements(sc, matrixB);

            multiplyMatrices(matrixA, matrixB, resultMatrix);

            System.out.println("Resultant matrix after multiplication:");
            displayMatrix(resultMatrix);
        }

        sc.close();
    }

    public static void enterMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void multiplyMatrices(int[][] matrixA, int[][] matrixB, int[][] resultMatrix) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

