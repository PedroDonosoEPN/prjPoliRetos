package CadenaCaracteres;

public class InvertirFraseMatias {

    public static void main(String[] args) {
        InvertirFraseMatias cadenas = new InvertirFraseMatias();
        cadenas.invertirFraseFor("Hola Como estas?");
        cadenas.InvertirFraseWhile("Hola Como estas?");
        cadenas.InvertirFraseDoWhile("Hola Como estas?");
    }
    public void invertirFraseFor(String frase) {
        /*
        * Reto: Invertir una frase
        * @param frase La oración ingresada por el usuario
        */
        for(int i=frase.length()-1; i>=0; i--){
            char letra = frase.charAt(i);

            char minuscula = Character.toLowerCase(letra);
            
            if(Character.isLetter(minuscula)&& (minuscula != 'a' && minuscula != 'e' && minuscula != 'i' && minuscula != 'o' && minuscula != 'u')){
                System.out.print(Character.toUpperCase(letra));
            } else {
                System.out.print(letra);
            }
        }
        System.out.println();
    
    }

    public void InvertirFraseWhile(String frase){
       int i = frase.length() - 1;
        while(i>=0){
            char letra = frase.charAt(i);
            char minuscula = Character.toLowerCase(letra);

            if(Character.isLetter(minuscula)&& (minuscula != 'a' && minuscula != 'e' && minuscula != 'i' && minuscula != 'o' && minuscula != 'u')){
                System.out.print(Character.toUpperCase(letra));
            } else {
                System.out.print(letra);
            }
            i--;
        }
        System.out.println();   
    }

    public void InvertirFraseDoWhile(String frase){
        int i = frase.length() - 1;
        do{
            char letra = frase.charAt(i);
            char minuscula = Character.toLowerCase(letra);

            if(Character.isLetter(minuscula)&& (minuscula != 'a' && minuscula != 'e' && minuscula != 'i' && minuscula != 'o' && minuscula != 'u')){
                System.out.print(Character.toUpperCase(letra));
            } else {
                System.out.print(letra);
            }
            i--;
        } while(i>=0);
        System.out.println();     
    }
}
