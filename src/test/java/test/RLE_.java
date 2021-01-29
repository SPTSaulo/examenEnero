package test;

import Model.RLE;
import Model.Tupla;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RLE_ {
    @Test
    public void encode_empty_string_should_return_empty_array() {
        assertThat(RLE.encode("")).isEqualTo(new Tupla[]{});
    }
    @Test
    public void encode_one_character_should_return_one_tupla() {
        Tupla[] tuplas = {new Tupla('a',1)};
        assertThat(Arrays.toString(RLE.encode("a"))).isEqualTo(Arrays.toString(tuplas));
    }
    @Test
    public void encode_string_with_different_characters_should_return_a_multiple_tuples_with_one_repeticion() {
        Tupla[] tuplas = {new Tupla('h',1), new Tupla('i',1)};
        assertThat(Arrays.toString(RLE.encode("hi"))).isEqualTo(Arrays.toString(tuplas));
    }

    @Test
    public void encode_string_with_repeating_characters_should_return_a_tupla_with_counter_diferent_than_one(){
        Tupla[] tuplas = {new Tupla('h', 1), new Tupla('e', 1), new Tupla('l', 2), new Tupla('o', 1), new Tupla(' ', 1), new Tupla('w', 1) , new Tupla('o', 1), new Tupla('r', 1), new Tupla('l', 1), new Tupla('d', 1), new Tupla('!', 1)};
        assertThat(Arrays.toString(RLE.encode("hello world!"))).isEqualTo(Arrays.toString(tuplas));
    }

    @Test
    public void decode_empty_array_should_return_empty_string() {
        Tupla [] tuplas = {};
        assertThat(RLE.decode(tuplas)).isEqualTo("");
    }

    @Test
    public void decode_one_tuple_with_one_repetition_should_return_string_with_one_character() {
        Tupla [] tuplas = {new Tupla('g', 1)};
        assertThat(RLE.decode(tuplas)).isEqualTo("g");
    }

    @Test
    public void decode_multiples_tuplas_with_one_repetition_shoult_return_string_with_different_characters() {
        Tupla [] tuplas = {new Tupla('p', 1), new Tupla('j', 1)};
        assertThat(RLE.decode(tuplas)).isEqualTo("pj");
    }
}
