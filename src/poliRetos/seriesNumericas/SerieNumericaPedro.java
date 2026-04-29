package poliRetos.seriesNumericas;

public class   SerieNumericaPedro {


        /**
     * Genera la serie S3: Fibonacci / Impares
     * @param n Cantidad de términos a generar
     */
    public void generarSerieNum(int n) {
        int a = 0; // Primer Fibonacci
        int b = 1; // Segundo Fibonacci
        int den = 1; // Primer denominador impar

        for (int i = 0; i < n; i++) {
            System.out.print(a + "/" + den + " ");

            // Lógica Fibonacci para el siguiente numerador
            int siguiente = a + b;
            a = b;
            b = siguiente;

            // Lógica para el siguiente denominador (impares)
            den += 2;
        }
        System.out.println(); // Salto de línea final
    }
}
