import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Create a 2D array for marks
        // Column 0: Physics, Column 1: Chemistry, Column 2: Maths
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step 3: Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                int mark;
                do {
                    System.out.print(subject + ": ");
                    mark = sc.nextInt();
                    if (mark < 0) {
                        System.out.println("Invalid! Enter positive value.");
                    }
                } while (mark < 0);

                marks[i][j] = mark;
            }

            // Step 4: Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Step 5: Assign grade
            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // Step 6: Display results
        System.out.println("\nStudent Records:");
        System.out.println("Physics  Chemistry  Maths  %age  Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%7d %9d %7d %7.2f %6c\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}

