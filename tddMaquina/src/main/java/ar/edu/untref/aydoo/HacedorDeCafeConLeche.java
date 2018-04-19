package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {

    private Lechero lechero = new Lechero();
    private Cafetero cafetero = new Cafetero();

    public void prepararEnVaso(Vaso unVaso) {
        cafetero.setCafe(unVaso);
        lechero.ponerLecheUnVaso(unVaso);
    }
}
