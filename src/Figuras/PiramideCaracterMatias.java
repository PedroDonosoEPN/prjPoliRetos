package Figuras;

public class PiramideCaracterMatias {
    public void generarPiramide(int niveles, char caracter) {
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
}
