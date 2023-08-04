package Maven;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    String name;
    int age;
    String medicalHistory;

    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }
}

public class healthcareplatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("Health Platform - Patient Entry System");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter medical history: ");
                    String medicalHistory = scanner.nextLine();

                    Patient patient = new Patient(name, age, medicalHistory);
                    patients.add(patient);

                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.println("Patient List:");
                    for (int i = 0; i < patients.size(); i++) {
                        Patient p = patients.get(i);
                        System.out.println("Patient " + (i + 1) + ":");
                        System.out.println("Name: " + p.name);
                        System.out.println("Age: " + p.age);
                        System.out.println("Medical History: " + p.medicalHistory);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting the Health Platform.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}

