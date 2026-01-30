package com.example.junit.junit_testing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormat {
	public String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return date.format(formatter);
        } catch (DateTimeParseException e) {
            return "Invalid date";
        }
    }
}
