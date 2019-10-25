package service;

import com.google.inject.Inject;

import annotations.ColorValue;
import annotations.EdgeValue;

/**
 * Draw square is an implementation to draw square shape.
 * 
 * @author crraksh
 */
public class DrawSquare implements DrawShape {

    private final String color;
    private final Integer edge;
    private final String SQUARE_VALUE = "Draw square!!, with edge: %s with color: %s";

    @Inject
    public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    @Inject
    public DrawSquare(@ColorValue String color) {
        this.color = color;
        this.edge = 50;
    }

    @Override
    public void draw() {
        System.out.println(String.format(SQUARE_VALUE, edge, color));
    }

}