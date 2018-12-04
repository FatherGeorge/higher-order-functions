import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

final class ReverseStrings {

    static List<String> reverseString(final List<String> stringsToReverse) {

        if(null == stringsToReverse) {
            return Collections.emptyList();
        }

        return stringsToReverse
                .stream()
                .filter(Objects::nonNull)
                .map(stringToReverse -> new StringBuilder(stringToReverse).reverse().toString())
                .collect(Collectors.toList());
    }
}
