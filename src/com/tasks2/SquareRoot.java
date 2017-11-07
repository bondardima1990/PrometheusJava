package com.tasks2;

public class SquareRoot {
    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double d = 0;
        double x1 = 0.0;
        double x2 = 0.0;

        if(a != 0)
            d = Math.sqrt(b * b - 4 * a * c);

        if(d > 0){
            x1 = (-b + d)/(2 * a);
            x2 = (-b - d)/(2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }

        if(d == 0){
            x1 = x2 = -b/(2 * a);
            if (Double.isNaN(x1))
                System.out.println("x1=");
            else if (Double.isInfinite(x1))
                System.out.println("x1=0.0");
            else System.out.println("x1=" + x1);

            if (Double.isNaN(x2))
                System.out.println("x2=");
            else if (Double.isInfinite(x2))
                System.out.println("x2=0.0");
            else System.out.println("x2=" + x2);
        }

        if(d < 0){
            System.out.println("x1=");
            System.out.println("x2=");
        }
    }
}