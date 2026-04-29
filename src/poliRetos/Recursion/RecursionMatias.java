package poliRetos.Recursion;

public class RecursionMatias {
    
    public void conteoRegresivo(int numero) {
        if (numero < 0) {
            System.out.println("Número negativo no permitido.");
            return;
        }
        if (numero == 0) {
            System.out.println("¡Llegaste a cero!");
            return;
        }
        System.out.println(numero);
        conteoRegresivo(numero - 1);
    }

    public static void main(String[] args) {
        RecursionMatias rm = new RecursionMatias();
        System.out.println("Iniciando conteo:");
        rm.conteoRegresivo(10);
    }
}
