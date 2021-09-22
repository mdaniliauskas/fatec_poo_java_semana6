package br.com.fatec;

import java.lang.Math;

public class CalculadoraCientifica {

    public static double raiz(int a) {
        return Math.sqrt(a);
    }

    public static double raiz(double a) {
        return Math.sqrt(a);
    }

    public static double raiz(String a) {
        return Math.sqrt(Double.parseDouble(a));
    }

    public static double potencia(byte a, byte b) {
        return (Math.pow(a, b));
    }

    public static double potencia(String s1, String s2) {
        return (Math.pow(Double.parseDouble(s1), Double.parseDouble(s2)));
    }

    public static double potencia(int a, double b) {
        return Math.pow(a, b);
    }
}
