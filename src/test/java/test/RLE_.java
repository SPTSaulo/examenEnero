package test;

import Model.RLE;
import Model.Tupla;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RLE_ {
    @Test
    public void encode_empty_string_should_return_empty_array() {
        assertThat(RLE.encode("")).isEqualTo(new Tupla[]{});
    }
    @Test
    public void encode_one_character_should_return_one_tuple() {
        assertThat(RLE.encode("a")).isEqualTo(new Tupla[]{new Tupla('a',1)});
    }
}
