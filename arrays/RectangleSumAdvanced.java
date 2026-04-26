import java.util.Scanner;

public class RectangleSumAdvanced {

    
    static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static int[][] prefixSumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] prefix = new int[rows][cols];


        prefix[0][0] = matrix[0][0];

        
        for (int j = 1; j < cols; j++) {
            prefix[0][j] = prefix[0][j - 1] + matrix[0][j];
        }

        
        for (int i = 1; i < rows; i++) {
            prefix[i][0] = prefix[i - 1][0] + matrix[i][0];
        }

        
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                prefix[i][j] = matrix[i][j]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        return prefix;
    }

    
    static int findSum(int[][] prefix, int l1, int r1, int l2, int r2) {
        int sum = prefix[l2][r2];

        if (l1 > 0) sum -= prefix[l1 - 1][r2];
        if (r1 > 0) sum -= prefix[l2][r1 - 1];
        if (l1 > 0 && r1 > 0) sum += prefix[l1 - 1][r1 - 1];

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printMatrix(matrix);

        
        int[][] prefix = prefixSumMatrix(matrix);

        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Find Rectangle Sum");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter startRow and endRow: ");
                int l1 = sc.nextInt();
                int l2 = sc.nextInt();

                System.out.print("Enter startCol and endCol: ");
                int r1 = sc.nextInt();
                int r2 = sc.nextInt();

                
                if (l1 < 0 || l2 >= rows || r1 < 0 || r2 >= cols || l1 > l2 || r1 > r2) {
                    System.out.println("Invalid indices!");
                    continue;
                }

                int sum = findSum(prefix, l1, r1, l2, r2);
                System.out.println("Rectangle Sum = " + sum);

            } else if (choice == 2) {
                System.out.println("Program exited.");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        
        sc.close();
    }
}