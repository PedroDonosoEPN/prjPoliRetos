package SerieCaracteres;

public class SerieAlfabeticaMatias  {
    
    public void generarAlfabetoFor(char letralimite) {
        /*
         * Reto: Generar una serie alfabetica con un número específico de términos.
         * @param letralimite El límite de la letra final de la serie.
         */
         for(char a = 'a'; a <= letralimite; a++){
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    public void generarAlfabetoWhile(char letralimite) {
        char a = 'a';
        while (a <= letralimite) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        }

    public void generarAlfabetoDoWhile(char letralimite) {
        char a = 'a';
        do {
            System.out.print(a + " ");
            a++;
        } while (a <= letralimite);
        System.out.println();
    }
}
