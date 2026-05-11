package Figuras;

public class FigurasJhonatan {
    /**
     * Generar la figura F4: Triangulo rectangulo con asteriscos
     * @param tamano: Define el tamaño que va a tener la figura generada.
     */
    public void generarFiguraFor(int tamano){
        for(int v=0; v<tamano; v++){
            for(int h=0; h<tamano; h++){
                if(h+v>= tamano-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void generarFiguraWhile(int tamano){
        int v= 0;

        while(v<tamano){
            int h = 0;
            while(h<tamano){
                if(h+v>= tamano-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            h++;   
            }
            System.out.println();
            v++;
        }
    }

    public void generarFiguraDoWhile(int tamano){
        int v= 0;

        do{
            int h = 0;
            do{
                if(h+v>= tamano-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            h++;   
            }while(h<tamano);
            System.out.println();
            v++;
        }while(v<tamano);
    }
}
