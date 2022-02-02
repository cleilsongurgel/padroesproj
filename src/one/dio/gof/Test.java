package one.dio.gof;

import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {
        //Testes relacionados ao padrão Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    }
}
