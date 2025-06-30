package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert that 2 + 3 equals 5
        assertEquals(5, 2 + 3);

        // Assert true condition
        assertTrue(10 > 1);

        // Assert false condition
        assertFalse(2 > 10);

        // Assert null value
        assertNull(null);

        // Assert not null
        assertNotNull("Hello");
    }
}
