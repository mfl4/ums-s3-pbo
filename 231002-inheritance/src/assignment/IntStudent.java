package assignment;

public class IntStudent extends Student {
    String country;

    @Override
    void setStudent() {
        System.out.println("ENTER INTERNANTIONAL STUDENT INFORMATION");
        System.out.print("Name: ");
        this.name = input.nextLine();
        System.out.print("Student ID: ");
        this.student_id = input.nextLine();
        System.out.print("Address: ");
        this.address = input.nextLine();
        System.out.print("Age: ");
        this.age = input.nextByte();
        input.nextLine();
        System.out.print("Country: ");
        this.country = input.nextLine();
    }

    @Override
    void showStudent() {
        System.out.println("INTERNATIONAL STUDENT INFORMATION");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + student_id);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}
