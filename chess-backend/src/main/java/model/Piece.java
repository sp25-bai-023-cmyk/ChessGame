package model;

public class Piece {
    private PieceType type; //ye batata hai ke piece kis type ka hai king,queen etc
    private Color color;     // ye batata hai ke wo White hai ya Black.

    public Piece(PieceType type, Color color) {
        this.type = type;
        this.color = color;
    }
    public PieceType getType() {
        return type;
    }
    public Color getColor() {
        return color;
    }

}

