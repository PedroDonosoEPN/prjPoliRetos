import Arrays.ArraysJhonatan;
import CadenaCaracteres.CadenaCaracteresJhonatan;
import Figuras.FigurasJhonatan;
import GrafosYAutomatas.GrafosYAutomatasJhonatan;
import Loading.LoadingJhonatan;
import Recursion.RecursionJhonatan;
import SerieCaracteres.SerieCaracteresJhonatan;
import seriesNumericas.SerieNumericaJhonatan;

public class ControladorJhonatan {
    public void mostrarDeberJhonatan(){
        //Serie Numerica
        SerieNumericaJhonatan serieNumericaJhonatan = new SerieNumericaJhonatan();
        serieNumericaJhonatan.generarSerieFor(8);
        serieNumericaJhonatan.generarSerieWhile(8);
        serieNumericaJhonatan.generarSerieDoWhile(8);

        //Serie Caracteres
        SerieCaracteresJhonatan serieCaracteresJhonatan = new SerieCaracteresJhonatan();
        serieCaracteresJhonatan.generarSerieCaracteresFor(8);
        serieCaracteresJhonatan.generarSerieCaracteresWhile(8);
        serieCaracteresJhonatan.generarSerieCaracteresDoWhile(8);

        //Figuras
        FigurasJhonatan figurasJhonatan = new FigurasJhonatan();
        figurasJhonatan.generarFiguraFor(7);
        figurasJhonatan.generarFiguraWhile(7);
        figurasJhonatan.generarFiguraDoWhile(7);

        //Cadena de Caracteres
        CadenaCaracteresJhonatan cadenaCaracteresJhonatan = new CadenaCaracteresJhonatan();
        cadenaCaracteresJhonatan.eliminarLetra("Hola buenos dias", 's');

        //Arrays
        ArraysJhonatan arraysJhonatan = new ArraysJhonatan();
        arraysJhonatan.generarMatrizX("Jhonatan", "Chango");

        //Loading
        LoadingJhonatan loadingJhonatan = new LoadingJhonatan();
        loadingJhonatan.mostrarWaitingFor(100);
        loadingJhonatan.mostrarWaitingWhile(100);
        loadingJhonatan.mostrarWaitingDoWhile(100);

        //Recursion
        RecursionJhonatan recursionJhonatan = new RecursionJhonatan();
        recursionJhonatan.obtenerPotencia(2, 3);

        //Grafos y Automatas
        GrafosYAutomatasJhonatan grafosYAutomatasJhonatan = new GrafosYAutomatasJhonatan();
        grafosYAutomatasJhonatan.validarDecimalJhonatan("8.93");
    }
}
