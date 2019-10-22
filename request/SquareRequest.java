package request;

import service.DrawShape;

/**
 * Create a class to create request.
 * 
 * @author crraksh
 */
public class SquareRequest implements Request {

    private DrawShape drawShape;

    public SquareRequest(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    @Override
    public void makeRequest() {
        drawShape.draw();
    }
}