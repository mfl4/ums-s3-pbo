package assignments;

public class Student {
    String name;
    short age;
    float gpa;

    public Student(String name) {
        this.name = name;
        System.out.println("The student named " + name + " has graduated from Muhammadiyah University of Surakarta.");
    }

    public Student(String name, short age) {
        this.name = name;
        this.age = age;
        System.out.println("The student named " + name
                + " has graduated from Muhammadiyah University of Surakarta at the age of " + age + ".");
    }

    public Student(String name, short age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;

        System.out.println(
                "The student named " + name + " has graduated from Muhammadiyah University of Surakarta at the age of "
                        + age + " with a GPA of " + gpa + ".");
    }

    public static void main(String[] args) {
        Student student = new Student("Jabieb");
        Student student2 = new Student("Javier", (short) 22);
        Student student3 = new Student("Hansen", (short) 22, 4.0f);
    }
}
