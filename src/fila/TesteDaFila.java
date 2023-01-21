package fila;

public class TesteDaFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("manoel");
        System.out.println(fila);

        fila.adiciona("guilherme");
        System.out.println(fila);

        String x1 = fila.remove();
        System.out.println(fila);
    }
}
