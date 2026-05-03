package poliRetos.seriesNumericas;

public class SerieNumericaMateo {
    S8:  3, 8, 13, 18, 23, 28, 33, 38, ...
 /**
     * Genera la serie S8: 3, 8, 13, 18, 23, 28, 33, 38, ...
     * @param cantidadTerminos Cantidad de términos a generar
     */
    public void generarSerie(int cantidadTerminos) {
        int terminoActual = 3; 
        int incremento = 5; 

        for (int i = 0; i < cantidadTerminos; i++) {
            System.out.print(terminoActual + " "); 
            terminoActual += incremento;
        }
        
        System.out.println(); 
    }
}
    
