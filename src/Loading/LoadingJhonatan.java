package poliRetos.Loading;

public class LoadingJhonatan {
    /**
     * L04: Waiting que avanza de 0% a 100% haciendo uso de la figura oOo para simular movimiento
     * @param avance determina hasta que porcentaje va a correr el waiting. 
     */
    public void mostrarWaiting(int avance){
        String waiting[]={"Ooo","oOo","ooO","oOo","Ooo"};
        for(int i = 0; i<avance;i++){
            System.out.print("\r"+waiting[i %waiting.length]);
            System.out.print(" "+(i+1)+" %");
            try {
                Thread.sleep(100);
            } catch (Exception e){} 
        }
        System.out.println();
    }
}
