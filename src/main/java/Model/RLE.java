package Model;

public class RLE {
    public static Tupla[] encode(String s) {
        if(s.isEmpty()) return new Tupla[]{};

        return new Tupla[]{new Tupla(s.charAt(0),1)};
    }

}
