import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in);) {
            int p, r, t;
            p = scan.nextInt();
            System.out.println("Enter the Principal Amount:" + p);

            r = scan.nextInt();
            System.out.println("Enter the Rate:" + r);

            t = scan.nextInt();

            System.out.println("Enter the time:" + t);

            int si = (p * r * t) / 100;

            System.out.println("SimpleInterest is :-" + si);
        } catch (Exception e) {
           System.err.println("Error :-"+e);
        }
    }
}
