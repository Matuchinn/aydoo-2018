package ar.edu.untref.aydoo;

public class Crucero {

    private Posicion posicionDelCrucero;

    public void setPosicion(Posicion unaPosicion) {

    }

    public boolean estaEn(Posicion unaPosicion) {
        return true;
    }

    public ResultadoDeDisparo recibirDisparo() {
        return ResultadoDeDisparo.TOCADO;
    }
}
