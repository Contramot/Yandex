import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a natural number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        ArrayList<Integer> primeNumbersOne = findingPrimeNumbersMethodOne(number);
        printingTheListOfPrimeNumbers(primeNumbersOne);

        ArrayList<Integer> primeNumbersTwo = findingPrimeNumbersMethodTwo(number);
        printingTheListOfPrimeNumbers(primeNumbersTwo);

    }

    public static void printingTheListOfPrimeNumbers(ArrayList<Integer> primeNumbers) {
        System.out.println("Number of prime numbers is " + primeNumbers.size());

        System.out.println("List of prime numbers:");
        for (Integer primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }
    }

    public static ArrayList<Integer> findingPrimeNumbersMethodOne(int number) {

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        int k = 0;

        for (int i = 2; i < number; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = k + 1;
                }
            }

            if (k == 0) {
                primeNumbers.add(i);
            } else {
                k = 0;
            }
        }

        return primeNumbers;
    }

    public static ArrayList<Integer> findingPrimeNumbersMethodTwo(int number) {

        // the sieve of Eratosthenes

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        boolean[] primes = new boolean[number];

        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

}
