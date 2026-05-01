package poliRetos.SerieCaracteres;

public class SerieCaracteresJhonatan {
    /**
     * Generar la serie de caracteres S4: + - * / + - * / ......
     * @param cantidad: Se encarga de determinar la cantidad de elementos a generar en la serie.
     */
    public void generarSerieCaracteres(int cantidad){
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
        }
      
    }
