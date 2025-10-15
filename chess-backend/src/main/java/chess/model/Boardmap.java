package chess.model;

public class Boardmap {

    // Convert "e4" → [4,4]
    public static int[] toIndex(String square) {
        System.out.println("Converting square: " + square);

        char col_Letter = square.charAt(0);   // . e
        char row_Number = square.charAt(1);   //  4

        int col = col_Letter - 'a';           // a=0 b= 1 h=7
        int row = 8 - Character.getNumericValue(row_Number);  // 1=7,2=6

        System.out.println("col letter '" + col_Letter + "' → column: " + col);
        System.out.println("row  number '" + row_Number + "' → row: " + row);

        return new int[]{row, col};
    }

    // Convert [row,col] → "e4"
    public static String toSquare(int row, int col) {
        System.out.println("Converting indexes: row=" + row + ", col=" + col);

        char colss = (char) ('a' + col);   // 0 → 'a', 1 → 'b', ... 7 → 'h'
        int roww = 8 - row;               // 0 → 8, 7 → 1

        String square = "" + colss + roww;
        System.out.println("Result square: " + square);

        return square;
    }

    // Test the mapping
    public static void main(String[] args) {
        // Example 1: Convert "e2" → [row, col]
        int[] result = toIndex("e2");
        System.out.println("e2 → row=" + result[0] + ", col=" + result[1]);

        // Example 2: Convert [6,4] → "e2"
        String square = toSquare(6, 4);
        System.out.println("[6,4] → " + square);
    }
}
