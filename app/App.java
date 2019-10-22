package app;

import request.Request;
import request.SquareRequest;
import service.DrawShape;
import service.DrawSquare;

public class App {
    public static void main(String[] args) throws Exception {
        DrawShape drawShape = new DrawSquare();
        Request request = new SquareRequest(drawShape);

        request.makeRequest();
    }
}