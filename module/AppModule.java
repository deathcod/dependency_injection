package module;

import com.google.inject.AbstractModule;

import annotations.ColorValue;
import annotations.EdgeValue;
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

        bind(DrawShape.class).to(DrawSquare.class);
        bind(Request.class).to(SquareRequest.class);
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
    }
}