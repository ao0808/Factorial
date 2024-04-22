package ru.sbrf.serviceFactorial.controller;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.serviceFactorial.model.FactorialRequest;
import ru.sbrf.serviceFactorial.model.FactorialResponse;
import ru.sbrf.serviceFactorial.service.CalculateFactorialWithMetrics;

import javax.validation.Valid;

@RestController
public class Controller {
    @Autowired
    CalculateFactorialWithMetrics calcFactorial;

    @PostMapping("/factorial")
    public ResponseEntity<FactorialResponse> calculateFactorial(@NonNull @Valid @RequestBody FactorialRequest request) {
        double result = calcFactorial.calculate(request.getFactorialNum());
        return ResponseEntity.ok(FactorialResponse.builder().result(result).build());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}