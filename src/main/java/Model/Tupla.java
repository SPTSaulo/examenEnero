package Model;

public class Tupla {
    private char caracter;
    private int repeticiones;

    public Tupla(char caracter, int repeticiones) {
        this.caracter = caracter;
        this.repeticiones = repeticiones;
    }

    @Override
    public String toString() {
        return "(" + repeticiones + ", " + caracter + ")";
    }
}
