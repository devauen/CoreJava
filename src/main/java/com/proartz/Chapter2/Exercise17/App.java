package com.proartz.Chapter2.Exercise17;

public class App {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.add(new Queue.Node('d'));
        queue.add(new Queue.Node('o'));
        queue.add(new Queue.Node('d'));
        queue.add(new Queue.Node('a'));

        Queue.Iterator iterator = queue.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
        queue.remove();

        iterator = queue.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }

        System.out.println();

    }
}
