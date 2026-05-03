package poliRetos.SerieCaracteres;
//S8:  a  bbb  ccccc  ddddddd eeeeeeeee... 
public class SerieAlfabeticaMateo {
    /**
     * Genera la serie S8: a, bbb, ccccc, ddddddd, eeeeeeeee, ...
     * @param cantidadTerminos Cantidad de términos a generar
     */
    public void generarSerie(int cantidadTerminos) {
        char letraActual = 'a'; 

        for (int i = 0; i < cantidadTerminos; i++) {
            int repeticiones = 2 * i + 1; 
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(letraActual); 
            }
            System.out.print(" "); 
            letraActual++; 
        }
        
        System.out.println(); 
    }
}