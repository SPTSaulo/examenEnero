package test;

import Model.RLE;
import org.assertj.core.groups.Tuple;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RLE_ {
    @Test
    public void enconde_empty_string_should_return_empty_array() {
        assertThat(RLE.encode("")).isEqualTo(new Tuple[]{});
    }
}
