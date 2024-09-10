
package com.mycompany.clinic;

    class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String name, String availability) {
        super(name, "General Practitioner", availability);
    }

    @Override
    public void displayAvailability() {
        System.out.println(getName() + " (General Practitioner) is available for walk-ins at " + getAvailability());
    }
}
