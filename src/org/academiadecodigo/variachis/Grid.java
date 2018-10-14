package org.academiadecodigo.variachis;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {

    public static final int PADDING = 10;
    private int cols;
    private int rows;
    private int cellSize = 100;

    //private Rectangle gridRect;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void build() {

        //gridRect = new Rectangle(PADDING, PADDING, cellSize * cols, cellSize * rows);
        //gridRect.setColor(Color.BLUE);
        //gridRect.draw();

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {

                Rectangle cell = new Rectangle(colsToX(i), rowsToY(j), cellSize, cellSize);
                cell.setColor(Color.RED);
                cell.draw();

                Picture bpic = new Picture(colsToX(i), rowsToY(j), "Resources/Cistern2.jpg");
                bpic.draw();
            }
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int colsToX (int cols) {

        return cellSize * cols + PADDING;
    }

    public int rowsToY(int rows) {
        return cellSize * rows + PADDING;
    }

    public int getCellSize() {
        return cellSize;
    }
}