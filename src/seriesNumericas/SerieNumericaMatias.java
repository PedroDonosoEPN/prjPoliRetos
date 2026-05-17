package seriesNumericas;

public class SerieNumericaMatias {
   
    public void generarSerieFor(int nTerminos) {
        /*
         * Reto: Generar una serie numerica con un número específico de términos.
         * @param nTerminos El número de términos a generar.
         */
        System.out.println("Serie numerica: ");
        
        //For
        for (int i = 1; i <= nTerminos; i++) {
            System.out.print(i * i + " ");      
        }
    System.out.println();
    }

        //While
    public void generarSerieWhile(int nTerminos) {
        System.out.println("Serie numerica: ");
        int i = 1;
        while (i <= nTerminos) {
            System.out.print(i * i + " ");
            i++;
        }
        System.out.println();
     }

     //Do-while
    public void generarSerieDoWhile(int nTerminos) {
        System.out.println("Serie numerica: ");
        int i = 1;
        do {
            System.out.print(i * i + " ");
            i++;
        } while (i <= nTerminos);
        System.out.println();
     }

} 
