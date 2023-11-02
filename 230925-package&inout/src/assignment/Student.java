package assignment;
import java.util.Scanner;

public class Student {
    String name;
    float gpa;
    short age;
    
    void studentDataInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nama Mahasiswa:");
        this.name = input.nextLine();

        while (true) {
            System.out.println("IPK Mahasiswa (0.00 - 4.00):");
            this.gpa = input.nextFloat();
            if (this.gpa >= 0.00 && this.gpa <= 4.00) {
                break;
            } else {
                System.out.println("IPK harus berada di antara 0.00 dan 4.00. Masukkan ulang!");
            }
        }

        while (true) {
            System.out.println("Usia Mahasiswa (0 - 200):");
            this.age = input.nextShort();
            if (this.age >= 0 && this.age <= 200) {
                break;
            } else {
                System.out.println("Usia harus berada di antara 0 dan 200. Masukkan ulang!");
            }
        }
    }

    void studentDataDisplay() {
        System.out.println("Nama: " + this.name);
        System.out.println("IPK: " + this.gpa);
        System.out.println("Usia: " + this.age);
    }
}