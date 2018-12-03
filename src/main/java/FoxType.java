import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

final class FoxType {
    public static void main(String... args) {

        final List<String> foxTypes = Arrays.asList(
                "Red Fox",
                "Arctic Fox",
                "Fennec Fox",
                "Kit Fox",
                "Swift Fox"
        );
        System.out.println(slowFoxes(foxTypes));
    }


    static List<String> slowFoxes(List<String> foxTypesList) {
        final Predicate<String> foxToSearch = foxPredicate("Swift Fox");

        final List<String> foxesList = foxTypesList
                .stream()
                .filter(foxToSearch)
                .collect(Collectors.toList());

        return foxesList;
    }

    static Predicate<String> foxPredicate (final String foxSearchType) {
        return fox -> fox == null || !(fox.equals(foxSearchType));
    }
}
