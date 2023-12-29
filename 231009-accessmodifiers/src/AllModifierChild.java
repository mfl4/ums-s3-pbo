import assignment.AllModifier;

public class AllModifierChild extends AllModifier {
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
