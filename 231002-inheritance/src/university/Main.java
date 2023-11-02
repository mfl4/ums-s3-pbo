package university;

public class Main {
    public static void main(String[] args) {
        Student localStudent = new Student("Freya", "1234567890", (byte) 20, "Female", 3.5f);
        InterStudent interStudent = new InterStudent("Farhan", "1234567890", (byte) 20, "Male", 3.5f);
        
        System.out.println(localStudent.name);
        System.out.println(interStudent.name);
    }
}
