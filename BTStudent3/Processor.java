
package BTStudent3;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Processor {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PersonList personList = new PersonList();

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    addNewTeacher();
                    break;
                case 3:
                    updatePerson();
                    break;
                case 4:
                    deletePersonById();
                    break;
                case 5:
                    findPersonById();
                    break;
                case 6:
                    displayEveryone();
                    break;
                case 7:
                    findTopStudent();
                    break;
                case 8:
                    findTeacherByDepartment();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("1. Add a new student");
        System.out.println("2. Add a new teacher");
        System.out.println("3. Update person");
        System.out.println("4. Delete person by id");
        System.out.println("5. Find person by id");
        System.out.println("6. Display all students and teachers");
        System.out.println("7. Find the student with the highest GPA");
        System.out.println("8. Find a teacher by department");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    } 

    private static void addNewStudent() {
        try {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Full Name: ");
            String fullName = scanner.nextLine();
            System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
            Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
            System.out.print("Enter GPA: ");
            float gpa = scanner.nextFloat();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Major: ");
            String major = scanner.nextLine();

            Student student = new Student(id, fullName, dateOfBirth, gpa, major);
            personList.addStudent(student);
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private static void addNewTeacher() {
        try {
            System.out.print("Enter Teacher ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Full Name: ");
            String fullName = scanner.nextLine();
            System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
            Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
            System.out.print("Enter Department: ");
            String department = scanner.nextLine();
            System.out.print("Enter Teaching Subject: ");
            String teachingSubject = scanner.nextLine();

            Teacher teacher = new Teacher(id, fullName, dateOfBirth, department, teachingSubject);
            personList.addTeacher(teacher);
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private static void updatePerson() {
        System.out.print("Enter the ID of the person to update: ");
        String id = scanner.nextLine();
        personList.updatePerson(id);
    }

    private static void deletePersonById() {
        System.out.print("Enter the ID of the person to delete: ");
        String id = scanner.nextLine();
        personList.deletePersonById(id);
    }

    private static void findPersonById() {
        System.out.print("Enter the ID of the person to find: ");
        String id = scanner.nextLine();
        Person person = personList.findPersonById(id);
        if (person != null) {
            person.displayInfo();
        } else {
            System.out.println("Person not found.");
        }
    }

    private static void displayEveryone() {
        personList.displayEveryone();
    }

    private static void findTopStudent() {
        Student topStudent = personList.findTopStudent();
        if (topStudent != null) {
            System.out.println("Student with the highest GPA:");
            topStudent.displayInfo();
        } else {
            System.out.println("No students found.");
        }
    }

    private static void findTeacherByDepartment() {
        System.out.print("Enter the department to search for a teacher: ");
        String department = scanner.nextLine();
        Teacher teacher = personList.findTeacherByDepartment(department);
        if (teacher != null) {
            System.out.println("Teacher found in department " + department + ":");
            teacher.displayInfo();
        } else {
            System.out.println("No teacher found in this department.");
        }
    }
}
