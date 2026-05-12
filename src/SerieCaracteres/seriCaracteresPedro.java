package SerieCaracteres;

public class seriCaracteresPedro {

    /**
     * Genera la serie usando estructura For
     */
    public void generarSerieCaracteresFor(int cantidadTerminos) {
        int numeroEvaluar = 2;
        int terminosGenerados = 0;

        // //For
        for (terminosGenerados = 0; terminosGenerados < cantidadTerminos; numeroEvaluar++) {
            if (esPrimo(numeroEvaluar)) {
                for (int i = 0; i < numeroEvaluar; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                terminosGenerados++;
            }
        }
        System.out.println();
    }

    /**
     * Genera la serie usando estructura While
     */
    public void generarSerieCaracteresWhile(int cantidadTerminos) {
        int terminosGenerados = 0;
        int numeroEvaluar = 2;

        // //While
        while (terminosGenerados < cantidadTerminos) {
            if (esPrimo(numeroEvaluar)) {
                for (int i = 0; i < numeroEvaluar; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                terminosGenerados++;
            }
            numeroEvaluar++;
        }
        System.out.println();
    }

    /**
     * Genera la serie usando estructura Do-while
     */
    public void generarSerieCaracteresDoWhile(int cantidadTerminos) {
        if (cantidadTerminos <= 0) return;

        int terminosGenerados = 0;
        int numeroEvaluar = 2;

        // //Do while
        do {
            if (esPrimo(numeroEvaluar)) {
                for (int i = 0; i < numeroEvaluar; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                terminosGenerados++;
            }
            numeroEvaluar++;
        } while (terminosGenerados < cantidadTerminos);
        
        System.out.println();
    }

    /**
     * Método auxiliar para verificar si un número es primo
     */
    private boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}