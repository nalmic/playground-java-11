import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
 * <p>
 * This makes it easier to create an array of the right type from a collection:
 */
public class CollectionToArrayTest {

    @Test
    public void collectionToArrayTest() {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        assertThat(sampleArray).containsExactly("Java", "Kotlin");
    }
}
