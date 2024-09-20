
package BTStudent2;

import java.util.Date;

public abstract class Student extends Person {
    private float gpa;
    private String major;
    private double tuition;
    private boolean scholarship;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
        this.scholarship = gpa >= 9;
        calculateTuition();
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
        calculateTuition();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuition() {
        return tuition;
    }

    public boolean hasScholarship() {
        return scholarship;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Tuition: " + tuition);
        System.out.println("Scholarship: " + (scholarship ? "Yes" : "No"));
    }

    public void calculateTuition() {
        tuition = 10000000;
        if (gpa >= 9) {
            scholarship = true;
            tuition *= 0.5;
        } else {
            scholarship = false;
        }
    }
}
