package exercise.university;

public class Main {
    public static void main(String[] args) {
        // Create object from Student & InternationalStudent class
        Student student = new Student();
        InternationalStudent internationalStudent = new InternationalStudent();

        student.setName("Farhan");
        internationalStudent.setName("Freya", "Jayawardana");

        System.out.println("Student Name: " + student.firstName);
        System.out.println("International Student Name: " + student.firstName + " " + student.lastName);
    }
}