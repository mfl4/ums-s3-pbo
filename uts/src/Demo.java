import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        Player player1 = new Player(null);
        System.out.print("Masukkan nama player: ");

        player1.setName(scanner.nextLine());
        
        System.out.println("Nama player: " + player1.getName());

        scanner.close();

    }
}
