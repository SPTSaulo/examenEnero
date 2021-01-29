package Model;

import java.util.ArrayList;
import java.util.Arrays;

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
            if(tuplas.get(i).getCharacter() == tuplas.get(i+1).getCharacter()) {
                tuplas.get(i).setRepetitions(tuplas.get(i).getRepetitions()+1);
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

    public static String decode(Tupla [] tuplas) {
        if(tuplas.length == 0) return "";
        return generateDecodeString(tuplas);
    }

    private static String generateDecodeString(Tupla[] tuplas) {
        String decodeString = "";
        for (Tupla tupla: tuplas) {
            decodeString += tupla.getRepetitions() > 1 ? decodeMultiplesTimes(tupla.getRepetitions(), tupla.getCharacter()) : decodeCharacter(tupla.getCharacter());
        }
        return decodeString;
    }

    private static String decodeMultiplesTimes(int repetitions, char character) {
        String decodeString = "";
        for(int i = 0; i < repetitions; i++) {
            decodeString += character;
        }
        return decodeString;
    }

    public static String decodeCharacter(char c)  {
        return String.valueOf(c);
    }

}
