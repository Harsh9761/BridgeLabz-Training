package com.example.junit.junit_testing;

public class TimeTesting {
	public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Done";
    }
}
