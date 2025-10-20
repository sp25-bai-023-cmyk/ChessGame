package chess.model;

import chess.model.Color;
import chess.model.PieceType;

public class Piece {
    public final PieceType type;
    public final Color color;     // ye batata hai ke wo White hai ya Black.

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


