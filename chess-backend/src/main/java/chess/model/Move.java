package chess.model;

public class Move {
    private Position from;
    private Position to;
    private Piece movedPiece;
    private Piece capturedPiece;
    private boolean isCheck;//kya move ke baad opponent ka king check mein aaya?
    private boolean isCheckmate;//kya move ne game khatam kar di (checkmate)?

    public Move(Position from, Position to, Piece movedPiece, Piece capturedPiece) {
        this.from = from;
        this.to = to;
        this.movedPiece = movedPiece;
        this.capturedPiece = capturedPiece;
        this.isCheck = false;
        this.isCheckmate = false;
    }

    // --- Getters ---
    public Position getFrom() { return from; }
    public Position getTo() { return to; }
    public Piece getMovedPiece() { return movedPiece; }
    public Piece getCapturedPiece() { return capturedPiece; }
    public boolean isCheck() { return isCheck; }
    public boolean isCheckmate() { return isCheckmate; }

    // ye game logic ke waqt use hoti hain jaise agar move ke baad king check mein gaya,
    //    to game engine bolega:   move.setCheck(true);
    public void setCheck(boolean check) { this.isCheck = check; }
    public void setCheckmate(boolean checkmate) { this.isCheckmate = checkmate; }

//    @Override
//    public String toString() {
//        String base = movedPiece + ": " + from + " → " + to;
//        if (capturedPiece != null) base += " x " + capturedPiece;
//        if (isCheckmate) base += " #";
//        else if (isCheck) base += " +";
//        return base;
//    }
}
