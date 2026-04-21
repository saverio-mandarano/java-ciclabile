package org.lessons.java.arrayiterator;

public class Main {
    public static void main(String[] args) {
        // System.out.println("ciao");
        int[] intList = { 1, 2, 3, 0 };

        ArrayIterator arr1 = new ArrayIterator(intList);
        // for (int i : intList) {
        // System.out.println(i);
        // }

        // while (arr1.hasNextInt()) {
        // System.out.println(arr1.getNextInt());
        // }

        System.out.println(arr1.getCurrentIndex());
        arr1.getNextInt();
        System.out.println(arr1.getCurrentIndex());

    }

}
