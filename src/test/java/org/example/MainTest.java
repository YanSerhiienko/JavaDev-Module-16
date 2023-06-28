package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        String expected = "Testing pull requests here";
        Assertions.assertEquals(expected, Main.test());
    }
}