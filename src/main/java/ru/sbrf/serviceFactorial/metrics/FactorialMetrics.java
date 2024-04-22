package ru.sbrf.serviceFactorial.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class FactorialMetrics {
    private final MeterRegistry meterRegistry;
    private final Timer factorialTimer;

    @Autowired
    public FactorialMetrics(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        this.factorialTimer = Timer.builder("factorial.calculation.time")
                .description("Time taken to calculate factorial")
                .register(meterRegistry);
    }

    public void incrementFactorialCalls() {
        meterRegistry.counter("factorial.calls", "status", "success").increment();
    }

    public void recordFactorialTime(long duration) {
        factorialTimer.record(duration, TimeUnit.MILLISECONDS);
    }
}
