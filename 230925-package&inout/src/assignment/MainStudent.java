package assignment;

public class MainStudent {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Student[] student = new Student[5];

        System.out.println("\n" +">>>>> INPUT DATA MAHASISWA <<<<<" + "\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("\n" +"DATA MAHASISWA KE-" + (i + 1));
            student[i] = new Student();
            student[i].studentDataInput();
        }

        System.out.println("\n" + ">>>>> OUTPUT DATA MAHASISWA <<<<<" + "\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("\n" + "Mahasiswa ke-" + (i + 1));
            student[i].studentDataDisplay();
        }
    }
}