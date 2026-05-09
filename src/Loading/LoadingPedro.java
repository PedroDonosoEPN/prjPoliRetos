package Loading;

public class LoadingPedro {

    /**
     * Simula la barra de carga usando estructura For
     * @param caracter El símbolo que se moverá en la barra.
     */
    public void barraDesplazamientoFor(char caracter) {
        int tamanioBarra = 20;

        // //For
        for (int posicion = 0; posicion <= tamanioBarra; posicion++) {
            imprimirEstadoBarra(caracter, posicion, tamanioBarra);
            pausarEjecucion(100);
        }
        System.out.println();
    }

    /**
     * Simula la barra de carga usando estructura While
     */
    public void barraDesplazamientoWhile(char caracter) {
        int tamanioBarra = 20;
        int posicion = 0;

        // //While
        while (posicion <= tamanioBarra) {
            imprimirEstadoBarra(caracter, posicion, tamanioBarra);
            pausarEjecucion(100);
            posicion++;
        }
        System.out.println();
    }

    /**
     * Simula la barra de carga usando estructura Do-while
     */
    public void barraDesplazamientoDoWhile(char caracter) {
        int tamanioBarra = 20;
        int posicion = 0;

        // //Do while
        do {
            imprimirEstadoBarra(caracter, posicion, tamanioBarra);
            pausarEjecucion(100);
            posicion++;
        } while (posicion <= tamanioBarra);
        
        System.out.println();
    }

    /**
     * Método técnico auxiliar para evitar repetir la lógica de impresión
     */
    private void imprimirEstadoBarra(char caracter, int posicion, int tamanioBarra) {
        int porcentaje = (posicion * 100) / tamanioBarra;
        System.out.print("\r[");
        for (int i = 0; i < tamanioBarra; i++) {
            if (i == posicion) {
                System.out.print(caracter);
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("] " + porcentaje + "%");
    }

    /**
     * Método auxiliar para manejar el Thread.sleep de forma limpia
     */
    private void pausarEjecucion(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}