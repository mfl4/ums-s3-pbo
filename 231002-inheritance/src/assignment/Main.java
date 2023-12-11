package assignment;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student intStudent = new IntStudent();
        
        student.setStudent();
        System.out.println("\n");
        intStudent.setStudent();
        
        System.out.println("\n");
        
        student.showStudent();
        System.out.println("\n");
        intStudent.showStudent();
        
        System.out.println("\n");
    }
}