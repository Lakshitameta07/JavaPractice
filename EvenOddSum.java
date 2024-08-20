import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int number, evenSum = 0, oddSum = 0, lastdigit;

            System.out.println("Enter the number:---");
            number = scan.nextInt();

            while (number > 0) {
                lastdigit = number % 10;

                if (lastdigit % 2 == 0) {
                    evenSum += lastdigit;
                } else {
                    oddSum += lastdigit;
                }

                number = number / 10;
            }

            System.out.println("EvenSum:--" + evenSum);
            System.out.println("OddSum:--" + oddSum);
        } catch (Exception e) {
            System.err.println("Error:----" + e);
        }
    }
}
