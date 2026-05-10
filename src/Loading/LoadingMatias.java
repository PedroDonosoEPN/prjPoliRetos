package Loading;

public class LoadingMatias {

    public void loading(int tamanoBarra, String icono) {
        /*
        * Reto: Simular una barra de carga
        * @param tamanoBarra El tamaño total de la barra de carga
        * @param icono El carácter que se usará para representar la carga
        * @param porcentaje El porcentaje de carga que se mostrará al usuario
        */
        int limite = tamanoBarra - icono.length(); // 17 espacios libres

        for (int i = 0; i <= limite; i++) {
            String espaciosIzquierda = " ".repeat(i);
            String espaciosDerecha = " ".repeat(limite - i);
            int porcentaje = (i * 100) / limite;

            System.out.print("\r[" + espaciosIzquierda + icono + espaciosDerecha + "] " + porcentaje + "%");

            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nCarga completa.");
    }
}