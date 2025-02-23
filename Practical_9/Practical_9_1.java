public class Practical_9_1 {
    
    public static long factorialIterative(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int arraySize = 10;
        if (args.length > 0) {
            try {
                arraySize = Integer.parseInt(args[0]);
                if (arraySize <= 0) {
                    System.out.println("Array size must be greater than 0. Using default size: 10");
                    arraySize = 10;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer. Using default size: 10");
            }
        }

        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = (int) (Math.abs(System.nanoTime()) % 51);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long startTime, endTime, totalIterativeTime = 0, totalRecursiveTime = 0;

        for (int num : numbers) {
            startTime = System.nanoTime();
            factorialIterative(num);
            endTime = System.nanoTime();
            totalIterativeTime += (endTime - startTime);
        }
        double avgIterativeTime = (double) totalIterativeTime / arraySize;

        for (int num : numbers) {
            startTime = System.nanoTime();
            factorialRecursive(num);
            endTime = System.nanoTime();
            totalRecursiveTime += (endTime - startTime);
        }
        double avgRecursiveTime = (double) totalRecursiveTime / arraySize;

        System.out.println("Array Size: " + arraySize);
        System.out.println("Average time taken by Iterative method: " + avgIterativeTime + " ns");
        System.out.println("Average time taken by Recursive method: " + avgRecursiveTime + " ns");

        if (avgIterativeTime < avgRecursiveTime) {
            System.out.println("Iterative method is more efficient.");
        } else {
            System.out.println("Recursive method is more efficient.");
        }
    }
}
