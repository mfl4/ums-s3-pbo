package assignment;

import java.util.Scanner;

public class Student {
    String name;
    String student_id;
    String address;
    Byte age;

    Scanner input = new Scanner(System.in);

    void setStudent() {
        System.out.println("ENTER STUDENT INFORMATION");
        System.out.print("Name: ");
        this.name = input.nextLine();
        System.out.print("Student ID: ");
        this.student_id = input.nextLine();
        System.out.print("Address: ");
        this.address = input.nextLine();
        System.out.print("Age: ");
        this.age = input.nextByte();
    }

    void showStudent() {
        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + student_id);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}