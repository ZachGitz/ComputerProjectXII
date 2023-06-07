import java.util.Scanner;

public class MaxCharRowColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        char[][] matrix = new char[rows][columns];

        System.out.println("Enter the matrix elements:");

        // Read the matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.next().charAt(0);
            }
        }

        // Find the row and column with the maximum character value
        int maxCharValue = Integer.MIN_VALUE;
        int maxCharRow = -1;
        int maxCharColumn = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxCharValue) {
                    maxCharValue = matrix[i][j];
                    maxCharRow = i;
                    maxCharColumn = j;
                }
            }
        }

        // Display the row and column with the maximum character value
        if (maxCharRow != -1 && maxCharColumn != -1) {
            System.out.println("The row with the maximum character value is: " + maxCharRow);
            System.out.println("The column with the maximum character value is: " + maxCharColumn);
        } else {
            System.out.println("The matrix is empty.");
        }
    }
}