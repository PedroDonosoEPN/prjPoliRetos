package poliRetos.CadenaCaracteres;

public class CadenaCaracteresPedro {
    
        //  ++  +++ +++++ +++++++ +++++++++++ +++++++++++++ 
    /**
     * Reto: Eliminar una vocal específica de una frase
     * @param frase La oración ingresada por el usuario
     * @param vocal La vocal que se desea quitar
     */
    public void eliminarVocal(String frase, String vocal) {
        // Usamos replace para cambiar la vocal por un espacio vacío o nada
        // frase.toLowerCase() ayuda si quieres que sea insensible a mayúsculas
        String resultado = frase.replace(vocal.toLowerCase(), " ")
                                .replace(vocal.toUpperCase(), " ");

        System.out.println("Frase original: " + frase);
        System.out.println("Vocal a eliminar: " + vocal);
        System.out.println("Salida: " + resultado);
    }

}
