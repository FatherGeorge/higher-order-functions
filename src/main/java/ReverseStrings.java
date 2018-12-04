import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class ReverseStrings {

    public static void main (String... args) {
        //System.out.println(sum(1,2,3,4));
        System.out.println(multiply(1,1));
        System.out.println(String.join("-",Collections.emptyList()));

    }

    private static long multiply(int startInclusive, int endInclusive) {
        return IntStream.rangeClosed(startInclusive,endInclusive)
                .reduce((accumulator, current) -> {
                    System.out.println(accumulator);
                    System.out.println(current);
                    return accumulator * current;
                })
                .orElse(0);
    }

    private static long sum(int... numbersToSum) {
        return Arrays.stream(numbersToSum)
                .reduce((left, right) -> left + right)
                .orElse(0);
    }

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
    //Can also be done this way
//    private static Function<String, String> toReverseString() {
//        return stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();
//    }
}
