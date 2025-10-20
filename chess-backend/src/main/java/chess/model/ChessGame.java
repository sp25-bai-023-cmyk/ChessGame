package chess.model;
//pure game ka controller hai
//ye decide karti hai kis player ki turn hai, board ka haal kya hai, aur move chal sakta hai ya nahi.
public class ChessGame {
    private final Board board;
    private Player whitePlayer;
    private Player blackPlayer;
    private Color currentTurn;//batata hai ab kis ka move chal raha hai (WHITE ya BLACK)

    public ChessGame(String whiteName, String blackName) {
        board = new Board();
        whitePlayer = new Player(whiteName, Color.WHITE);
        blackPlayer = new Player(blackName, Color.BLACK);
        currentTurn = Color.WHITE;
    }
//ye method ek move chalata hai (from → to)    pehle board se piece uthata hai (jis khanay se move karna hai)
    public void playMove(Position from, Position to) {
        Piece piece = board.getPiece(from.getRow(), from.getCol());
//agar us square pe koi piece hi nahi
        if (piece == null) {
            System.out.println("No piece at that position");
            return;
        }
//turn ka check
        if (piece.getColor() != currentTurn) {
            System.out.println("It's not your turn!");
            return;
        }
//piece actually board pe move ho jaata hai
//aur turn doosre player ko mil jaata hai toggle hoti hai
        board.movePiece(from, to);
        toggleTurn();
    }

    private void toggleTurn() {
        currentTurn = (currentTurn == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    public void printBoard() {
        board.printBoard();
    }
}
