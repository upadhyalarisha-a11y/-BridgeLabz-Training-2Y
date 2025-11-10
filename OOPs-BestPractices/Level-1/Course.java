// File: Course.java
public class Course {
    private String courseName;
    private int duration; // in hours
    private double fee;
    private static String instituteName = "ABC Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 40, 15000);
        Course c2 = new Course("Web Development", 35, 12000);
        
        c1.displayCourseDetails();
        System.out.println();

        c2.displayCourseDetails();
        System.out.println();

        System.out.println("Updating Institute Name...");
        Course.updateInstituteName("XYZ Institute");

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
