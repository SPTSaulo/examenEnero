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
        removeContiguousTuplas(tuplas);
        return generateTuplaArray(tuplas);
    }

    private static void removeContiguousTuplas(ArrayList<Tupla> tuplas) {
        for(int i = 0; i < tuplas.size()-1; i++) {
            if(tuplas.get(i).getCaracter() == tuplas.get(i+1).getCaracter()) {
                tuplas.get(i).setRepeticiones(tuplas.get(i).getRepeticiones()+1);
                tuplas.remove(i+1);
            }
        }
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
