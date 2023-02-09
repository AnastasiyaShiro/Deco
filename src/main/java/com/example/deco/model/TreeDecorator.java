package com.example.deco.model;

import javafx.scene.canvas.GraphicsContext;

public class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;
    public TreeDecorator(ChristmasTree tree)
    {
        this.tree = tree;
    }
    public void operation(GraphicsContext gr)
    {
        tree.operation(gr);
    }// выполняет рисование соответствующего объекта Елки на указанной панели

}
