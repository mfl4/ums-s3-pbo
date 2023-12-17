package assignment;

public class AllModifier {
    private int w = 1;
    int x = 2;
    protected int y = 3;
    public int z = 4;

    private void multiply() {
        System.out.println("Private Multiplication of " + w + ", " + y + " and " + z + " is " + (w * y * z));
    }

    void divide() {
        System.out.println("Default Division of " + w + ", " + y + " and " + z + " is " + (z / w / y));
    }

    protected void add() {
        System.out.println("Protected Addition of " + w + ", " + y + " and " + z + " is " + (w + y + z));
    }

    public void subtract() {
        System.out.println("Public Subtraction of " + w + ", " + y + " and " + z + " is " + (w - y - z));
    }

    public static void main(String[] args) {
        AllModifier object = new AllModifier();

        object.w = 10;
        object.x = 20;
        object.y = 30;
        object.z = 40;

        object.multiply();
        object.divide();
        object.add();
        object.subtract();
    }
}
