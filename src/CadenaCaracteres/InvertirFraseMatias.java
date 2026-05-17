package CadenaCaracteres;

public class InvertirFraseMatias {
    public void invertirFraseFor(String frase) {
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

    public void InvertirFraseWhile(String frase){
        int i = 1;
        String fraseInvertida = "";
        while(i <= frase.length()){
            fraseInvertida += frase.charAt(frase.length() - i);
            i++;
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);       
    }

    public void InvertirFraseDoWhile(String frase){
        int i = 1;
        String fraseInvertida = "";
        do {
            fraseInvertida += frase.charAt(frase.length() - i);
            i++;
        } while (i <= frase.length());
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);       
    }
}
