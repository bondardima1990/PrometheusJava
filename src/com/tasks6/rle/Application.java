package com.tasks6.rle;

public class Application {
    public static void main(String[] args) {

        if (args == null || args[0].isEmpty()){
            System.out.println("");
        } else {

            char currentChar = args[0].charAt(0);
            int count = 1;
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= args[0].length(); i++) {

                char c = i < args[0].length() ? args[0].charAt(i) : 0;

                if (currentChar != c | count == 9) {
                    sb.append(currentChar);
                    if (count > 1) {
                        sb.append(count);
                    }
                    count = 1;
                    currentChar = c;
                } else
                    count++;
            }

            System.out.println(sb.toString());
        }
    }
}