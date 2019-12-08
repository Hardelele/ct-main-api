package com.hardelele.api;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;
import org.springframework.stereotype.Component;

@Component
public class ServerVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);

        router.route().handler(StaticHandler.create());

        vertx.createHttpServer().requestHandler(router).listen(8081);
    }
}