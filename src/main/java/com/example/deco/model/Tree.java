package com.example.deco.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Tree implements ChristmasTree
{
    public void operation(GraphicsContext gr) {
        gr.setFill(Color.GREEN);
        double[] arrayX={20,80,50,20,100,70};
        double[] arrayY={50,50,30,70,70,50};
        gr.fillPolygon(arrayX,arrayY,6);
    }
}
