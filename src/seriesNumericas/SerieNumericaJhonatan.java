package seriesNumericas;

public class SerieNumericaJhonatan {
    /**
     * Generar la serie numerica S4: Fibonacci / Pares
     * @param cantidadElementos
     */
    public void generarSerieFor(int cantidadElementos){
        
        int a=0;
        int b=1;
        int denominador=2;

        for(int i=0; i<cantidadElementos; i++){
            System.out.print(a+"/"+denominador+"  ");

            int sigTermino = a+b;
            a = b;
            b = sigTermino;

            denominador+=2;
        }
    System.out.println();
    }

    public void generarSerieWhile(int cantidadElementos){
        int a=0;
        int b=1;
        int denominador=2;
        int i=0;

        while(i<cantidadElementos){
            System.out.print(a+"/"+denominador+"  ");

            int sigTermino = a+b;
            a = b;
            b = sigTermino;

            denominador+=2;
            i++;
        }
    System.out.println();
    }

    public void generarSerieDoWhile(int cantidadElementos){
        int a=0;
        int b=1;
        int denominador=2;
        int i=0;

        do{
             System.out.print(a+"/"+denominador+"  ");

            int sigTermino = a+b;
            a = b;
            b = sigTermino;

            denominador+=2;
            i++;
        }while(i<cantidadElementos);
    System.out.println();
    }
}
