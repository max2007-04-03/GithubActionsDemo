package com.example.demo;

import org.junit.jupiter.api.Test;
import ua.opnu.MathService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathServiceTest {
    @Test
    void testMultiply() {
        MathService service = new MathService();
        assertEquals(10, service.multiply(2, 5), "2 * 5 should be 10");
    }
}