package Figuras;

public class FigurasEidan {

    // Variable con 5 espacios
    String espacio = "     ";

    // Escalera usando FOR
    public void escaleraFor() {


        System.out.println("____");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(espacio);
            }

            System.out.println("|___");
        }
    }

    // Escalera usando WHILE
    public void escaleraWhile() {


        System.out.println("____");

        int i = 1;

        while (i <= 4) {

            int j = 1;

            while (j <= i) {
                System.out.print(espacio);
                j++;
            }

            System.out.println("|___");

            i++;
        }
    }

    // Escalera usando DO WHILE
    public void escaleraDoWhile() {


        System.out.println("____");

        int i = 1;

        do {

            int j = 1;

            do {
                System.out.print(espacio);
                j++;

            } while (j <= i);

            System.out.println("|___");

            i++;

        } while (i <= 4);
    }
}