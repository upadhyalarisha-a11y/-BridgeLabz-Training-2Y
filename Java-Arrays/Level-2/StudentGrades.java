import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Create arrays
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks of Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) { 
                System.out.println("Invalid! Enter positive value."); 
                i--; 
                continue; 
            }

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) { 
                System.out.println("Invalid! Enter positive value."); 
                i--; 
                continue; 
            }

            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) { 
                System.out.println("Invalid! Enter positive value."); 
                i--; 
                continue; 
            }

            // d. Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Grade assignment
            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // e. Display
        System.out.println("\nStudent Records:");
        System.out.println("Physics  Chemistry  Maths  %age  Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%7d %9d %7d %7.2f %6c\n",
                    physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}