package org.lessons.java.arrayiterator;

public class ArrayIterator {
    private int[] intList;
    private int currentIndex;

    public int getCurrentIndex() {
        return currentIndex;
    }

    public ArrayIterator(int[] intList) {
        this.intList = intList;
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
}
