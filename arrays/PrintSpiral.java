import java.util.Scanner;

public class PrintSpiral {

    
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1;
        int leftCol = 0, rightCol = c - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {

        
            for (int j = leftCol; j <= rightCol; j++) {
                System.out.print(matrix[topRow][j] + " ");
            }
            topRow++;

        
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;

        
            if (topRow <= bottomRow) {
                for (int j = rightCol; j >= leftCol; j--) {
                    System.out.print(matrix[bottomRow][j] + " ");
                }
                bottomRow--;
            }

        
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol] + " ");
                }
                leftCol++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter " + (r * c) + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        printMatrix(matrix);

        System.out.println("Spiral Order:");
        printSpiralOrder(matrix, r, c);

        sc.close();
    }
}