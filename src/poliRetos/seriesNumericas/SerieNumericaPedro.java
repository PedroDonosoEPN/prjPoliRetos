package poliRetos.seriesNumericas;

public class SerieNumericaPedro {

    /**
     * Genera la serie S3: Fibonacci / Impares
     * @param cantidadTerminos Cantidad de términos a generar
     */
    public void generarSerieNum(int cantidadTerminos) {
        int fibonacciActual = 0;
        int fibonacciSiguiente = 1;
        int denominadorImpar = 1;

        for (int i = 0; i < cantidadTerminos; i++) {
            // Imprime el término actual en formato fraccionario
            System.out.print(fibonacciActual + "/" + denominadorImpar + " ");

            // Lógica para calcular el siguiente número de la secuencia Fibonacci
            int sumaTemporal = fibonacciActual + fibonacciSiguiente;
            fibonacciActual = fibonacciSiguiente;
            fibonacciSiguiente = sumaTemporal;

            // Incremento para obtener el siguiente número impar en el denominador
            denominadorImpar += 2;
        }
        
        System.out.println(); // Salto de línea final
    }
}