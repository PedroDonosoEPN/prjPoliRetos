package GrafosYAutomatas;

public class GrafosYAutomatasMatias {

    /*
    * Reto: Validar si una cadena pertenece al lenguaje L={for, if, else, ifelse, foreach}
    * @param entrada La cadena de texto a validar
    * @param palabrasReservadas Arreglo con los tokens válidos del lenguaje
    * @param esValido Bandera booleana para determinar la aceptación
    */
    public void validarLenguaje(String entrada) {
        String[] lenguaje = {"for", "if", "else", "ifelse", "foreach"};
        boolean esValido = false;
        String tokenEncontrado = "";
        String limpia = entrada.trim();

        for (String palabra : lenguaje) {
            if (limpia.startsWith(palabra)) {
                String resto = entrada.substring(palabra.length());
                
                if (resto.isEmpty() || resto.startsWith(" ") || resto.startsWith("(")) {
                    esValido = true;
                    tokenEncontrado = palabra;
                    break;
                }
            }
        }

        System.out.println("Entrada: [" + entrada + "]");
        if (esValido) {
            System.out.println("Resultado: ACEPTADA - Token reconocido: '" + tokenEncontrado + "'");
        } else {
            System.out.println("Resultado: RECHAZADA - No pertenece al lenguaje L.");
        }
    }
}