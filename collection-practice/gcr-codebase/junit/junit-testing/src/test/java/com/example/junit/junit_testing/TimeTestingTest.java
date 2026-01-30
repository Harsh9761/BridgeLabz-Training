package com.example.junit.junit_testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeTestingTest {
	TimeTesting service = new TimeTesting();

    @Test
    @Timeout(2)
    void testLongRunningTaskTimeout() throws InterruptedException {
        service.longRunningTask();
    }
}
