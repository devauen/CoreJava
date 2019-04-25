package com.proartz.Chapter2.Exercise17;

public class Queue {

    public static class Node {

        private Node nextNode;
        private char value;

        public Node(char value) {
            this.value = value;
            nextNode = null;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getNextNode() {
            return nextNode;
        }

        @Override
        public String toString() {
            return "" + value;
        }
    }

    public class Iterator {

        Node nextNode;

        public Iterator(Node nextNode) {
            this.nextNode = nextNode;
        }

        public boolean hasNext() {
            return nextNode != null;
        }

        public Node next() {
            Node temp = nextNode;
            nextNode = nextNode.nextNode;
            return temp;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void add(Node node) {
        if(head == null) {
            head = node;
        } else {
            tail.setNextNode(node);
        }
        tail = node;
    }

    public void remove(){
        if(head != null) {
            head = head.getNextNode();
        }
    }

    public Iterator iterator() {
        return new Iterator(head);
    }
}
