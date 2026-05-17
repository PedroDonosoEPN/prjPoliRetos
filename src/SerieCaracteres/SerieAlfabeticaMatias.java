package SerieCaracteres;

public class SerieAlfabeticaMatias  {
    
    public void generarAlfabetoFor(int num) {
        /*
         * Reto: Generar una serie alfabetica con un número específico de términos.
         * @param num El número de términos a generar.
         * @param letra La letra inicial de la serie.
         */
        System.out.println("Serie alfabetica: (" + num +" terminos)");
        
        for (int i = 0; i < num; i++) {
            char letra = (char) ('a' + i);
            System.out.print(letra + " ");
        }
        System.out.println();
    }

    public void generarAlfabetoWhile(int num) {
        System.out.println("Serie alfabetica: (" + num +" terminos)");
        int i = 0;
        while (i < num) {
            char letra = (char) ('a' + i);
            System.out.print(letra + " ");
            i++;
        }
        System.out.println();
    }

    public void generarAlfabetoDoWhile(int num) {
        System.out.println("Serie alfabetica: (" + num +" terminos)");
        int i = 0;
        do {
            char letra = (char) ('a' + i);
            System.out.print(letra + " ");
            i++;
        } while (i < num);
        System.out.println();
    }
}