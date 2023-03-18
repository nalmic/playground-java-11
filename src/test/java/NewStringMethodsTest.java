import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Java 11 adds a few new methods to the String class: isBlank
 * lines, strip, stripLeading, stripTrailing, and repeat.
 */
public class NewStringMethodsTest {

    @Test
    public void newStringMethodsTest_isBlank() {
        assertThat("          ".isBlank()).isTrue();
        assertThat("          ".isEmpty()).isFalse();
    }

    @Test
    public void newStringMethodsTest_lines() {
        assertThat(
                "Some simple\nbut long\ntext written by me".lines().collect(Collectors.toList())
        ).containsExactly("Some simple", "but long", "text written by me");
    }

    @Test
    public void newStringMethodsTest_strip() {
        assertThat("       ok       ".strip()).isEqualTo("ok");
    }

    @Test
    public void newStringMethodsTest_stripLeading() {
        assertThat("       ok       ".stripLeading()).isEqualTo("ok       ");
    }

    @Test
    public void newStringMethodsTest_stripTrailing() {
        assertThat("       ok       ".stripTrailing()).isEqualTo("       ok");
    }

    @Test
    public void newStringMethodsTest_repeat() {
        assertThat("ok".repeat(3)).isEqualTo("okokok");
    }
}
