package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListManagerTest {
	ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 5);
        assertTrue(list.contains(5), "List should contain the added element");
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        manager.removeElement(list, 10);
        assertFalse(list.contains(10), "List should not contain the removed element");
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 1);
        manager.addElement(list, 2);
        assertEquals(2, manager.getSize(list), "Size should reflect number of elements in list");
    }
}
