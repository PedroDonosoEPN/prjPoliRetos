package poliRetos.Figuras;

public class FigurasPedro {

    /**
     * Genera la figura F3: Un triángulo rectángulo de asteriscos.
     * @param niveles Cantidad de filas que tendrá la figura.
     */
    public void generarFiguraF3(int niveles) {
        // El primer ciclo controla las filas (eje vertical)
        for (int filaActual = 1; filaActual <= niveles; filaActual++) {
            
            // El segundo ciclo imprime los asteriscos según el número de la fila
            for (int asteriscoIndividual = 1; asteriscoIndividual <= filaActual; asteriscoIndividual++) {
                System.out.print("* ");
            }
            
            // Salto de línea para pasar a la siguiente grada del triángulo
            System.out.println();
        }
    }
}