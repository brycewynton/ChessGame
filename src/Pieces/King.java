package Pieces;

import Game.*;

public class King extends Piece
{
    public Type type;

    public King(int x, int y, Player player)
    {
        super(x, y, player);
        type = Type.KING;
    }

    /*
     method that determines if path is valid based on piece type
     @param finalX   the final x location
     @param finalY   the final y location
     @return   a boolean indicating if the path is valid
  */

    @Override
    public boolean isValidPath(int finalX, int finalY)
    {
        int x_differential = Math.abs(finalX - this.m_x);
        int y_differential = Math.abs(finalY - this.m_y);

        return (x_differential == y_differential);
    }

    /*
     method that draws a path form one point to another based on piece type and stores the coordinates
     @param startX
     @param startY
     @param finalX
     @param finalY
     @return   an array of coordinates of the given path
  */

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY)
    {
        int pairs = Math.abs(finalX - startX);

        int x_direction = 1, y_direction = 1;
        if (finalX -startX < 0)
            x_direction = -1;
        if (finalY - startY < 0)
            y_direction = -1;

        int[][] path = new int[2][pairs - 1];

        if(pairs - 1 > 0)
        {
            for (int i = 0; i < pairs - 1; i++)
            {
                path[0][i] = startX + x_direction*1;
                path[1][i] = startY + y_direction*1;
            }
        }
        return path;
    }

    public Type getType() { return type; }

}
