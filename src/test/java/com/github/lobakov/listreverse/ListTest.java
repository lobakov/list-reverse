package com.github.lobakov.listreverse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.github.lobakov.listreverse.list.List;

public class ListTest {

    @Test
    void shouldProperlyReverseLinkedListWhenRequested() {
        List<Integer> given = new List<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        String expected = "1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10";
        given.listReverse();
        String actual = given.toString();

        assertEquals(expected, actual);
    }
}
