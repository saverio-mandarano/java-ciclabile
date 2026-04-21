package org.lessons.java.arrayiterator;

import java.util.Random;

public class ArrayIterator {
    private int[] intList;
    private int currentIndex;

    public int getCurrentIndex() {
        return currentIndex;
    }

    public ArrayIterator(int[] intList) {
        this.intList = intList;
    }

    public ArrayIterator() {
        this.intList = new int[0];
    }

    public boolean hasNextInt() {
        return currentIndex < intList.length;
    }

    public int getNextInt() {
        if (hasNextInt()) {
            currentIndex++;
            return intList[currentIndex - 1];
        } else {
            throw new IllegalStateException("Error, non c'è NextInt");
        }

    }

    public void addInt(int newElement) {
        int[] newArr = new int[this.intList.length + 1];

        for (int i = 0; i < intList.length; i++) {
            newArr[i] = this.intList[i];
        }

        newArr[newArr.length - 1] = newElement;

        this.intList = newArr;
    }

    public void addInt() {
        int[] newArr = new int[this.intList.length + 1];

        for (int i = 0; i < intList.length; i++) {
            newArr[i] = this.intList[i];
        }

        Random num = new Random();
        newArr[newArr.length - 1] = num.nextInt(100);
        this.intList = newArr;

    }
}
