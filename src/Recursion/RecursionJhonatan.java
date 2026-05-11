package Recursion;

public class RecursionJhonatan {
    /**
     * R04: Crear un metodo recursivo para obtener la potencia(a,b)
     * @param a: Equivale a la base de la potencia.
     * @param b: Corresponde al equivalente de la potencia.
     * @return
     */
    public int obtenerPotencia(int a, int b){
        if(b==0){
            return 1;
        }else{
            return a * obtenerPotencia(a, b-1);
        }
    }
}
