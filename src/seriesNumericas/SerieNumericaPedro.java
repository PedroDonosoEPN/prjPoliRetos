package seriesNumericas;

public class SerieNumericaPedro {

    /**
     * Genera la serie S3 usando el ciclo For
     * @param cantidadTerminos Cantidad de términos a generar
     */
    public void generarSerieConFor(int cantidadTerminos) {
        int fibonacciActual = 0;
        int fibonacciSiguiente = 1;
        int denominadorImpar = 1;

        // //For
        for (int i = 0; i < cantidadTerminos; i++) {
            System.out.print(fibonacciActual + "/" + denominadorImpar + " ");

            int sigFibonacci = fibonacciActual + fibonacciSiguiente;
            fibonacciActual = fibonacciSiguiente;
            fibonacciSiguiente = sigFibonacci;

            denominadorImpar += 2;
        }
        System.out.println();
    }

    /**
     * Genera la serie S3 usando el ciclo While
     */
    public void generarSerieConWhile(int cantidadTerminos) {
        int fibonacciActual = 0;
        int fibonacciSiguiente = 1;
        int denominadorImpar = 1;
        int i = 0;

        // //While
        while (i < cantidadTerminos) {
            System.out.print(fibonacciActual + "/" + denominadorImpar + " ");

            int sigFibonacci = fibonacciActual + fibonacciSiguiente;
            fibonacciActual = fibonacciSiguiente;
            fibonacciSiguiente = sigFibonacci;

            denominadorImpar += 2;
            i++; 
        }
        System.out.println();
    }

    /**
     * Genera la serie S3 usando el ciclo Do-while
     */
    public void generarSerieConDoWhile(int cantidadTerminos) {
        if (cantidadTerminos <= 0) return;

        int fibonacciActual = 0;
        int fibonacciSiguiente = 1;
        int denominadorImpar = 1;
        int i = 0;

        // //Do while
        do {
            System.out.print(fibonacciActual + "/" + denominadorImpar + " ");

            int sigFibonacci = fibonacciActual + fibonacciSiguiente;
            fibonacciActual = fibonacciSiguiente;
            fibonacciSiguiente = sigFibonacci;

            denominadorImpar += 2;
            i++;
        } while (i < cantidadTerminos);
        
        System.out.println();
    }
}