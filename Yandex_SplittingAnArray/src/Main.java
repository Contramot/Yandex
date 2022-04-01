import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an array length: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Enter number of subarrays: ");
        int numberOfSubarrays = scanner.nextInt();

        int x = arrayLength / numberOfSubarrays;
        int r = arrayLength % numberOfSubarrays;

        System.out.println("x = " + x);
        System.out.println("r = " + r);

        ArrayList<Integer> quantitiesInSubarrays = new ArrayList<>();

        for (int i = 0; i < (numberOfSubarrays - r); i++) {
            quantitiesInSubarrays.add(x);
        }

        for (int i = 0; i < r; i++) {
            quantitiesInSubarrays.add(x + 1);
        }

        System.out.println("Quantity of subarrays is: " + quantitiesInSubarrays.size());

        System.out.println("Quantities of elements in subarrays: ");

        for (Integer quant : quantitiesInSubarrays) {
            System.out.println(quant);
        }

    }
}
