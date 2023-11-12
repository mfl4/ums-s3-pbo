package exercise.university;


public class Student {
    String name;
    String nim;
    int age;
    String gender;
    double gpa;
    static final float MAX_GPA = 4.0f;                                              
    void showMaxGpa() {
        String message = "The maximum gpa for this term is ";
        System.out.println(message + MAX_GPA);
    }
    public String getStudentName(String name){
        this.name = name;
        return this.name;
    }
}