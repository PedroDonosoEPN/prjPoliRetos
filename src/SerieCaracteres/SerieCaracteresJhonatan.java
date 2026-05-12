package SerieCaracteres;

public class SerieCaracteresJhonatan{
    /**
     * Generar la serie de caracteres S4: + - * / + - * / ......
     * @param cantidad: Se encarga de determinar la cantidad de elementos a generar en la serie.
     */
    public void generarSerieCaracteresFor(int cantidad){
        for(int i=0;i<cantidad; i++){
                if(i%4==0){
                    System.out.print("+");
                }else if(i%4==1){
                    System.out.print("-");
                }else if(i%4==2){
                    System.out.print("*");
                }else if(i%4==3){
                    System.out.print("/");
                }   
            }
            System.out.println();
        }

    public void generarSerieCaracteresWhile(int cantidad){
        int i = 0;

        while(i<cantidad){
                if(i%4==0){
                    System.out.print("+");
                }else if(i%4==1){
                    System.out.print("-");
                }else if(i%4==2){
                    System.out.print("*");
                }else if(i%4==3){
                    System.out.print("/");
                }
            i++;
            }
        System.out.println();
    }

    public void generarSerieCaracteresDoWhile(int cantidad){
        int i = 0;

        do{
                if(i%4==0){
                    System.out.print("+");
                }else if(i%4==1){
                    System.out.print("-");
                }else if(i%4==2){
                    System.out.print("*");
                }else if(i%4==3){
                    System.out.print("/");
                }
            i++;
        }while(i<cantidad);
    System.out.println();
    }
}
