package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;

public class Application {

    public static double parse(String rpnString) {

        if (rpnString == null || rpnString.isEmpty())
            throw new RPNParserException();

        Deque<Double> list = new LinkedList<>();
        Double a, b;
        String[] strings = rpnString.trim().split(" ");

        for (String string : strings) {

            try {
                list.push(Double.parseDouble(string));
            } catch (NumberFormatException e) {

                if (list.size() < 2)
                    throw new RPNParserException();

                a = list.pop();
                b = list.pop();

                switch (string) {
                    case "+": list.push(b + a); break;
                    case "-": list.push(b - a); break;
                    case "*": list.push(b * a); break;
                    case "/":
                        if (a != 0) {
                            list.push(b / a);
                            break;
                        } else {
                            throw new ArithmeticException();
                        }
                    default:
                        throw new RPNParserException();
                }
            }
        }

        if (list.size() > 1)
            throw new RPNParserException();
        return list.pop();
    }

    public static void main(String[] args) {
        System.out.println(parse(" 10 20 + 30 40 + *"));
    }
}