import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        // Accept 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        // Accept three elements to insert
        System.out.print("Enter three elements to insert: ");
        int element1 = scanner.nextInt();
        int element2 = scanner.nextInt();
        int element3 = scanner.nextInt();

        // Accept the position to insert the elements
        System.out.print("Enter the position to insert the elements (0-9): ");
        int position = scanner.nextInt();

        // Insert the elements at the given position
        insertElements(array, element1, element2, element3, position);

        // Delete the 5th and 7th elements
        deleteElements(array, 5, 7);

        // Display the final array
        System.out.println("Final Array:");
        displayArray(array);
    }

    public static void insertElements(int[] array, int element1, int element2, int element3, int position) {
        if (position < 0 || position > 9) {
            System.out.println("Invalid position!");
            return;
        }

        int[] newArray = new int[13];

        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        newArray[position] = element1;
        newArray[position + 1] = element2;
        newArray[position + 2] = element3;

        for (int i = position; i < 10; i++) {
            newArray[i + 3] = array[i];
        }

        for (int i = 0; i < 10; i++) {
            array[i] = newArray[i];
        }
    }

    public static void deleteElements(int[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Invalid index!");
            return;
        }

        for (int i = index1; i < array.length - 2; i++) {
            array[i] = array[i + 2];
        }

        array[array.length - 2] = 0;
        array[array.length - 1] = 0;
    }

    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
