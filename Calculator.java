package com.src;

public class Calculator {


    public int addition(int a, int b) throws Exception {
        long d = (long) a + (long) b;
        if (d > Integer.MAX_VALUE || d < Integer.MIN_VALUE)
            throw new ArithmeticException("OverflowException");
        return (int) d;
    }

    public float addition(float a, float b) {
        double d = (double) a + (double) b;
        if (d > Double.MAX_VALUE || d < Double.MIN_VALUE)
            throw new ArithmeticException("OverflowException");
        return (float) d;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public double addition(String a, String b) {
        try {
            double ia = Double.parseDouble(a);
            double ib = Double.parseDouble(b);
            return ia + ib;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("OOps!! Not a number!!");
        }
    }

    public int subtraction(int a, int b) {
        long d = (long) a - (long) b;
        if (d > Integer.MAX_VALUE || d < Integer.MIN_VALUE)
            throw new ArithmeticException("OverflowException");
        return (int) d;
    }

    public float subtraction(float a, float b) {
        double d = (double) a - (double) b;
        if (d > Double.MAX_VALUE || d < Double.MIN_VALUE)
            throw new ArithmeticException("OverflowException");
        return (float) d;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double subtraction(String a, String b) {
        try {
            double ia = Double.parseDouble(a);
            double ib = Double.parseDouble(b);
            return ia - ib;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a number!!!");
        }
    }

    public int multiplication(int a, int b) {
        long d = (long) a * (long) b;
        if (d > Integer.MAX_VALUE || d < Integer.MIN_VALUE)
            throw new ArithmeticException("OverflowException");
        return (int) d;
    }

    public float multiplication(float a, float b) {
        double d = (double) a * (double) b;
        if (d > Double.MAX_VALUE || d < Double.MIN_VALUE)
            throw new ArithmeticException("OverflowException");
        return (float) d;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double multiplication(String a, String b) {
        try {
            double ia = Double.parseDouble(a);
            double ib = Double.parseDouble(b);
            return ia * ib;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a number!!!");
        }
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide a number by zero!!");
        } else {
            return a / b;
        }
    }

    public float division(float a, float b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Cannot divide a number by zero!!");
        } else {
            return a / b;
        }
    }

    public double division(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Cannot divide a number by zero!!");
        } else {
            return a / b;
        }
    }

    public double division(String a, String b) {
        try {
            double ia = Double.parseDouble(a);
            double ib = Double.parseDouble(b);
            if (ib == 0)
                throw new IllegalArgumentException("Denominator cannot be zero!!");
            else {
                return ia / ib;
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a number!!!");
        }
    }

    public float square(float a) {
        double d = (double) a * (double) a;
        if (d > Double.MAX_VALUE || d < Double.MIN_VALUE)
            throw new ArithmeticException("OverflowException");
        return (float) d;
    }

    public double square(double a) {
        return a * a;
    }

    public double square(String a) {
        try {
            double ia = Double.parseDouble(a);
            return ia * ia;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a number!!!");
        }
    }

    public int square(int a) throws Exception {
        long d = (long) a * (long) a;
        if (d > Integer.MAX_VALUE)
            throw new ArithmeticException("OverflowException");
        return (int) d;
    }


}
