package org.davidh;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddingServiceTest {

    private final AddingService service = new AddingService();

    @Test
    public void addingNumbersAddsNumbers() {
        assertEquals(5, service.addNumbers(2,3));
        assertEquals(7, service.addNumbers(4,3));
    }

    @Test
    public void addingNegativeNumbersWorks() {
        assertEquals(3, service.addNumbers(5,-2));
        assertEquals(-9, service.addNumbers(-3,-6));
    }

}
