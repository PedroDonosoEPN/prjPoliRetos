package GrafosYAutomatas;

public class   GrafosYAutomatasEidan {

   /*  Crear un validador de clave para validar:
 - almenos una letra mayuscula
 - almenos una letra miniscula
 - almenos una letra un numero
 - almenos una letra un caracter */
    public void validarClave(String clave) {

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean caracterEspecial = false;

        int i = 0;

        // Autómata
        while (i < clave.length()) {

            char c = clave.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                mayuscula = true;
            } 
            else if (c >= 'a' && c <= 'z') {
                minuscula = true;
            } 
            else if (c >= '0' && c <= '9') {
                numero = true;
            } 
            else {
                caracterEspecial = true;
            }

            i++;
        }

        System.out.println("Clave ingresada: " + clave);

        System.out.println("Mayúscula: " + mayuscula);
        System.out.println("Minúscula: " + minuscula);
        System.out.println("Número: " + numero);
        System.out.println("Caracter especial: " + caracterEspecial);

        if (mayuscula && minuscula && numero && caracterEspecial) {
            System.out.println("\nClave válida");
        } else {
            System.out.println("\nClave inválida");
        }
    }
}
