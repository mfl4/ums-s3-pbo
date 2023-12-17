package assignment;

public class PublicModifier {
    public int x = 10;
    public int y = 20;
    public int z = x + y;

    public void multiply() {
        System.out.println("Public Multiplication of " + x + ", " + y + " and " + z + " is " + (x * y * z));
    }
}
