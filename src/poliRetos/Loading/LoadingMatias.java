package poliRetos.Loading;

public class LoadingMatias {

    public void loading() {
        int tamanoBarra = 20;
        String icono = "<=>";
        int limite = tamanoBarra - icono.length(); // 17 espacios libres

        for (int i = 0; i <= limite; i++) {
            // " " .repeat(i) crea los espacios a la izquierda
            // " " .repeat(limite - i) crea los espacios a la derecha
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