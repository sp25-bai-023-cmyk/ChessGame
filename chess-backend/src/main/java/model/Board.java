package model;

public class Board {
    private Piece[][] board; // 8x8 chess board

    // Constructor  8x8 array initialize
    public Board() {
        board = new Piece[8][8];
        setupInitialPosition(); // function to set pieces (now empty)
    }

    private void setupInitialPosition() {

    }
    //taking piece from board
    public Piece getPiece(int r, int c) {
        return board[r][c];
    }

    public void setPiece(int r, int c, Piece piece) {
        board[r][c] = piece;
    }
    public void printBoard() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Piece piece = board[r][c];
                if (piece == null)
                    System.out.print(". ");
                else
                    System.out.print(piece.getType() + " ");
            }
            System.out.println();
        }
    }
}
