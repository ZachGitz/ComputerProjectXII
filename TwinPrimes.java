import java.util.Scanner;

public class TwinPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the positive number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Find the nearest twin primes
        int lowerTwinPrime = findNearestTwinPrime(number, -1);
        int higherTwinPrime = findNearestTwinPrime(number, 1);

        // Display the nearest twin primes
        System.out.println("Nearest twin primes to " + number + " are: ");
        int lowerTwinPrime2 = lowerTwinPrime-2;
        int higherTwinPrime2 = higherTwinPrime+2;
        System.out.println(lowerTwinPrime2 + " and " + lowerTwinPrime);
        System.out.println(higherTwinPrime + " and " + higherTwinPrime2);
    }

    public static int findNearestTwinPrime(int number, int direction) {
        number += direction;
        while (true) {
            if (isPrime(number) && (isPrime(number - 2) || isPrime(number + 2))) {
                return number;
            }
            number += direction;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
