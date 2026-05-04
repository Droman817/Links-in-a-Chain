package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    @Test
    void testAttachAndNext() {
        Node first = new Node(new Link("Gold"));
        Node second = new Node(new Link("Silver"));

        first.attach(second);

        assertEquals("Silver", first.next().getData().getMaterial());
    }

    @Test
    void testTraverseChain() {
        Node first = new Node(new Link("Gold"));
        Node second = new Node(new Link("Silver"));
        Node third = new Node(new Link("Bronze"));

        first.attach(second);
        second.attach(third);

        assertEquals("Silver", first.next().getData().getMaterial());
        assertEquals("Bronze", first.next().next().getData().getMaterial());
    }

    @Test
    void testEndNodePointsToNull() {
        Node first = new Node(new Link("Gold"));

        assertNull(first.next());
    }
}