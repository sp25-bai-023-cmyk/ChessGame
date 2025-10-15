package chess.model;

import chess.model.Color;
import chess.model.PieceType;

public class Piece {
    private chess.model.PieceType type; //ye batata hai ke piece kis type ka hai king,queen etc
    private chess.model.Color color;     // ye batata hai ke wo White hai ya Black.

    public Piece(chess.model.PieceType type, chess.model.Color color) {
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


