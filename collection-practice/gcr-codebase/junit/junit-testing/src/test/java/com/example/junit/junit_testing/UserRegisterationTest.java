package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UserRegisterationTest {
	UserRegisteration user = new UserRegisteration();

    @Test
    void validUser() {
        assertDoesNotThrow(() ->
            user.registerUser("harsh", "harsh@mail.com", "pass123")
        );
    }

    @Test
    void invalidUser() {
        assertThrows(IllegalArgumentException.class, () ->
            user.registerUser("", "harshmail.com", "123")
        );
    }
}
