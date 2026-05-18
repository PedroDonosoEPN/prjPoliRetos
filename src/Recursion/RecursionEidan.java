package Recursion;

public class RecursionEidan {
 
    // Método usando FOR
    public void conteoFor() {
      int n = 10;

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    // Método usando WHILE
    public void conteoWhile() {
      int n = 10;

        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }

    // Método usando DO WHILE
    public void conteoDoWhile() {
      int n = 10;


        int i = n;

        do {
            System.out.println(i);
            i--;
        } while (i >= 0);
    }

    // Método RECURSIVO
    public void conteoRecursivo(int n) {

        if (n < 0) {
            return;
        }

        System.out.println(n);

        conteoRecursivo(n - 1);
    }
}