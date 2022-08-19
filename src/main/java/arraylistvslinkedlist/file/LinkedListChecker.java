package main.java.arraylistvslinkedlist.file;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListChecker {

    LinkedList<Integer> list1 = new LinkedList<>();


    public LinkedList<Integer> randomLinkedList(int n) {

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list1.add(random.nextInt(1000));
        }
        return list1;
    }

    public LinkedList<Integer> removeTheFirstElement() {
        list1.removeFirst();
        return list1;
    }

    public LinkedList<Integer> removeMiddleElement() {
        int middleElement = list1.size() / 2;
        list1.remove(middleElement);
        return list1;
    }

    public LinkedList<Integer> removeTheLastElement() {
        list1.removeLast();
        return list1;
    }
}


