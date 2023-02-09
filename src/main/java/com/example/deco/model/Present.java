package com.example.deco.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Present extends TreeDecorator
{
    public Present (ChristmasTree tree)
    {
        super (tree);
    }
    public void operation(GraphicsContext gr)
    {
        super.operation(gr);
        drawPresent(gr);
    }
    private void drawPresent (GraphicsContext gr)
    {
        Random r = new Random();
        Color randomColor = new Color(r.nextDouble(), r.nextDouble(),r.nextDouble(),1);
        gr.setFill(randomColor);
        gr.fillRect(50,97,30,15);
        Color randomColor2 = new Color(r.nextDouble(), r.nextDouble(),r.nextDouble(),1);
        gr.setFill(randomColor2);
        gr.fillRoundRect(30,90,30,31,32,34);
        Color randomColor3 = new Color(r.nextDouble(), r.nextDouble(),r.nextDouble(),1);
        gr.setFill(randomColor3);
        gr.fillRect(10,90,20,35);
    }
}

