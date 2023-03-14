package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Calculator {
    public void calculatorWithRollback() throws IOException{
        Stack<Double> actionList = new Stack();
        double value = 0;
        String second = ""; String sign = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число: ");
        value = Double.parseDouble(reader.readLine());
        System.out.println("Введите знак: ");
        sign = reader.readLine();
        System.out.println("Введите число: ");
        second = reader.readLine();

        getResult(actionList, value, sign, second);
        System.out.println(actionList);

        while (!actionList.isEmpty()) {
            value = actionList.peek();
            System.out.println("Введите знак: ");
            sign = reader.readLine();
            if (sign.equals("cancel")){
                actionList.pop();
                if (!actionList.isEmpty()) System.out.println(actionList.peek());
                else break;
            }else {
                System.out.println("Введите число: ");
                second = reader.readLine();
                getResult(actionList, value, sign, second);
                System.out.println(actionList);
            }
        }
        System.out.println("Результаты вычислений закончились");
    }

    private void getResult(Stack actionList, double value, String sign, String second) {
        double result;
        switch (sign) {
            case "+":
                result = value + Double.parseDouble(second);
                actionList.push(result);
                System.out.println(result);
                break;
            case "-":
                result = value - Double.parseDouble(second);
                actionList.push(result);
                System.out.println(result);
                break;
            case "*":
                result = value * Double.parseDouble(second);
                actionList.push(result);
                System.out.println(result);
                break;
            case "/":
                result = value / Double.parseDouble(second);
                actionList.push(result);
                System.out.println(result);
                break;
        }
    }
}
