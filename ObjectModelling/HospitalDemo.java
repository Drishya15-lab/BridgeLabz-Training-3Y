import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Dr. " + name + " consulted patient " + patient.name);
    }

    void showPatients() {
        System.out.println("Dr. " + name + "'s Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.name);
        }
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doc) {
        doctors.add(doc);
    }

    void addPatient(Patient pat) {
        patients.add(pat);
    }

    void showHospital() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.name);
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.name);
        }
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("Apollo Hospital");

        Doctor d1 = new Doctor("Dr. Verma");
        Doctor d2 = new Doctor("Dr. Khan");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Sneha");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);

        h.showHospital();
        d1.showPatients();
        d2.showPatients();
    }
}