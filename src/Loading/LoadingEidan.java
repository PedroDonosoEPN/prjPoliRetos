package Loading;

public class LoadingEidan {
    /* L07) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta con
movimiento rotacional signos \|/-|
 [====/ ] 20% */
    int total = 20;

    // FOR
    public void barraFor() {

        try {

            char[] rotacion = {'\\', '|', '/', '-'};
            int indice = 0;


            for (int i = 0; i <= total; i++) {

                int porcentaje = i * 100 / total;

                String barra = "[";

                for (int j = 0; j < i; j++) {
                    barra += "=";
                }

                if (i < total) {
                    barra += rotacion[indice % 4];
                }

                for (int j = i + 1; j < total; j++) {
                    barra += " ";
                }

                barra += "] " + porcentaje + "%";

                System.out.print("\r" + barra);

                indice++;

                Thread.sleep(150);
            }

            System.out.println("\n");

        } catch (InterruptedException e) {

            System.out.println("Error en animacion FOR");
        }
    }

    // WHILE
    public void barraWhile() {

        try {

            char[] rotacion = {'\\', '|', '/', '-'};
            int indice = 0;
            int i = 0;


            while (i <= total) {

                int porcentaje = i * 100 / total;

                String barra = "[";

                int j = 0;

                while (j < i) {
                    barra += "=";
                    j++;
                }

                if (i < total) {
                    barra += rotacion[indice % 4];
                }

                j = i + 1;

                while (j < total) {
                    barra += " ";
                    j++;
                }

                barra += "] " + porcentaje + "%";

                System.out.print("\r" + barra);

                indice++;
                i++;

                Thread.sleep(150);
            }

            System.out.println("\n");

        } catch (InterruptedException e) {

            System.out.println("Error en animacion WHILE");
        }
    }

    // DO WHILE
    public void barraDoWhile() {

        try {

            char[] rotacion = {'\\', '|', '/', '-'};
            int indice = 0;
            int i = 0;


            do {

                int porcentaje = i * 100 / total;

                String barra = "[";

                int j = 0;

                while (j < i) {
                    barra += "=";
                    j++;
                }

                if (i < total) {
                    barra += rotacion[indice % 4];
                }

                j = i + 1;

                while (j < total) {
                    barra += " ";
                    j++;
                }

                barra += "] " + porcentaje + "%";

                System.out.print("\r" + barra);

                indice++;
                i++;

                Thread.sleep(150);

            } while (i <= total);

            System.out.println("\n");

        } catch (InterruptedException e) {

            System.out.println("Error en animacion DO WHILE");
        }
    }
    }

