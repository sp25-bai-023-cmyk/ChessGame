package chess.model;

public class Board {
    private chess.model.Piece[][] board; // 8x8 chess board

    public Board() {
        board = new chess.model.Piece[8][8];
        setupInitialPosition(); // function to set pieces
    }

    private void setupInitialPosition() {
        // BLACK PIECES

        board[0][0] = new chess.model.Piece(PieceType.ROOK, Color.BLACK);
        board[0][1] = new chess.model.Piece(PieceType.KNIGHT, Color.BLACK);
        board[0][2] = new chess.model.Piece(PieceType.BISHOP, Color.BLACK);
        board[0][3] = new chess.model.Piece(PieceType.QUEEN, Color.BLACK);
        board[0][4] = new chess.model.Piece(PieceType.KING, Color.BLACK);
        board[0][5] = new chess.model.Piece(PieceType.BISHOP, Color.BLACK);
        board[0][6] = new chess.model.Piece(PieceType.KNIGHT, Color.BLACK);
        board[0][7] = new chess.model.Piece(PieceType.ROOK, Color.BLACK);

        // Black pawns (row 1)
        for (int c = 0; c < 8; c++) {
            board[1][c] = new chess.model.Piece(PieceType.PAWN, Color.BLACK);
        }

        // EMPTY MIDDLE SQUARES
        for (int r = 2; r <= 5; r++) {
            for (int c = 0; c < 8; c++) {
                board[r][c] = null;
            }
        }

        //  WHITE PAWNS
        for (int c = 0; c < 8; c++) {
            board[6][c] = new chess.model.Piece(PieceType.PAWN, Color.WHITE);
        }

        // ******** WHITE PIECES ********
        board[7][0] = new chess.model.Piece(PieceType.ROOK, Color.WHITE);
        board[7][1] = new chess.model.Piece(PieceType.KNIGHT, Color.WHITE);
        board[7][2] = new chess.model.Piece(PieceType.BISHOP, Color.WHITE);
        board[7][3] = new chess.model.Piece(PieceType.QUEEN, Color.WHITE);
        board[7][4] = new chess.model.Piece(PieceType.KING, Color.WHITE);
        board[7][5] = new chess.model.Piece(PieceType.BISHOP, Color.WHITE);
        board[7][6] = new chess.model.Piece(PieceType.KNIGHT, Color.WHITE);
        board[7][7] = new chess.model.Piece(PieceType.ROOK, Color.WHITE);
    }

    //taking piece from board
    public chess.model.Piece getPiece(int r, int c) {
        return board[r][c];
    }

    public void setPiece(int r, int c, chess.model.Piece piece) {
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
    public void movePiece(Position from, Position to) {
        Piece movingPiece = board[from.getRow()][from.getCol()];
        Piece capturedPiece = board[to.getRow()][to.getCol()];

        board[to.getRow()][to.getCol()] = movingPiece;
        board[from.getRow()][from.getCol()] = null;

        System.out.println("Moved " + movingPiece.getType() + " from " + from + " to " + to);
        if (capturedPiece != null)
            System.out.println("Captured " + capturedPiece.getType());
    }
}
