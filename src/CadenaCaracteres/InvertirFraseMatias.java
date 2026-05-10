package CadenaCaracteres;

public class InvertirFraseMatias {
    public void invertirFrase(String frase) {
        /*
        * Reto: Invertir una frase
        * @param frase La oración ingresada por el usuario
        * @param fraseInvertida La oración invertida que se mostrará al usuario
        */
        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);
            
    }
}
