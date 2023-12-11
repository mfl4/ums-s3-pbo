package exercise.university;

public class Student {
    public String firstName, lastName;
    String studentID;
    int age;
    float gpa;

    public Student() {
        System.out.println("A student object has been successfully created");
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("A student object with named " + this.firstName + " " + this.lastName + " has been successfully created");
    }

    void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("The name of student has been change");
    } 
    void setName(String firstName) {
        this.firstName = firstName;
        System.out.println("");
    }
}