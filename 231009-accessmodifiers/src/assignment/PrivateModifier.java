package assignment;

public class PrivateModifier {
    private int x = 10;
    private int y = 20;
    private int z = x + y;

    private void multiply() {
        System.out.println("Private Multiplication of " + x + ", " + y + " and " + z + " is " + (x * y * z));
    }
}
