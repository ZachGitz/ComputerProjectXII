import java.util.Scanner;

public class MatrixRotator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the size of the square matrix from the user
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[size][size];

        // Accept the matrix elements from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Rotate the matrix 180 degrees
        int[][] rotatedMatrix = rotateMatrix180(matrix);

        // Display the rotated matrix
        System.out.println("Rotated Matrix:");
        displayMatrix(rotatedMatrix);
    }

    public static int[][] rotateMatrix180(int[][] matrix) {
        int size = matrix.length;
        int[][] rotatedMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedMatrix[i][j] = matrix[size - 1 - i][size - 1 - j];
            }
        }

        return rotatedMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}