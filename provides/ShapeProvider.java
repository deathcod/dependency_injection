package provides;

import com.google.inject.Inject;
import com.google.inject.Provider;

import annotations.Square;
import constants.Shape;
import service.DrawShape;
import service.DrawSquare;

public class ShapeProvider implements Provider<DrawShape> {

    private final Shape shape;

    @Inject
    public ShapeProvider(@Square Shape shape) {
        this.shape = shape;
    }

    @Override
    public DrawShape get() {

        DrawShape drawShape = null;
        switch (shape) {
            case SQUARE:
                drawShape = new DrawSquare("Pink", 40); // Bad code
            default:
                break;
        }

        return drawShape;
    }

}