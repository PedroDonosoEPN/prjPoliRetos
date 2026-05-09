package poliRetos.Arrays;

public class ArraysJhonatan {
    /**
     * A04: Crear una matriz donde se forme una x con su nombre y apellido
     * @param nombre
     * @param apellido
     */
    public void generarMatrizX(String nombre, String apellido){

        int n = Math.max(nombre.length(), apellido.length());
        char[][] matriz = new char[n][n];

        for (int i =0; i<n;i++){
            for (int j=0; j<n;j++){
                matriz[i][j] = ' ';
            }
        }

        for (int i =0; i<n; i++){
            if (i < nombre.length()){
                matriz[i][i] = nombre.charAt(i);
            }
            if (i< apellido.length()){
                matriz[i][n-1-i] = apellido.charAt(i);
            }
        }

        for(int i =0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
