package request;

import com.google.inject.Inject;

import annotations.Square;
import service.DrawShape;

/**
 * Create a class to create request.
 * 
 * @author crraksh
 */
public class SquareRequest implements Request {

    private DrawShape drawShape;

    @Inject
    public SquareRequest(@Square DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    @Override
    public void makeRequest() {
        drawShape.draw();
    }
}