package chess.logic;

import chess.model.Board;
import chess.model.Color;
import chess.model.Piece;
import chess.model.Position;

import java.util.ArrayList;
import java.util.List;

import static chess.model.PieceType.PAWN;
import static chess.model.PieceType.ROOK;

public class MoveGenerator {

    public static List<Position> getPossibleMoves(Position from, Piece piece, Board board) {
        List<Position> moves = new ArrayList<>();
        int row = from.getRow();
        int col = from.getCol();

        switch (piece.getType()) {
            case PAWN:
                if (piece.getColor() == Color.WHITE) {
                    if (board.getPiece(row - 1, col) == null)
                        moves.add(new Position(row - 1, col));
                } else {
                    if (board.getPiece(row + 1, col) == null)
                        moves.add(new Position(row + 1, col));
                }
                break;

            case ROOK:
                // rook moves horizontally and vertically
                for (int r = row - 1; r >= 0; r--) {
                    if (board.getPiece(r, col) == null)
                        moves.add(new Position(r, col));
                    else break;
                }
                for (int r = row + 1; r < 8; r++) {
                    if (board.getPiece(r, col) == null)
                        moves.add(new Position(r, col));
                    else break;
                }
                for (int c = col - 1; c >= 0; c--) {
                    if (board.getPiece(row, c) == null)
                        moves.add(new Position(row, c));
                    else break;
                }
                for (int c = col + 1; c < 8; c++) {
                    if (board.getPiece(row, c) == null)
                        moves.add(new Position(row, c));
                    else break;
                }
                break;

            // baad mein Knight, Bishop, Queen, King add karogi
        }
        return moves;
    }


    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();

        Position from = new Position(6, 4); // e2
        Position to = new Position(4, 4);   // e4
        board.movePiece(from, to);

        board.printBoard();
    }
}

