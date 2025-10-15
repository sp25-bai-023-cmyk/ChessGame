package chess.model;

import model.Piece;

public class Move {
    private int start_Row, start_Col;   // Move ki starting position
    private int end_row, end_col;       // Move ki ending position
    private model.Piece moved_piece;         // Jo piece move hua
    private model.Piece dead_piece;      // Agar koi piece mara gaya

    public Move(int start_Row, int start_Col, int end_row, int end_col,
                model.Piece moved_piece, model.Piece dead_piece) {
        this.start_Row = start_Row;
        this.start_Col = start_Col;
        this.end_row = end_row;
        this.end_col = end_col;
        this.moved_piece = moved_piece;
        this.dead_piece = dead_piece;
    }

    public int getStart_Row() { return start_Row; }
    public int getStart_Col() { return start_Col; }
    public int getEnd_row() { return end_row; }
    public int getEnd_col() { return end_col; }
    public model.Piece getMoved_piece() { return moved_piece; }
    public Piece getDead_piece() { return dead_piece; }
}


