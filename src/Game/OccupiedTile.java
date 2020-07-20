package Game;

import Pieces.Piece;

public final class OccupiedTile extends Tile
{
    private final Piece piece_on_tile;

    OccupiedTile(int tile_Coordinate, Piece piece_on_tile)
    {
        super(tile_Coordinate);
        this.piece_on_tile = piece_on_tile;
    }

    @Override
    public boolean isTileOccupied()
    {
        return true;
    }

    @Override
    public Piece getPiece()
    {
        return this.piece_on_tile;
    }
}