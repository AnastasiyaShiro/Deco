package com.example.deco;

import com.example.deco.model.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable
{
    public Canvas canv;
    ChristmasTree tree;
    TreeDecorator trDec;
    @FXML
    protected void addPresent()
    {
        GraphicsContext gr = canv.getGraphicsContext2D();
        trDec=new Present(tree);
        trDec.operation(gr);
    }
    @FXML
    protected void addStar()
    {
        GraphicsContext gr = canv.getGraphicsContext2D();
        trDec=new  Star(tree);
        trDec.operation(gr);
    }
    @FXML
    protected void addGir()
    {
        GraphicsContext gr = canv.getGraphicsContext2D();
        trDec=new Girlanda(tree);
        trDec.operation(gr);
    }
    @FXML
    protected void showAll()
    {
        GraphicsContext gr = canv.getGraphicsContext2D();
        trDec=new Girlanda(new Present(new Star(new Tree())));
        trDec.operation(gr);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        GraphicsContext gr = canv.getGraphicsContext2D();
        tree= new TreeDecorator(new Tree());
        tree.operation(gr);
    }
}