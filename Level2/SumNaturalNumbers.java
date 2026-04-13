import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            int recResult = recursiveSum(n);
            int formulaResult = formulaSum(n);

            System.out.println("Sum using recursion: " + recResult);
            System.out.println("Sum using formula: " + formulaResult);

            if (recResult == formulaResult) {
                System.out.println("Both results are equal ✔");
            } else {
                System.out.println("Results are NOT equal ❌");
            }
        }

        sc.close();
    }
}