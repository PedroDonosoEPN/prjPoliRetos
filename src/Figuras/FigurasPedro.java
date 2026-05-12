package Figuras;

public class FigurasPedro {

    /**
     * Genera la figura F3 usando estructura For
     * @param niveles Cantidad de filas que tendrá la figura.
     */
    public void generarFiguraF3For(int niveles) {
        // //For
        for (int filaActual = 1; filaActual <= niveles; filaActual++) {
            for (int asteriscoIndividual = 1; asteriscoIndividual <= filaActual; asteriscoIndividual++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Genera la figura F3 usando estructura While
     */
    public void generarFiguraF3While(int niveles) {
        int filaActual = 1;

        // //While
        while (filaActual <= niveles) {
            int asteriscoIndividual = 1;
            while (asteriscoIndividual <= filaActual) {
                System.out.print("* ");
                asteriscoIndividual++;
            }
            System.out.println();
            filaActual++;
        }
    }

    /**
     * Genera la figura F3 usando estructura Do-while
     */
    public void generarFiguraF3DoWhile(int niveles) {
        if (niveles <= 0) return;
        
        int filaActual = 1;

        // //Do while
        do {
            int asteriscoIndividual = 1;
            do {
                System.out.print("* ");
                asteriscoIndividual++;
            } while (asteriscoIndividual <= filaActual);
            
            System.out.println();
            filaActual++;
        } while (filaActual <= niveles);
    }
}