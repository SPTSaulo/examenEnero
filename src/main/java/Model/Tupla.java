package Model;

public class Tupla {
    private char caracter;
    private int repeticiones;

    public Tupla(char caracter, int repeticiones) {
        this.caracter = caracter;
        this.repeticiones = repeticiones;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    @Override
    public String toString() {
        return '(' + repeticiones + ", " + caracter +')';
    }
}
