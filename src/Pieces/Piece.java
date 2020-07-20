package Pieces;

import Game.*;

public abstract class Piece
{
    public int m_x, m_y;
    public Player m_player;

    /*
        Constructor for a piece.
        @param x   the x location of the piece
        @param y   the y location of the piece
        @param player   the player associated with said piece
     */

    public Piece(int x, int y, Player player)
    {
        m_x = x;
        m_y = y;
        m_player = player;
        m_player.myGame.gameBoard.boardArray[x][y] = this;
    }

    /*
        method that determines if path is valid based on piece type
        @param finalX   the final x location
        @param finalY   the final y location
        @return   a boolean indicating if the path is valid
     */

    public abstract boolean isValidPath(int finalX, int finalY);

    /*
        method that draws a path form one point to another based on piece type and stores the coordinates
        @param startX
        @param startY
        @param finalX
        @param finalY
        @return   an array of coordinates of the given path
     */

    public abstract int[][] drawPath(int startX, int startY, int finalX, int finalY);

    public abstract Type getType();
}
