import java.util.Scanner;

public class EmployeeBonusLevel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        // Step 1: Input salary and years of service
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            // Input salary
            while (true) {
                System.out.print("Enter salary: ");
                salaries[i] = sc.nextDouble();
                if (salaries[i] > 0) break;
                System.out.println("Invalid salary. Please enter a positive number.");
            }

            // Input years of service
            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] >= 0) break;
                System.out.println("Invalid years of service. Please enter a non-negative number.");
            }
        }

        // Step 2: Calculate bonus and new salary
        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // Step 3: Display results
        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] +
                    ", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
