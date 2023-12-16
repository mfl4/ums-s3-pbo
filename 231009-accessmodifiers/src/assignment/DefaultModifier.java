package assignment;

public class DefaultModifier {
    private int x = 10;
    private int y = 20;
    private int z = x + y;

    private void multiply() {
        System.out.println("Default Multiplication of " + x + ", " + y + " and " + z + " is " + (x * y * z));
    }
}
