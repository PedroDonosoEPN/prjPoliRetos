package poliRetos.Recursion;

public class RecursionPedro {

    /**
     * Obtiene el producto de dos números de forma recursiva mediante sumas sucesivas.
     * @param multiplicando El número que se va a sumar (a).
     * @param multiplicador La cantidad de veces que se suma (b).
     * @return El resultado de la multiplicación.
     */
    public int obtenerMultiplicacion(int multiplicando, int multiplicador) {
        // Caso base: cualquier número multiplicado por 0 es 0
        if (multiplicador == 0) {
            return 0;
        }

        // Caso base: cualquier número multiplicado por 1 es el mismo número
        if (multiplicador == 1) {
            return multiplicando;
        }

        // Llamada recursiva: sumar el multiplicando y reducir el multiplicador
        return multiplicando + obtenerMultiplicacion(multiplicando, multiplicador - 1);
    }
}