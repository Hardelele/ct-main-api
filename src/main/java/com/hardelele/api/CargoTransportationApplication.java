package com.hardelele.api;

import io.vertx.core.Vertx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CargoTransportationApplication {

    @Autowired
    private ServerVerticle serverVerticle;

    public static void main(String[] args) {
        SpringApplication.run(CargoTransportationApplication.class, args);
    }

    @PostConstruct
    public void deployVerticle() {
        final Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(serverVerticle);
    }
}