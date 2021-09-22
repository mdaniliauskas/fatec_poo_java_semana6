package br.com.fatec;

public class TesteCalculadoraCientifica {

    public static void main(String[] args) {

        int a = 2;
        double b = 2.5;
        String c = "25";
        int d = 5;
        double e = 10;
        byte f = 2;
        byte g = 2;
        String h = "5";

        CalculadoraCientifica calcula = new CalculadoraCientifica();

        System.out.println(calcula.raiz(a));
        System.out.println(calcula.raiz(b));
        System.out.println(calcula.raiz(c));

        System.out.println(calcula.potencia(f, g));
        System.out.println(calcula.potencia(c, h));
        System.out.println(calcula.potencia(d, e));
    }
}
