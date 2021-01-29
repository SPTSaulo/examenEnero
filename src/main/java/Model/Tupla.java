package Model;

public class Tupla {
    private final char character;
    private int repetitions;

    public Tupla(char caracter, int repeticiones) {
        this.character = caracter;
        this.repetitions = repeticiones;
    }

    public char getCharacter() {
        return character;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    @Override
    public String toString() {
        return "(" + repetitions + ", " + character + ")";
    }
}
