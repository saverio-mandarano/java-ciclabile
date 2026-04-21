package org.lessons.java.arrayiterator;

public class Main {
    public static void main(String[] args) {
        // int[] intList = { 1, 2, 3, 0 };

        // ArrayIterator obj2 = new ArrayIterator(intList);

        // while (obj2.hasNextInt()) {
        // System.out.println(obj2.getNextInt());
        // }

        // System.out.println("current index: " + obj2.getCurrentIndex());

        // BONUS
        ArrayIterator obj = new ArrayIterator();

        obj.addInt(1);
        obj.addInt();

        while (obj.hasNextInt()) {
            System.out.println(obj.getNextInt());
        }

        // while (obj.hasNextInt()) {
        // System.out.println(obj.getNextInt());
        // }

        // obj.addInt(10);

        // while (obj.hasNextInt()) {
        // System.out.println(obj.getNextInt());
        // }

    }

}
