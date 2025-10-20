package chess.model;

public class Player {
    private String name;   // Player ka naam
    private Color color;   // Player ka color (WHITE / BLACK)

    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
