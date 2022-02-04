package one.dio.gof.singleton;
/**
 * Singleton "apressado"
 * @author Cleilson
 */

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){
        return instancia;
    }
}
