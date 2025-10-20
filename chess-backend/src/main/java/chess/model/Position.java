package chess.model;
//ye Position class chess board ke ek khanay (square) ko represent karti hai
public class Position {
    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }

    @Override
    //ye method position ko chess notation (jaise “e4”, “a1”) mein badal deta hai.
    //'a' + col matlab agar col = 0, to file = 'a';
    //agar col = 4, to file = 'e'
    //8 - row kyunki chess board ki numbering upar se niche aati hai,
    //matlab row = 6 ho to wo rank = 2 ban jaata hai (yaani “e2”)
    //return karta hai "e4" jaise readable format.
    public String toString() {
        char file = (char) ('a' + col);
        int rank = 8 - row;
        return "" + file + rank; // e.g. "e4"
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Position)) return false;//agar saamne wala object Position type ka hi nahi hai (kuch aur class ka hai)
        //to seedha false return kar do
        Position other = (Position) obj;// hum us object ko Position mein convert kar lete hain  taake uske row aur col ko access kar sakein.
        return this.row == other.row && this.col == other.col;//gar dono ka row aur col same hai  to true, warna false.
    }

}

