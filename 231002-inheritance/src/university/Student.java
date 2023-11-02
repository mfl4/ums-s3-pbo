package university;

public class Student {
    String name;
    String nim;
    Byte age;
    String gender;
    float gpa;
    static final float MAX_GPA = 4.0f;
    static final Byte MAX_AGE = 127;

    public Student(String name, String nim, Byte age, String gender, float gpa) {
        this.name = name;
        this.nim = nim;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }

    void fillKrs() {
        String message = "Mahasiswa berhasil mengisi KRS";
        System.out.println(message);
    }

    void setName (String newName) {
        this.name = newName;
    }
    float printValue() {
        return this.gpa;
    }
    public String nextLine(){
        return null;
    }
}
