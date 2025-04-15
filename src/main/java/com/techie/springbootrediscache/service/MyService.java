package com.techie.springbootrediscache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Cacheable("myCache")

    public String getData(String input) {
        System.out.println("Storing in cache: " + input);
        simulateSlowService();
        return "Processed: " + input;
    }




    private void simulateSlowService() {
        try {
            Thread.sleep(3000); // Simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
