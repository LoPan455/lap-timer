package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class LapService {

    public String timeMyLap(Long startTime) {
        Long endTime = System.nanoTime();
        return "Your lap took " + (endTime - startTime) + " nanos";
    }
}
