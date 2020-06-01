public class Player {
    private String name;
    private int goal;

    public Player(String name, int goal) {
        this.name = name;
        this.goal = goal;
    }

    public Player(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return goal;
    }

    public String toString() {
        return name + ", goals " + goal;
    }
}