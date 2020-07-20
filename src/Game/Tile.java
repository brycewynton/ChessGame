package Game;

/*
    Created by brycewynton 07/20/2020
    trying my hand at making a functional chess game
    from a variety of youtube videos and google searches.
 */

import Pieces.Piece;
import java.util.*;

public abstract class Tile
{
    protected final int tile_Coordinate;

    private final Map<Integer, EmptyTile> EMPTY_TILES = createAllPossibleEmptyTiles();

    private Map<Integer,EmptyTile> createAllPossibleEmptyTiles()
    {
        final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();

        for (int i = 0; i < 64; i++)
        {
            emptyTileMap.put(i, new EmptyTile(i));
        }

        return ImmutableMap.copyOf(emptyTileMap);touc
    }

    public Tile(int tile_Coordinate)
    {
        this.tile_Coordinate = tile_Coordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();
}
