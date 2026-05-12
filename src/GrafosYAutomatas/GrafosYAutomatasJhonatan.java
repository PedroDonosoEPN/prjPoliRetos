package GrafosYAutomatas;

public class GrafosYAutomatasJhonatan {
    /**
     * A04: Crear un compilador para comprobar si un numero es decimal
     * @param cadena: Aqui se ingresa el numero decimal como si fuera una cadena de texto
     */
   public void validarDecimalJhonatan(String cadena) {
        int estado = 0;
        int i = 0;
        boolean error = false;

        while (i < cadena.length() && !error) {
            char c = cadena.charAt(i);
            switch (estado) {
                case 0:
                    if (c == '+' || c == '-') estado = 1;
                    else if (Character.isDigit(c)) estado = 2;
                    else error = true;
                    break;
                case 1:
                    if (Character.isDigit(c)) estado = 2;
                    else error = true;
                    break;
                case 2:
                    if (Character.isDigit(c)) estado = 2;
                    else if (c == '.') estado = 3;
                    else error = true;
                    break;
                case 3:
                    if (Character.isDigit(c)) estado = 4;
                    else error = true;
                    break;
                case 4:
                    if (Character.isDigit(c)) estado = 4;
                    else error = true;
                    break;
            }
            i++;
        }

        if (!error && estado == 4) {
            System.out.println("Cadena: " + cadena + " = Es un decimal valido");
        } else {
            System.out.println("Cadena: " + cadena + " = Error: Formato no valido");
        }
    }
}