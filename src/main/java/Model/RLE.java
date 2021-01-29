package Model;

import java.util.ArrayList;

public class RLE {

    public static Tupla[] encode(String input) {
        if(input.isEmpty()) return new Tupla[]{};
        if(input.length() == 1) return encodeCharacter(input.charAt(0));
        return generateTuplas(input);
    }

    private static Tupla[] generateTuplas(String input) {
        ArrayList<Tupla> tuplas = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            tuplas.add(new Tupla(input.charAt(i),1));
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
