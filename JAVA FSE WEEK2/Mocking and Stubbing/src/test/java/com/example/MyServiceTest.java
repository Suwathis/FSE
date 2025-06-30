package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange: Create mock and stub method
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act: Use mock in service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert: Verify result
        assertEquals("Mock Data", result);
    }
}
