package exercise.ai;

import java.util.Scanner;

public class Mahasiswa {
    String nama;
    float ipk;
    short usia;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = scanner.nextLine();

        while (true) {
            System.out.print("IPK (0.00 - 4.00): ");
            ipk = scanner.nextFloat();
            if (ipk >= 0.00 && ipk <= 4.00) {
                break;
            } else {
                System.out.println("IPK harus berada di antara 0.00 dan 4.00");
            }
        }

        while (true) {
            System.out.print("Usia (0 - 200): ");
            usia = scanner.nextShort();
            if (usia >= 0 && usia <= 200) {
                break;
            } else {
                System.out.println("Usia harus berada di antara 0 dan 200");
            }
        }

        scanner.nextLine(); // Membersihkan newline character
        scanner.close();
    }

    public void displayData() {
        System.out.println("Nama: " + nama);
        System.out.println("IPK: " + ipk);
        System.out.println("Usia: " + usia);
        System.out.println();
    }
}
