package module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

import annotations.ColorValue;
import annotations.EdgeValue;
import annotations.Square;
import constants.Shape;
import provides.ShapeProvider;
import request.Request;
import request.SquareRequest;
import service.DrawShape;
import service.DrawSquare;

/**
 * AppModule to initiantiate the dependency
 *
 * @author crraksh
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();

        //bind(DrawShape.class).to(DrawSquare.class);
        bind(Request.class)
            .to(SquareRequest.class);
        bind(Shape.class)
            .annotatedWith(Square.class)
            .toInstance(Shape.SQUARE);
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(DrawShape.class)
            .annotatedWith(Square.class)
            .toProvider(ShapeProvider.class);
    }

    /**
     * When a type is defined, and we require code to create object
     * we create it using provide. This is the same implementation as
     * opposed to bind module.
     * 
     * bind(DrawShape.class).to(DrawSquare.class)
     * @return DrawShape
     */
    // @Provides
    // @Singleton
    // DrawShape getDrawShape() {
    //     return new DrawSquare("Blue", 40);
    // }
}