package ru.sbrf.serviceFactorialTest;

import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.MediaType;


public class TestForMetrics extends Assert {
    private static final String API_ROOT = "http://localhost:8080/factorial";

    @Ignore
    @Test
    public void ferstTest() {
        io.restassured.response.Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body("{\"factorialNum\": 120}")
                .post(API_ROOT);
        response.prettyPrint();
    }

    @Ignore
    @Test
    public void negativTest() {
        io.restassured.response.Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body("{\"factorialNum\": -1}")
                .post(API_ROOT);
        response.prettyPrint();
    }

    @Ignore
    @Test
    public void xxxTest() {
        io.restassured.response.Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body("{\"factorialNum\": xxx}")
                .post(API_ROOT);
        response.prettyPrint();
    }

    @Ignore
    @Test
    public void zeroTest() {
        io.restassured.response.Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body("{\"factorialNum\": 5}")
                .post(API_ROOT);
        response.prettyPrint();
    }

    @Ignore
    @Test
    public void positivTest() {
        io.restassured.response.Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body("{\"factorialNum\": 80}")
                .post(API_ROOT);
        response.prettyPrint();
    }
}
