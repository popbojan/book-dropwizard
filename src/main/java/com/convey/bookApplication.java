package com.convey;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class bookApplication extends Application<bookConfiguration> {

    public static void main(final String[] args) throws Exception {
        new bookApplication().run(args);
    }

    @Override
    public String getName() {
        return "book";
    }

    @Override
    public void initialize(final Bootstrap<bookConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final bookConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
