// Abstract class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    // Abstract method
    public abstract double calculateBill();
}

// MedicalRecord interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int numberOfDays;
    private String[] records = new String[5];
    private int recordCount = 0;

    public InPatient(String patientId, String name, int age, double dailyRate, int numberOfDays) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return dailyRate * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        if (recordCount < records.length) {
            records[recordCount++] = record;
        } else {
            System.out.println("Medical records full for " + getName());
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records of " + getName() + ":");
        for (int i = 0; i < recordCount; i++) {
            System.out.println("- " + records[i]);
        }
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String[] records = new String[5];
    private int recordCount = 0;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        if (recordCount < records.length) {
            records[recordCount++] = record;
        } else {
            System.out.println("Medical records full for " + getName());
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records of " + getName() + ":");
        for (int i = 0; i < recordCount; i++) {
            System.out.println("- " + records[i]);
        }
    }
}

// Main class
public class HospitalMain {
    public static void main(String[] args) {
        Patient[] patients = new Patient[2];
        patients[0] = new InPatient("P001", "Alice", 30, 2000, 5);
        patients[1] = new OutPatient("P002", "Bob", 25, 500);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill: " + patient.calculateBill());

            MedicalRecord record = (MedicalRecord) patient;
            record.addRecord("General Checkup");
            record.addRecord("Blood Test");
            record.viewRecords();

            System.out.println("----------------------------------");
        }
    }
}
