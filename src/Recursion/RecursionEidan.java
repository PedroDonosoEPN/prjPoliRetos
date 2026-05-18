package Recursion;

public class RecursionEidan {
/*    R06) crear un metodo recursivo para obtener la conteoRegresivo(n) hasta 0 /
imprimir el avance */

    // Método RECURSIVO
    public void conteoRecursivo(int n) {

        if (n < 0) {
            return;
        }

        System.out.println(n);

        conteoRecursivo(n - 1);
    }
}