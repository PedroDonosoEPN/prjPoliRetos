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
        SerieNumericaMatias sNum = new SerieNumericaMatias();
        sNum.generarSerie(10); 

        // 2. Series de Caracteres
        SerieAlfabeticaMatias sAlfa = new SerieAlfabeticaMatias();
        sAlfa.generarAlfabeto(12);

        // 3. Figuras (Pirámide)
        PiramideCaracterMatias figuras = new PiramideCaracterMatias();
        figuras.generarPiramide(6, '*');

        // 4. Cadenas de Caracteres 
        InvertirFraseMatias cadenas = new InvertirFraseMatias();
        cadenas.invertirFrase("Estructura de Datos EPN");

        // 5. Recursión
        RecursionMatias recursion = new RecursionMatias();
        recursion.conteoRegresivo(5);

        // 6. Grafos y Autómatas
        GrafosYAutomatasMatias automatnas = new GrafosYAutomatasMatias();
        automatnas.validarLenguaje("for (");
        automatnas.validarLenguaje("ifelse(");

        // 7. Loading
        LoadingMatias loading = new LoadingMatias();
        loading.loading(20, "<=>");
    }
}