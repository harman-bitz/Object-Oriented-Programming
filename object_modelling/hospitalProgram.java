import java.util.ArrayList;
import java.util.List;

// Hospital class contains doctors and patients
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display hospital information
    public void displayHospitalInfo() {
        System.out.println("Hospital: " + this.name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Doctor class can consult with multiple patients
class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    // Consult method that shows communication between doctor and patient
    public void consult(Patient patient) {
        System.out.println(this.name + " is consulting " + patient.getName() + "...");
        patient.receiveConsultation(this);
    }

    public String getName() {
        return this.name;
    }
}

// Patient class can consult with multiple doctors
class Patient {
    private String name;
    private List<Doctor> consultedDoctors;

    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    // Receive consultation from a doctor
    public void receiveConsultation(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
            System.out.println(this.name + " has been consulted by Dr. " + doctor.getName() + ".");
        } else {
            System.out.println(this.name + " has already been consulted by Dr. " + doctor.getName() + ".");
        }
    }

    public String getName() {
        return this.name;
    }
}
public class hospitalProgram {

	public static void main(String[] args) {
		Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Jones");

        // Create patients
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Display hospital info
        hospital.displayHospitalInfo();

        // Doctors consulting patients
        doctor1.consult(patient1);  // Dr. Smith consults Alice
        doctor2.consult(patient1);  // Dr. Jones consults Alice
        doctor1.consult(patient2);  // Dr. Smith consults Bob
        doctor2.consult(patient2);

	}

}