import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

final class ReverseStringsTest {

    @Test
    void reverseStringsReturnsEmptyListWhenGivenNull () {
        //Setup

        //Exercise
        final List<String> actual = ReverseStrings.reverseString(null);

        //Assert
        assertThat(actual.isEmpty(), is(true));

        //Teardown

    }


    @Test
    void reverseStringReturnsEmptyWhenGivenEmptyList()  {
        //Setup

        //Exercise
        final List<String> actual = ReverseStrings.reverseString(Collections.emptyList());

        //Assert
        assertThat(actual.isEmpty(), is(true));

        //Teardown
    }

    @Test
    void reverseStringReturnsListWithOneReversedValue() {
        //Setup

        //Exercise
        final List<String> actual = ReverseStrings.reverseString(Collections.singletonList("foo"));

        //Assert
        assertThat(actual, contains("oof"));

        //Teardown
    }
}
