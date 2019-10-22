package module;

import com.google.inject.AbstractModule;

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
    }
}