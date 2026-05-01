package poliRetos.seriesNumericas;

public class SerieNumericaJhonatan {
    /**
     * Generar la serie numerica S4: Fibonacci / Pares
     * @param cantidadElementos
     */
    public void generarSerie(int cantidadElementos){
        
        int a=0;
        int b=1;
        int denominador=2;

        for(int i=0; i<cantidadElementos; i++){
            System.out.print(a+"/"+denominador+",");

            int sigTermino = a+b;
            a = b;
            b = sigTermino;

            denominador+=2;
        }
    }
}
