import java.util.Scanner;

public class RectangleSum1 {

    
    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    
    static void findPrefixSumMatrix2(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = matrix[l2][r2];

        if (l1 > 0) sum -= matrix[l1 - 1][r2];
        if (r1 > 0) sum -= matrix[l2][r1 - 1];
        if (l1 > 0 && r1 > 0) sum += matrix[l1 - 1][r1 - 1];

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter rows and cols: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        findPrefixSumMatrix(matrix);
        findPrefixSumMatrix2(matrix);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter l1 r1 l2 r2: ");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println("Sum: " + findSum(matrix, l1, r1, l2, r2));
        }

        sc.close();
    }
}