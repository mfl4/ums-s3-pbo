package assignment;

public class ProtectedModifier {
    protected int x = 10;
    protected int y = 20;
    protected int z = x + y;

    protected void multiply() {
        System.out.println("Protected Multiplication of " + x + ", " + y + " and " + z + " is " + (x * y * z));
    }
}
