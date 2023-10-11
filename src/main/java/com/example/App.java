package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Server servente = new Server();
        servente.attendi();
        servente.comunica();
    }
}
