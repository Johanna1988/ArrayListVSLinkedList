package main.java.arraylistvslinkedlist.file;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListChecker {

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> randomArrayList(int n) {

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(1000));
        }
        return list;
    }

    public ArrayList<Integer> removeTheFirstElement() {
        list.remove(0);
        return list;
    }

    public ArrayList<Integer> removeMiddleElement() {
        int middleElement = list.size() / 2;
        list.remove(middleElement);
        return list;
    }

    public ArrayList<Integer> removeTheLastElement() {
        int indexOfLastElement = list.size() - 1;
        list.remove(indexOfLastElement);
        return list;
    }

}


