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
        boolean ParaValidar = false;
        String Encontrado = "";
        String sinespacios = entrada.trim();

        for (String palabra : lenguaje) {
            if (sinespacios.startsWith(palabra)) {
                String sobrante = entrada.substring(palabra.length());
                
                if (sobrante.isEmpty() || sobrante.startsWith(" ") || sobrante.startsWith("(")) {
                    ParaValidar = true;
                    Encontrado = palabra;
                    break;
                }
            }
        }

        System.out.println("Entrada: [" + entrada + "]");
        if (ParaValidar) {
            System.out.println("Resultado: ACEPTADA " + Encontrado + "'");
        } else {
            System.out.println("Resultado: RECHAZADA - No pertenece al lenguaje L.");
        }
    }
}