package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    public boolean[][] possibleMoves() {
        return new boolean[0][1];
    }

    public boolean possibleMove() {
        return true;
    }

    public boolean isThereAnyPossibleMove() {
        return true;
    }

    protected Board getBoard() {
        return board;
    }
}
