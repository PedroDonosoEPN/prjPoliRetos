package seriesNumericas;

public class SerieNumericaMatias {
   
    public void generarSerie(int nTerminos) {
        /*
         * Reto: Generar una serie numerica con un número específico de términos.
         * @param nTerminos El número de términos a generar.
         */
        System.out.println("Serie numerica: ");
        
        for (int i = 1; i <= nTerminos; i++) {
            System.out.print(i * i + " ");      
        }
    System.out.println();
    }
} 
