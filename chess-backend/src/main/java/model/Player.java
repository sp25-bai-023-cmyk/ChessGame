package model;

public class Player {
    private String name;   // Player  naam
    private Color color;   // Player ka color
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
