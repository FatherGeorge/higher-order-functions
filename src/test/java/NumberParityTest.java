import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class NumberParityTest {

    @Test
    void checkForNullListThrowsException() {
        //Setup

        //Exercise

        //Assert
        assertThrows(IllegalArgumentException.class, () -> NumberParity.evenOrOdd(null));

        //teardown
    }

    @Test
    @Disabled
    void checkForNullElementThrowsException() {
        //Setup

        //Exercise

        //Assert
        assertThrows(IllegalArgumentException.class, () -> NumberParity.evenOrOdd(Collections.singletonList(null)));

        //teardown
    }

    @Test
    @Disabled
    void checkForEmptyListThrowsException() {
        //Setup

        //Exercise

        //Assert
        assertThrows(IllegalArgumentException.class, () -> NumberParity.evenOrOdd(Collections.emptyList()));

        //teardown
    }

    @Test
    void returnsEvenForZero() {
        //Setup
        List<Integer> numbers = Collections.singletonList(0);

        //Exercise
        final List<String> actual = NumberParity.evenOrOdd(numbers);

        //Assert
        assertThat(actual, contains("even"));

        //teardown
    }

    @Test
    void returnsOffForOne() {
        //Setup
        List<Integer> numbers = Collections.singletonList(1);

        //Exercise
        final List<String> actual = NumberParity.evenOrOdd(numbers);

        //Assert
        assertThat(actual, contains("odd"));

        //teardown
    }





}