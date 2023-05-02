import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input range: 1-10_000_000
        System.out.println("Enter a number: ");
        int entNum = scanner.nextInt();

        // Calculate the average time taken by isPrimeNumber1 over 10 iterations
        long totalTime = 0;
        int iterations = 10;
        for (int i = 0; i < iterations; i++) {
            long startTime = System.nanoTime();
            isPrimeNumber1(entNum);
            long endTime = System.nanoTime();
            totalTime += endTime - startTime;
        }
        long averageTime = totalTime / iterations;

        // Print the result and the average time taken
        System.out.println(isPrimeNumber1(entNum));
        System.out.println("Duration: " + (averageTime) + " nanoSeconds");
    }

    // Check if a number is prime
    public static boolean isPrimeNumber1(int entNum) {
        if (entNum <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(entNum); i++) {
                if (entNum % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}