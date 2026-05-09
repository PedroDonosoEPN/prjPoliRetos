import Arrays.ArraysJhonatan;
import CadenaCaracteres.CadenaCaracteresJhonatan;
import Figuras.FigurasJhonatan;
import Loading.LoadingJhonatan;
import SerieCaracteres.SerieCaracteresJhonatan;
import seriesNumericas.SerieNumericaJhonatan;

public class ControladorJhonatan {
    public void mostrarDeberJhonatan(){
        SerieNumericaJhonatan serieNumericaJhonatan = new SerieNumericaJhonatan();
        serieNumericaJhonatan.generarSerie(8);
        SerieCaracteresJhonatan serieCaracteresJhonatan = new SerieCaracteresJhonatan();
        serieCaracteresJhonatan.generarSerieCaracteres(8);
        FigurasJhonatan figurasJhonatan = new FigurasJhonatan();
        figurasJhonatan.generarFigura(7);
        CadenaCaracteresJhonatan cadenaCaracteresJhonatan = new CadenaCaracteresJhonatan();
        cadenaCaracteresJhonatan.eliminarLetra("Hola buenos dias", 's');
        ArraysJhonatan arraysJhonatan = new ArraysJhonatan();
        arraysJhonatan.generarMatrizX("Jhonatan", "Chango");
        LoadingJhonatan loadingJhonatan = new LoadingJhonatan();
        loadingJhonatan.mostrarWaiting(100);
    }
}
