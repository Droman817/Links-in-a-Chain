package org.example;

public class App {

    public static void main(String[] args) {

        Link gold = new Link("Gold");
        Link silver = new Link("Silver");
        Link bronze = new Link("Bronze");

        Node nodeOne = new Node(gold);
        Node nodeTwo = new Node(silver);
        Node nodeThree = new Node(bronze);

        nodeOne.attach(nodeTwo);
        nodeTwo.attach(nodeThree);

        nodeOne.traverse();
    }
}