package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

public class FileProcessorTest {
	FileProcessor fp = new FileProcessor();
    String file = "test.txt";

    @Test
    void testWriteAndRead() throws IOException {
        fp.writeToFile(file, "Hello");
        assertEquals("Hello", fp.readFromFile(file));
    }

    @Test
    void testFileExists() throws IOException {
        fp.writeToFile(file, "Data");
        assertTrue(Files.exists(Path.of(file)));
    }

    @Test
    void testFileNotFound() {
        assertThrows(IOException.class, () -> fp.readFromFile("no.txt"));
    }
}
