package exercise.ai;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswas = new Mahasiswa[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));

            mahasiswas[i] = new Mahasiswa();
            mahasiswas[i].inputData();
        }

        System.out.println("Data mahasiswa yang dimasukkan:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            mahasiswas[i].displayData();
        }
    }
}
