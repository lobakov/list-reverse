package com.github.lobakov.listreverse;

import com.github.lobakov.listreverse.list.List;

public class ListReverseApp {

    public static void main(String... args) {
        Integer[] testData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = new List<>();
        for (Integer item: testData) {
            list.insertFirst(item);
        }
        System.out.println("Initial list: " + list.toString());
        list.listReverse();
        System.out.println("Reversed list: " + list.toString());
    }
}
