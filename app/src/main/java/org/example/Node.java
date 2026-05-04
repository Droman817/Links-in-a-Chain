package org.example;

public class Node {

    private Link data;
    private Node next;

    public Node(Link data) {
        this.data = data;
        this.next = null;
    }

    public void attach(Node next) {
        this.next = next;
    }

    public Node next() {
        return next;
    }

    public Link getData() {
        return data;
    }

    public void traverse() {
        Node current = this;

        while (current != null) {
            System.out.println(current.getData().getMaterial());
            current = current.next();
        }
    }
}