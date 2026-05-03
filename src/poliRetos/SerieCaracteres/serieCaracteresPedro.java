package poliRetos.SerieCaracteres;

public class serieCaracteresPedro {

    /**
     * Genera una serie de caracteres '+' donde la cantidad de signos 
     * en cada término corresponde a la secuencia de números primos.
     * @param cantidadTerminos Número de grupos de '+' a generar
     */
    public void generarSeriePrimos(int cantidadTerminos) {
        int terminosGenerados = 0;
        int numeroEvaluar = 2; // El primer número primo es 2

        while (terminosGenerados < cantidadTerminos) {
            if (esPrimo(numeroEvaluar)) {
                // Imprimir el carácter '+' la cantidad de veces que indique el número primo
                for (int i = 0; i < numeroEvaluar; i++) {
                    System.out.print("+");
                }
                System.out.print(" "); // Espacio entre términos
                
                terminosGenerados++;
            }
            numeroEvaluar++;
        }
        System.out.println(); // Salto de línea al finalizar
    }

    /**
     * Método auxiliar para verificar si un número es primo
     * @param numero El valor a verificar
     * @return true si es primo, false en caso contrario
     */
    private boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}