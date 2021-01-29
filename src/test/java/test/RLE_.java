package test;

import Model.RLE;
import Model.Tupla;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RLE_ {
    @Test
    public void encode_empty_string_should_return_empty_array() {
        assertThat(RLE.encode("")).isEqualTo(new Tupla[]{});
    }
    @Test
    public void encode_one_character_should_return_one_tuple() {
        Tupla[] tuplas = {new Tupla('a',1)};
        assertThat(Arrays.toString(RLE.encode("a"))).isEqualTo(Arrays.toString(tuplas));
    }
}
