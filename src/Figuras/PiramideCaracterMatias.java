package Figuras;

public class PiramideCaracterMatias {

    public static void main(String[] args) {
        PiramideCaracterMatias piramide = new PiramideCaracterMatias();
        piramide.generarPiramideFor(6);
        piramide.generarPiramideWhile(6);
        piramide.generarPiramideDoWhile(6);
    }
    public void generarPiramideFor(int nivel) {
        /*
         * Reto: Generar una pirámide de caracteres
         * @param niveles El número de niveles que tendrá la pirámide
         */
        for(int i=1; i<=nivel; i++){
            for(int j=1; j<=nivel - i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i - 1); k++){
                System.out.print("*");
            }System.out.println();
        }
    }

    public void generarPiramideWhile(int nivel){
        int i = 1;
        while(i<=nivel){
            int j = 1;
            while(j<=nivel - i){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k<=(2*i - 1)){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }    
    }

    public void generarPiramideDoWhile(int nivel){
        int i= 1;
        do{
            int j = 1;
            if(nivel - i > 0){
            do{
                System.out.print(" ");
                j++;
            } while(j<=nivel - i);
            }
            int k = 1;
            do{
                System.out.print("*");
                k++;
            } while(k<=(2*i - 1));
            System.out.println();
            i++;
        }while(i<=nivel);
        
    }
}
