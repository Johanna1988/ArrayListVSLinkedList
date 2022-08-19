package main.java.arraylistvslinkedlist.file;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListChecker {

    public ArrayList<Integer> createArrayListWithSize(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(1000));
        }
        return list;
    }

    private void removeElementByIndex(ArrayList<Integer> list, int index) {
        list.remove(index);
    }

    public void checkRemoving(int size, int index) {
        final ArrayList<Integer> list = createArrayListWithSize(size);
        long startTime1 = System.currentTimeMillis();
        removeElementByIndex(list, index);
        long endTime1 = System.currentTimeMillis();
        System.out.println("The ArrayList, size: " + size + "; Time: " + (endTime1 - startTime1) + "ms");
    }

}


