package com.java.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new BasicModule());
        Communication comm = injector.getInstance(Communication.class);
        System.out.println("Hello World !!!");
    }
}
