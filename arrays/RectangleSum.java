import java.util.Scanner;

public class RectangleSum {

    static int FindSum(int[] [] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the row indices of the rectangle (start end): ");
        int startRow = sc.nextInt();
        int endRow = sc.nextInt();
        System.out.print("Enter the column indices of the rectangle (start end): ");
        int startCol = sc.nextInt();
        int endCol = sc.nextInt();

        int sum = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of elements in the specified rectangle: " + sum);
    }
}
