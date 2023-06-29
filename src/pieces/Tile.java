package pieces;

public abstract class Tile {
    public int tileCoordinate;
    public Tile(int tileCoordinate){
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileTaken();

    public static final class EmptyTile extends Tile{
        EmptyTile(int tileCoordinate){
            super(tileCoordinate);
        }

        @Override
        public boolean isTileTaken() {
            return false;
        }
    }
}
