package Figuras;

public class PiramideCaracterMatias {
    public void generarPiramideFor(int niveles, char caracter) {
        /*
         * Reto: Generar una pirámide de caracteres
         * @param niveles El número de niveles que tendrá la pirámide
         * @param caracter El carácter que se usará para construir la pirámide
         */
        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= niveles - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }

    public void generarPiramideWhile(int niveles, char caracter){
        int i = 1;
        while (i<niveles){
            int j = 1;
            while (j<niveles-i){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k<=(2*i-1)){
                System.out.print(caracter + " ");
                k++;
            }
            System.out.println();
            i++;
        }        
    }

    public void generarPiramideDoWhile(int niveles, char caracter){
        int i = 1;
        do {
            int j = 1;
            do {
                if (j < niveles - i) {
                    System.out.print(" ");
                }
                j++;
            } while (j <= niveles - i);
            
            int k = 1;
            do {
                if (k <= (2 * i - 1)) {
                    System.out.print(caracter + " ");
                }
                k++;
            } while (k <= (2 * i - 1));
            
            System.out.println();
            i++;
        } while (i <= niveles);
    }
}
