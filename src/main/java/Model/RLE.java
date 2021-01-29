package Model;

import java.util.ArrayList;

public class RLE {

    public static Tupla[] encode(String s) {
        if(s.isEmpty()) return new Tupla[]{};
        if(s.length() == 1) return encodeCharacter(s.charAt(0));
        return generateTuplas(s);
    }

    private static Tupla[] generateTuplas(String s) {
        ArrayList<Tupla> tuplas = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            tuplas.add(new Tupla(s.charAt(i),1));
        }
        return generateTuplaArray(tuplas);
    }

    private static Tupla[] generateTuplaArray(ArrayList<Tupla> tuplas) {
        Tupla[] tuplasArray = new Tupla[tuplas.size()];
        for(int i = 0; i < tuplas.size(); i++){
            tuplasArray[i] = tuplas.get(i);
        }
        return tuplasArray;
    }

    private static Tupla[] encodeCharacter(char c) {
        return new Tupla[]{new Tupla(c,1)};
    }

}
