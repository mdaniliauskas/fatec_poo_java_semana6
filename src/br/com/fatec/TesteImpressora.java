package br.com.fatec;

public class TesteImpressora {

    public static void main(String[] args) {
        float a = 7;
        float b = 36;
        String c = "Olá Mundo "    ;
        String d = " da Programação";
        String e = " em Java";
        int f = 68;
        int g = 19;

        Impressora imprime = new Impressora();

        imprime.exibir(a);
        imprime.exibir(a, b);
        imprime.exibir(b, c);
        imprime.exibir(e, a);
        imprime.exibir(c, d, e);
        imprime.exibir(f, g, c);
    }
}
