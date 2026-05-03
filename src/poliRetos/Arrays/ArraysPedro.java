package poliRetos.Arrays;

public class ArraysPedro {

    /**
     * Grafica f(x) = 2x usando los caracteres de un nombre.
     * @param nombre El nombre cuyos caracteres se usarán en la gráfica.
     */
    public void graficarFuncionNombre(String nombre) {
        int longitudNombre = nombre.length();
        // El eje Y máximo será 2 * (longitud - 1) según f(x)=2x
        int alturaMaximaY = 2 * (longitudNombre - 1);

        System.out.println();

        // Dibujamos de arriba hacia abajo (eje Y)
        for (int y = alturaMaximaY; y >= 0; y--) {
            // Imprimir la etiqueta del eje Y
            System.out.print(y + " | ");

            // Recorremos el eje X
            for (int x = 0; x < longitudNombre; x++) {
                // Si el punto actual (x, y) cumple f(x) = 2x
                if (y == 2 * x) {
                    System.out.print(nombre.charAt(x));
                } else {
                    // Espacio en blanco si no hay punto
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

        // Dibujar el eje X
        System.out.print("  0 |_");
        for (int x = 0; x < longitudNombre; x++) {
            System.out.print("___");
        }
        System.out.println();
    }
}