package com.example.deco.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Star extends TreeDecorator
{
    public Star (ChristmasTree tree)
    {
        super (tree);
    }
    public void operation(GraphicsContext gr)
    {
        super.operation(gr);
        drawStar(gr);
    }
    private void drawStar (GraphicsContext gr)
    {
        gr.setFill(Color.YELLOW);
        double[] arrayX = {34.5,44.5,49.5,54.5,64.5,54.5,49.5,44.5};
        double[] arrayY = {25,30,40,30,25,20,10,20};
        gr.fillPolygon(arrayX,arrayY,8);
    }
}
