import  Arrays.ArraysPedro;
import  CadenaCaracteres.CadenaCaracteresPedro;
import  Figuras.FigurasPedro;
import  GrafosYAutomatas.GrafosYAutomatasPedro;
import  Loading.LoadingPedro;
import  Recursion.RecursionPedro;
import  SerieCaracteres.seriCaracteresPedro;
import seriesNumericas.SerieNumericaPedro;

public  class ControladorPedro {
            public void showDeber(){
                //Serie Numerica
                SerieNumericaPedro serieNumericaPedro = new SerieNumericaPedro();
                serieNumericaPedro.generarSerieConFor(10);
                serieNumericaPedro.generarSerieConWhile(10);
                serieNumericaPedro.generarSerieConDoWhile(10);
                //Serie Caracteres
                seriCaracteresPedro serieCaracteresPedro = new seriCaracteresPedro();
                serieCaracteresPedro.generarSerieCaracteresFor(5);
                serieCaracteresPedro.generarSerieCaracteresWhile(5);
                serieCaracteresPedro.generarSerieCaracteresDoWhile(5);
                //Figuras 
                FigurasPedro figurasPedro = new FigurasPedro();
                figurasPedro.generarFiguraF3For(5);
                figurasPedro.generarFiguraF3While(5);
                figurasPedro.generarFiguraF3DoWhile(5);
                //Cadena Caracteres
                CadenaCaracteresPedro cadenaCaracteresPedro = new CadenaCaracteresPedro();
                cadenaCaracteresPedro.eliminarVocal("jugar", "a");
                //Arrays
                ArraysPedro arraysPedro = new ArraysPedro();
                arraysPedro.graficarFuncionNombre("Pedro");
                //Loading
                LoadingPedro loadingPedro = new LoadingPedro();
                loadingPedro.barraDesplazamientoDoWhile('a');
                loadingPedro.barraDesplazamientoWhile('b');
                loadingPedro.barraDesplazamientoFor('c');
                //Recursion
                RecursionPedro recursionPedro = new RecursionPedro();
                recursionPedro.obtenerMultiplicacion(3, 5);
                //Grafo y Automatas
                GrafosYAutomatasPedro grafosYAutomatasPedro = new GrafosYAutomatasPedro();
                grafosYAutomatasPedro.main(null);


            }
}