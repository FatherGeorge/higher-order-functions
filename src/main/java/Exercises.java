import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

final class Exercises {

    public static void main (String... args){
        System.out.println(join(" kapur ", Arrays.asList("radhika")));

    }

    static String join(String delimiter, List<String> stringsToConcat) {

        if(null == delimiter || null == stringsToConcat)   {
            throw new NullPointerException();
        }

        return stringsToConcat
                .stream()
                .reduce(getJoinedString(delimiter))
                .orElse("");

    }

    private static BinaryOperator<String> getJoinedString(String delimiter) {
        return (accumulator, current) -> {
            if(accumulator == null) {
                accumulator = "null";
            }
            if(current == null) {
                current = "null";
            }
            return accumulator + delimiter + current;
        };
    }
}
