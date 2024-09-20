
package BTStudent2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student by ID");
            System.out.println("3. Display All Students");
            System.out.println("4. Find Student by ID");
            System.out.println("5. Find Top Student");
            System.out.println("6. Find Scholarship Students");
            System.out.println("7. Calculate Total Tuition of All Students");
            System.out.println("8. Update Student by ID");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Full Name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
                    String dob = scanner.nextLine();
                    Date dateOfBirth = dateFormat.parse(dob);
                    System.out.print("Enter GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Enter Major: ");
                    String major = scanner.nextLine();
                    Student student = new Student(id, fullName, dateOfBirth, gpa, major) {};
                    studentList.addStudent(student);
                    break;
                case 2:
                    System.out.print("Enter Student ID to delete: ");
                    String delId = scanner.nextLine();
                    studentList.deleteStudentById(delId);
                    break;
                case 3:
                    studentList.displayAllStudents();
                    break;
                case 4:
                    System.out.print("Enter Student ID to find: ");
                    String findId = scanner.nextLine();
                    Student foundStudent = studentList.findStudentById(findId);
                    if (foundStudent != null) {
                        foundStudent.displayInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top Student:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;
                case 6:
                    System.out.println("Scholarship Students:");
                    for (Student scholarshipStudent : studentList.findScholarshipStudents()) {
                        scholarshipStudent.displayInfo();
                        System.out.println("----------");
                    }
                    break;
                case 7:
                    double totalTuition = studentList.calculateTuitionOfAllStudents();
                    System.out.println("Total Tuition of All Students: " + totalTuition);
                    break;
                case 8:
                    System.out.print("Enter Student ID to update: ");
                    String updateId = scanner.nextLine();
                    Student studentToUpdate = studentList.findStudentById(updateId);
                    if (studentToUpdate != null) {
                        System.out.print("Enter New Full Name: ");
                        String newFullName = scanner.nextLine();
                        System.out.print("Enter New Date of Birth (dd/MM/yyyy): ");
                        String newDob = scanner.nextLine();
                        Date newDateOfBirth = dateFormat.parse(newDob);
                        System.out.print("Enter New GPA: ");
                        float newGpa = scanner.nextFloat();
                        scanner.nextLine();
                        System.out.print("Enter New Major: ");
                        String newMajor = scanner.nextLine();
                        
                        boolean updated = studentList.updateStudentById(updateId, newFullName, newDateOfBirth, newGpa, newMajor);
                        if (updated) {
                            System.out.println("Student updated successfully.");
                        } else {
                            System.out.println("Failed to update student.");
                        }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
