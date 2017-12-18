package com.tasks6.rle_decoder;

public class Application {
    public static void main(String[] args) {

        if (args == null || args[0].equals("")){
            System.out.println("");
            return;
        }

        if (Character.isDigit(args[0].charAt(0))) {
            System.out.println("");
            return;
        }

        char[] charArray = args[0].toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            if (Character.isDigit(charArray[i]) && Character.isDigit(charArray[i + 1])){
                System.out.println("");
                return;
            }
            if (charArray[i] == charArray[i + 1]){
                System.out.println("");
                return;
            }
        }

        StringBuilder sb = new StringBuilder();

        char lastseen = 0;

        for (char s : charArray) {
            if (!Character.isDigit(s)) {
                lastseen = s;
                sb.append(s);
            } else {
                int n = Integer.parseInt(String.valueOf(s));
                for (int i = 0; i < n - 1; i++) {
                    sb.append(lastseen);
                }
            }
        }

        System.out.println(sb.toString());
    }
}