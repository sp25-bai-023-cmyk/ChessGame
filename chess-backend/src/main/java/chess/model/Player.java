package chess.model;

import model.Color;

public class Player {
    private String name;   // Player  naam
    private model.Color color;   // Player ka color
    public Player(String name, model.Color color) {
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
