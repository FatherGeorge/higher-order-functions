import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;


final class ExercisesTest {

    //Write a function, `join()`, which behaves like [`String.join()`]
    // (http://docs.oracle.com/javase/8/docs/api/java/lang/String.html#join-java.lang.CharSequence-java.lang.CharSequence...-)
    // (without using `String.join()`) and takes an Array of Strings
    // and an (optional) delimiter and returns them joined by the delimiter.
    // If no delimiter is provided, then a space should be used.

    @Test
    @Disabled
    void throwsNullPointerWhenDelimiterIsNull() {
        //Setup
        List<String> stringsToConcat = Arrays.asList("a","b");
        String delimiter = null;

        //Exercise

        //Assert
        assertThrows(NullPointerException.class , () -> Exercises.join(delimiter,stringsToConcat));

        //Teardown
    }

    @Test
    @Disabled
    void convertsNullToStringAndConcatenatesWithDelimiter() {
        //Setup
        List<String> stringsToConcat = Arrays.asList(null,null);
        String delimiter = "-";

        //Exercise
        String actual = Exercises.join(delimiter,stringsToConcat);

        //Assert
        assertThat(actual, is("null-null"));
        //Teardown
    }

    @Test
    @Disabled
    void returnsEmptyStringWhenListIsEmpty() {
        //Setup
        List<String> stringsToConcat = Collections.emptyList();
        String delimiter = "-";

        //Exercise
        String actual = Exercises.join(delimiter,stringsToConcat);

        //Assert
        assertThat("".equals(actual), is(true));

        //Teardown
    }

    @Test
    @Disabled
    void returnsStringWithoutDelimiterWhenListHasOneElement() {

        //Setup
        List<String> stringsToConcat = Collections.singletonList("radhika");
        String delimiter = "-";

        //Exercise
        String actual = Exercises.join(delimiter,stringsToConcat);

        //Assert
        assertThat("radhika".equals(actual), is(true));

        //Teardown
    }

    @Test
    @Disabled
    void returnsStringWithDelimiterWhenListHasMoreThanOneElement() {
        //Setup
        List<String> stringsToConcat = Arrays.asList("radhika","k","vikas","kk");
        String delimiter = "-";

        //Exercise
        String actual = Exercises.join(delimiter,stringsToConcat);

        //Assert
        assertThat("radhika-k-vikas-kk".equals(actual), is(true));

        //Teardown
    }

    //Write a function, `wordCounts()`, which takes a String parameter of a sentence
    // (you may consider a sentence to be groups of characters separated by space characters,
    // do not worry about punctuation). Using `java.util.stream.reduce()` have this function
    // return a `Map<String,Integer>` or `Map<String,Long>` whose properties are the words
    // and whose values are the count of occurrences of that word in the provided sentence.
    // Two words may be considered equivalent if they contain the same characters,
    // regardless of capitalization.

    @Test
    void throwsExceptionWhenInputStringIsNull() {
        Map<>
    }
}
