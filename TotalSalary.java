import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int basic, CalculatedSalary, allowance;
            char grade;
            double hra, da, pf, TotalSalary;

            System.out.println("Enter your Basic Salary: -");
            basic = scan.nextInt();

            System.out.println("Enter your grade:-");
            grade = scan.next().charAt(0);

            hra = 0.2 * basic;
            da = 0.5 * basic;

            if (grade == 'A') {
                allowance = 1700;
            } else if (grade == 'B') {
                allowance = 1500;
            } else {
                allowance = 1300;
            }

            pf = 0.11 * basic;

            TotalSalary = basic + hra + da + allowance - pf;

            CalculatedSalary = (int) Math.round(TotalSalary);

            System.out.println("Calculated Salary:---" + CalculatedSalary);
        } catch (Exception e) {
            System.err.println("Error:---" + e);
        }
    }
}