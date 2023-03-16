package com.company;

import java.io.IOException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        // Калькулятор
        Calculator model1 = new Calculator();
        model1.calculatorWithRollback();

        // 1.
        MyList create = new MyList();
        MyList getRewerse = new MyList();
        LinkedList list = create.newList();

        getRewerse.getInvertedList(list);

    }
}
