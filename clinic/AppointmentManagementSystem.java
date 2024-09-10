package com.mycompany.clinic;
import java.util.ArrayList;
import java.util.List;

class AppointmentManagementSystem {
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Appointment> appointments;

    public AppointmentManagementSystem() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void viewDoctors() {
        System.out.println("Available Doctors:");
        for (Doctor doctor : doctors) {
            doctor.displayAvailability();
        }
    }

    public void bookAppointment(Patient patient, Doctor doctor, String appointmentDate) {
        Appointment appointment = new Appointment(doctor, patient, appointmentDate);
        appointments.add(appointment);
        System.out.println("Appointment booked successfully!");
    }

    public void viewAppointments() {
        System.out.println("All Appointments:");
        for (Appointment appointment : appointments) {
            appointment.displayAppointmentDetails();
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}
