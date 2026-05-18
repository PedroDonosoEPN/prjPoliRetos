import Arrays.ArraysEidan;
import seriesNumericas.SerieNumericaEidan;

public class ControladorEidan {

    public void mostrarDeberEidan() {

        SerieNumericaEidan serieNumerica = new SerieNumericaEidan();

        serieNumerica.serieFor();
        serieNumerica.serieWhile();
        serieNumerica.serieDoWhile();

        SerieCaracteres.SerieCaracteresEidan serieCaracteres = new SerieCaracteres.SerieCaracteresEidan();
        serieCaracteres.cadenasFor();
        serieCaracteres.cadenasWhile();
        serieCaracteres.cadenasDoWhile();

        Figuras.FigurasEidan figuras = new Figuras.FigurasEidan();
        figuras.escaleraFor();
        figuras.escaleraWhile();
        figuras.escaleraDoWhile();

        CadenaCaracteres.CadenaCaracteresEidan cadenaCaracteres = new CadenaCaracteres.CadenaCaracteresEidan();
        cadenaCaracteres.fraseFor();
        cadenaCaracteres.fraseWhile();
        cadenaCaracteres.fraseDoWhile();
        
        ArraysEidan.main();

        Loading.LoadingEidan loading = new Loading.LoadingEidan();
            loading.barraFor();
            loading.barraWhile();
            loading.barraDoWhile();

        Recursion.RecursionEidan recursion = new Recursion.RecursionEidan();
            recursion.conteoFor();
            recursion.conteoWhile();
            recursion.conteoDoWhile();

    }

    public static void main(String[] args) {

        ControladorEidan obj = new ControladorEidan();

        obj.mostrarDeberEidan();
    }
}
