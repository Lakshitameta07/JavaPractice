import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int x, n, newValue = 1;

            System.out.println("Enter the value of x:---");
            x = s.nextInt();
            System.out.println("Enter the value of n:---");
            n = s.nextInt();

            while (n > 0) {
                newValue = newValue * x;
                n = n - 1;
            }
            System.out.println("NewValue is :---- " + newValue);
        } catch (Exception e) {
            System.err.println("Error:-" + e);
        }
    }
}
