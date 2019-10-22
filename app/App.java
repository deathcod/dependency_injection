package app;

import com.google.inject.Guice;
import com.google.inject.Injector;

import module.AppModule;
import request.Request;

public class App {
    public static void main(String[] args) throws Exception {

        // Create an guice injector
        Injector appInjector = Guice.createInjector(new AppModule());

        // get instance of request
        Request request = appInjector.getInstance(Request.class);

        request.makeRequest();
    }
}