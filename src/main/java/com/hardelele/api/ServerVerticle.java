package com.hardelele.api;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;
import org.springframework.stereotype.Component;

@Component
public class ServerVerticle extends AbstractVerticle {

    Logger log = LoggerFactory.getLogger(ServerVerticle.class);

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);
        vertx.createHttpServer().requestHandler(router).listen(8081);
        log.info("Successfully deployed ServerVerticle!");
    }
}