import CadenaCaracteres.InvertirFraseMatias;
import Figuras.PiramideCaracterMatias;
import Loading.LoadingMatias;
import Recursion.RecursionMatias;
import SerieCaracteres.SerieAlfabeticaMatias;
import seriesNumericas.SerieNumericaMatias;
import GrafosYAutomatas.GrafosYAutomatasMatias;

public class ControladorMatias {
    public void mostrarDeberMatias() {

        // 1. Series Numéricas 
        SerieNumericaMatias SerieNumerica = new SerieNumericaMatias();
        SerieNumerica.generarSerieFor(10); 
        SerieNumerica.generarSerieWhile(10);
        SerieNumerica.generarSerieDoWhile(10);

        // 2. Series de Caracteres
        SerieAlfabeticaMatias SerieAlfabetica = new SerieAlfabeticaMatias();
        SerieAlfabetica.generarAlfabetoFor(12);
        SerieAlfabetica.generarAlfabetoWhile(12);
        SerieAlfabetica.generarAlfabetoDoWhile(12);

        // 3. Figuras (Pirámide)
        PiramideCaracterMatias figuras = new PiramideCaracterMatias();
        figuras.generarPiramide(6, '*');

        // 4. Cadenas de Caracteres 
        InvertirFraseMatias cadenas = new InvertirFraseMatias();
        cadenas.invertirFrase("Estructura de Datos EPN");

        // 5. Recursión
        RecursionMatias recursion = new RecursionMatias();
        recursion.conteoRegresivoFor(5);
        recursion.conteoRegresivoWhile(5);
        recursion.conteoRegresivoDoWhile(5);

        // 6. Grafos y Autómatas
        GrafosYAutomatasMatias automatnas = new GrafosYAutomatasMatias();
        automatnas.validarLenguaje("for (");
        automatnas.validarLenguaje("ifelse(");

        // 7. Loading
        LoadingMatias loading = new LoadingMatias();
        loading.loading(20, "<=>");
    }
}