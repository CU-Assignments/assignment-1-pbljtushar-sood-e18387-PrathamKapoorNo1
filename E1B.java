import java.util.Scanner;

public class E1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of Rows and Columns of Matrices :- ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter the Elements of Matrix 1 :- ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the Elements of Matrix 2 :- ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Addition :- ");
        printMatrix(addMatrices(matrix1, matrix2, rows, cols));

        System.out.println("Subtraction :- ");
        printMatrix(subtractMatrices(matrix1, matrix2, rows, cols));

        System.out.println("Multiplication :- ");
        printMatrix(multiplyMatrices(matrix1, matrix2, rows, cols));

        scanner.close();
    }

    public static int[][] addMatrices(int[][] m1, int[][] m2, int r, int c) {
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] m1, int[][] m2, int r, int c) {
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2, int r, int c) {
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}