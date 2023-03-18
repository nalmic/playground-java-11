import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Java 11 adds a few new methods to the String class: isBlank
 * lines, strip, stripLeading, stripTrailing, and repeat.
 */
public class NewFileMethodsTest {

    @Test
    public void newStringMethodsTest_writeString_readString() throws IOException {
        Path filePath = Files.writeString(
                Paths.get("c://tmp//tmp.txt"),
                "Sample text");
        String fileContent = Files.readString(filePath);
        assertThat(fileContent).isEqualTo("Sample text");
    }
}
