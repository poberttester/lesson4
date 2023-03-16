package com.company;

import java.util.LinkedList;
import java.util.List;

// 1. Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.
public class MyList {
    public List getInvertedList(LinkedList list){

        LinkedList revLinkedList = new LinkedList();
        for (int i = list.size() - 1; i >= 0; i--) {
            revLinkedList.add(list.get(i));
        }
        return revLinkedList;
    }

    public LinkedList newList(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i <=10; i++) {
            list.add(i);
        }
        return list;
    }
}
