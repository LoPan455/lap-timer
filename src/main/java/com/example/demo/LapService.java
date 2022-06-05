package com.example.demo;

import io.opentelemetry.extension.annotations.WithSpan;
import org.springframework.stereotype.Service;

@Service
public class LapService {

    @WithSpan
    public String timeMyLap(Long startTime) {
        Long endTime = System.nanoTime();
        return "Your lap took " + (endTime - startTime) + " nanos";
    }
}
