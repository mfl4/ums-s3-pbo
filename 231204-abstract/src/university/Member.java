package university;

public abstract class Member {
    public String firstName, lastName;
    int age;
    String gender;

    abstract void presence();
    void park() {
        System.out.println("Parked");
    }
}