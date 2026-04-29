package poliRetos.CadenaCaracteres;

public class InvertirFraseMatias {
    public void invertirFrase() {
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = System.console().readLine();
        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);
    }
}
