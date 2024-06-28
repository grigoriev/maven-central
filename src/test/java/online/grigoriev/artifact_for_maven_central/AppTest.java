package online.grigoriev.artifact_for_maven_central;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getGreeting() {
        assertEquals("Hello, world!", App.getGreeting());
    }

}