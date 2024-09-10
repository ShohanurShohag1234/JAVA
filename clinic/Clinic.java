package com.mycompany.clinic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Doctor {
    private String name;
    private String specialization;
    private String availability;

    public Doctor(String name, String specialization, String availability) {
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }
    public String getName() {
        return name;
    }
    public String getSpecialization() {
        return specialization;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    public abstract void displayAvailability();
}

public class Clinic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentManagementSystem system = new AppointmentManagementSystem();

        while (true) {
            System.out.println("\n--- Clinic Appointment Management System ---");
            System.out.println("1. Add a General Practitioner");
            System.out.println("2. Add a Specialist");
            System.out.println("3. Add a Patient");
            System.out.println("4. View Available Doctors");
            System.out.println("5. Book an Appointment");
            System.out.println("6. View All Appointments");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter General Practitioner's Name: ");
                    String gpName = scanner.nextLine();
                    System.out.print("Enter Availability: ");
                    String gpAvailability = scanner.nextLine();
                    Doctor gp = new GeneralPractitioner(gpName, gpAvailability);
                    system.addDoctor(gp);
                    System.out.println("General Practitioner added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Specialist's Name: ");
                    String specialistName = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = scanner.nextLine();
                    System.out.print("Enter Availability: ");
                    String specialistAvailability = scanner.nextLine();
                    Doctor specialist = new Specialist(specialistName, specialization, specialistAvailability);
                    system.addDoctor(specialist);
                    System.out.println("Specialist added successfully!");
                    break;

                case 3:
                    System.out.print("Enter Patient's Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter Patient's Contact Info: ");
                    String contactInfo = scanner.nextLine();
                    Patient patient = new Patient(patientName, contactInfo);
                    system.addPatient(patient);
                    System.out.println("Patient added successfully!");
                    break;

                case 4:
                    system.viewDoctors();
                    break;

                case 5:
                    System.out.print("Enter Patient's Name: ");
                    String appointmentPatientName = scanner.nextLine();
                    Patient foundPatient = null;
                    for (Patient p : system.getPatients()) {
                        if (p.getName().equals(appointmentPatientName)) {
                            foundPatient = p;
                            break;
                        }
                    }

                    if (foundPatient == null) {
                        System.out.println("Patient not found! Please add the patient first.");
                        break;
                    }

                    System.out.print("Enter Doctor's Name: ");
                    String appointmentDoctorName = scanner.nextLine();
                    Doctor foundDoctor = null;
                    for (Doctor d : system.getDoctors()) {
                        if (d.getName().equals(appointmentDoctorName)) {
                            foundDoctor = d;
                            break;
                        }
                    }

                    if (foundDoctor == null) {
                        System.out.println("Doctor not found!");
                        break;
                    }

                    System.out.print("Enter Appointment Date: ");
                    String appointmentDate = scanner.nextLine();
                    system.bookAppointment(foundPatient, foundDoctor, appointmentDate);
                    break;

                case 6:
                    system.viewAppointments();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
    }
}
