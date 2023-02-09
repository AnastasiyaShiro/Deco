package com.example.deco.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Girlanda extends TreeDecorator
{
    public Girlanda (ChristmasTree tree)
    {
        super (tree);
    }
    public void operation(GraphicsContext gr)
    {
        super.operation(gr);
        drawGirlanda(gr);
    }
    private void drawGirlanda (GraphicsContext gr)
    {
        Random r = new Random();
        Color randomColor = new Color(r.nextDouble(), r.nextDouble(),r.nextDouble(),r.nextDouble());
        gr.setFill(randomColor);
        gr.fillRoundRect(20,60,10,10,10,10);
        Color randomColor2 = new Color(r.nextDouble(), r.nextDouble(),r.nextDouble(),r.nextDouble());
        gr.setFill(randomColor2);
        gr.fillRoundRect(30,70,10,10,10,10);
        Color randomColor3= new Color(r.nextDouble(), r.nextDouble(),r.nextDouble(),r.nextDouble());
        gr.setFill(randomColor3);
        gr.fillRoundRect(44,76,10,10,10,10);
        Color randomColor4= new Color(r.nextDouble(), r.nextDouble(),r.nextDouble(),r.nextDouble());
        gr.setFill(randomColor4);
        gr.fillRoundRect(59,81,10,10,10,10);
    }
}
