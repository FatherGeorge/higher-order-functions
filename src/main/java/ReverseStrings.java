import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

final class ReverseStrings {

    static List<String> reverseString(final List<String> stringsToReverse) {

        if(null == stringsToReverse) {
            return Collections.emptyList();
        }

        return stringsToReverse
                .stream()
                .filter(Objects::nonNull)
                .map(TO_REVERSE_STRING)
                .collect(Collectors.toList());
    }

    private static Function<String, String> TO_REVERSE_STRING =
            stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();

//    private static Function<String, String> toReverseString() {
//        return stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();
//    }
}
