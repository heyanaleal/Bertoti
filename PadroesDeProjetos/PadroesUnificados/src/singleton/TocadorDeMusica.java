package singleton;
import strategy.*;
public class TocadorDeMusica {
    private static TocadorDeMusica instancia;
  
  private EstrategiaMusica estrategia;

  private TocadorDeMusica() {}

  public static TocadorDeMusica getInstancia() {
      if (instancia == null) {
          instancia = new TocadorDeMusica();
      }
      return instancia;
  }

  public void definirEstrategia(EstrategiaMusica estrategia) {
      this.estrategia = estrategia;
  }

  public void tocar() {
      estrategia.tocarMusica();
  }
}