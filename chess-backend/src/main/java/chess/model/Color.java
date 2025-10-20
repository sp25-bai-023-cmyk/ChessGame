package chess.model;

public enum Color {
    WHITE, BLACK;

    public Color opposite() {
        return this == WHITE ? BLACK : WHITE;
    }
}
//Ye batata hai ke har piece ya player ka color kya hai  sirf White ya Black.
//
//hm is e

