package poliRetos.Figuras;

public class FigurasJhonatan {
    /**
     * Generar la figura F4: Triangulo rectangulo con asteriscos
     * @param tamano: Define el tamaño que va a tener la figura generada.
     */
    public void generarFigura(int tamano){
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
}
