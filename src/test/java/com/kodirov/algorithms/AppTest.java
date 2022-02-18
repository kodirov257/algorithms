package com.kodirov.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testHelloWorld() {
        String message = "Hello world!";
        App app = new App();

        assertEquals(message, app.getGreeting());
    }
}
