package poliRetos.Loading;

public class LoadingPedro {

    /**
     * Simula una barra de carga donde un carácter se desplaza.
     * @param caracter El símbolo que se moverá en la barra.
     */
    public void barraDesplazamiento(char caracter) {
        int tamanioBarra = 20;

        for (int posicion = 0; posicion <= tamanioBarra; posicion++) {
            // Calcular el porcentaje basado en la posición actual
            int porcentaje = (posicion * 100) / tamanioBarra;

            System.out.print("\r[");

            // Dibujar los espacios y el carácter
            for (int i = 0; i < tamanioBarra; i++) {
                if (i == posicion) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("] " + porcentaje + "%");

            try {
                // Pausa de 100 milisegundos para el efecto de movimiento
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(); // Salto de línea final
    }
}