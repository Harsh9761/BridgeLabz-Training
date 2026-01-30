package com.example.junit.junit_testing;

public class UserRegisteration {
	public void registerUser(String username, String email, String password) {
        if (username.isEmpty() || !email.contains("@") || password.length() < 6) {
            throw new IllegalArgumentException();
        }
    }
}
