import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final int LIMIT = 300000;

        // Create a list and fill it with numbers
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= LIMIT; i++) {
            list.add(i);
        }



        long startTime = System.nanoTime();

        // Print the prime of all numbers in the queue
        for (Integer n : list) {
            printPrimeFactors(n);
        }

        long endTime = System.nanoTime();

        // Print the overall time taken
        System.out.println("Time taken: " + (endTime - startTime) / 1000000 + "ms");

    }

    // Helper function to print prime factors of a number
    public static void printPrimeFactors(Integer n){
        System.out.print("Prime factors of " + n + " are: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        System.out.println();

    }
}