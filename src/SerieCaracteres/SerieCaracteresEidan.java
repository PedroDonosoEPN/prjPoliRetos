package SerieCaracteres;

public class SerieCaracteresEidan {
    //Generar S7: aa bbbb cccccc dddddddd ...
    int n = 5; //Cantidad de elementos a generar en la serie.

    // Algoritmo usando FOR
    public void cadenasFor() {

        char letra = 'a';
        int cantidad = 2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= cantidad; j++) {
                System.out.print(letra);
            }

            System.out.print(" ");

            letra++;
            cantidad += 2;
        }

        System.out.println();
    }

    // Algoritmo usando WHILE
    public void cadenasWhile() {

        char letra = 'a';
        int cantidad = 2;
        int i = 1;

        while (i <= n) {

            int j = 1;

            while (j <= cantidad) {
                System.out.print(letra);
                j++;
            }

            System.out.print(" ");

            letra++;
            cantidad += 2;
            i++;
        }

        System.out.println();
    }

    // Algoritmo usando DO WHILE
    public void cadenasDoWhile() {

        char letra = 'a';
        int cantidad = 2;
        int i = 1;

        do {

            int j = 1;

            do {
                System.out.print(letra);
                j++;
            } while (j <= cantidad);

            System.out.print(" ");

            letra++;
            cantidad += 2;
            i++;

        } while (i <= n);

        System.out.println();
    }
}