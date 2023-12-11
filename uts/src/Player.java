public class Player {
    private String name;
    Player(String name) {
        this.name = name;
    }

    void setName(String name) {
        if (name.split(" ").length > 1) { 
            this.name = name;
        }
    }
    String getName() {
        return this.name;
    }
}
