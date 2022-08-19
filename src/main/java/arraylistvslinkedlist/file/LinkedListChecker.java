package main.java.arraylistvslinkedlist.file;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListChecker {

    public LinkedList<Integer> createListWithSize(int n) {
        LinkedList<Integer> list1 = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list1.add(random.nextInt(1000));
        }
        return list1;
    }

    private void removeElementByIndex(LinkedList<Integer> list, int index) {
        list.remove(index);
    }

    public void checkRemoving(int size, int index) {
        final LinkedList<Integer> list = createListWithSize(size);
        long startTime1 = System.currentTimeMillis();
        removeElementByIndex(list, index);
        long endTime1 = System.currentTimeMillis();
        System.out.println("The LinkedList, size: " + size + "; Time: " + (endTime1 - startTime1) + "ms");
    }
}


