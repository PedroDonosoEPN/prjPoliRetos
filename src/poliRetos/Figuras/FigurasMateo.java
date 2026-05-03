package poliRetos.Figuras;

public class FigurasMateo {
    /**
 * Dibuja una secuencia de escalones basada en un número entero.
 * @param niveles Cantidad de escalones a generar.
 */
public void dibujarEscalera(int niveles) {
    if (niveles <= 0) {
        System.out.println("Por favor, ingresa un número de niveles mayor a 0.");
        return;
    }

    for (int i = 0; i < niveles; i++) {
        StringBuilder linea = new StringBuilder();
        
        // Genera los espacios necesarios
        for (int j = 0; j < i * 2; j++) {
            linea.append(" ");
        }
        
        // Añade el escalón y lo imprime
        linea.append("__|");
        System.out.println(linea.toString());
    }
}
}
