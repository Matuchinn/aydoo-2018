package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;


public class PruebaTablero {

    /*
    cuando unico un barco indico la direccion V u H
    disparo fuera del tablero debria lanzar excepcion
    ubico un barco en una posicion ya ocupada, deberia lanzar excepcion
    ubicar un barco fuera del tablero deberia lanzar excepcion
         */
    @Test
    public void disparoATableroVacioYDevuelveAgua(){
        Tablero tablero = new Tablero();
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1,1));
        Assert.assertEquals(ResultadoDeDisparo.AGUA, resultadoDeDisparo);
    }

    @Test
    public void disparoATableroCuandoTocoUnBoteYDevuelveHundido(){
        Tablero tablero = new Tablero();
        Bote unBote = new Bote();
        tablero.ubicarBote(unBote,new Posicion(1,1));
        ResultadoDeDisparo resultadoDeDisparo = tablero.recibirDisparo(new Posicion(1,1));
        Assert.assertEquals(ResultadoDeDisparo.HUNDIDO, resultadoDeDisparo);
    }

}