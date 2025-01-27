import com.sun.tools.jconsole.JConsoleContext;

import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create a queue
        Queue<Integer> queue = new LinkedList<Integer>();

        // Fill the queue with numbers from 1 to 100
        for (int i = 1; i <= 100000; i++) {
            queue.add(i);
        }

        long startTime = System.nanoTime();

        // Print the prime of all numbers in the queue
        while (!queue.isEmpty()) {
            int n = queue.poll();
            printPrimeFactors(n);
        }

        long endTime = System.nanoTime();

        System.out.println("Time taken: " + (endTime - startTime) / 1000000 + "ms");

    }

    // Helper function to print prime factors of a number
    public static void printPrimeFactors(int n){
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