import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

final class FoxTypeTest {

    @Test
    void foxesListHasOneNullElementReturnsFalse () {
        // Setup
        final List<String> foxes = Collections.singletonList(null);

        //Exercise
        final List<String> actual = FoxType.slowFoxes(foxes);

        //Assert
        assertThat(actual.isEmpty(), is(false));

        //teardown
    }

    @Test
    @Disabled
    void foxesListHasOneElementReturnsFalse () {
        // Setup
        final List<String> foxes = Collections.singletonList("");

        //Exercise
        final List<String> actual = FoxType.slowFoxes(foxes);

        //Assert
        assertThat(actual.isEmpty(), is(false));

        //teardown
    }

    @Test
    void foxesListHasChecksForArcticFoxReturnsTrue () {
        // Setup
        final List<String> foxes = Collections.singletonList("Arctic Fox");

        //Exercise
        final List<String> actual = FoxType.slowFoxes(foxes);

        //Assert
        assertThat(actual, contains("Arctic Fox"));

        //teardown
    }
}
