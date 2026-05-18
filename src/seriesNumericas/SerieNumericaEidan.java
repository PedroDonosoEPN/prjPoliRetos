package seriesNumericas;
  public class SerieNumericaEidan {

   //Generar S7: 1 4 7 10 13 16 19 22 25 ...
    static int n = 9; //Cantidad de elementos a generar en la serie.

    // Algoritmo 1 - FOR
    public void serieFor() {

        String cadena = "";
        int valor = 1;

        for (int i = 0; i < n; i++) {

            cadena += valor;

            if (i < n - 1) {
                cadena += ", ";
            }

            valor += 3;
        }

        System.out.println(cadena);
    }

    // Algoritmo 2 - WHILE
    public void serieWhile() {

        String cadena = "";
        int valor = 1;
        int i = 0;

        while (i < n) {

            cadena += valor;

            if (i < n - 1) {
                cadena += ", ";
            }

            valor += 3;
            i++;
        }

        System.out.println(cadena);
    }

    // Algoritmo 3 - DO WHILE
    public void serieDoWhile() {

        String cadena = "";
        int valor = 1;
        int i = 0;

        do {

            cadena += valor;

            if (i < n - 1) {
                cadena += ", ";
            }

            valor += 3;
            i++;

        } while (i < n);

        System.out.println(cadena);
    }
}
