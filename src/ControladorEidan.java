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
    }

    public static void main(String[] args) {

        ControladorEidan obj = new ControladorEidan();

        obj.mostrarDeberEidan();
    }
}
