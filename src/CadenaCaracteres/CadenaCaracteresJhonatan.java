package poliRetos.CadenaCaracteres;

public class CadenaCaracteresJhonatan {
    /**
     * Cadena de caracteres S4: Eliminar una letra de una frase
     * @param frase: Es la frase ingresada por el usuario
     * @param letra: Es la letra que el usuario desee eliminar 
    */
    public void eliminarLetra(String frase, char letra){
        String resultado= frase.replace(""+Character.toLowerCase(letra), " ")
        .replace(""+Character.toUpperCase(letra), " ");

        System.out.println("Frase original: "+ frase);
        System.out.println("Resultado: "+resultado);

    }
}

