package one.dio.gof.singleton;
/**
 * Singleton "apressado"
 * @author Cleilson
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
