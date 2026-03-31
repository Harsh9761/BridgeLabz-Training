package com.example.junit.junit_testing;

public class passwordValidator {
	public boolean isValid(String password) {
		if(password.length()<8) return false;
		if(!password.matches(".*[A-Z].*")) return false;
		if(!password.matches(".*[0-9].*")) return false;
		return true;
	}
}
