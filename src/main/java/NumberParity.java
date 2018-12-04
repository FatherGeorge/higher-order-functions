import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

final class NumberParity {


    static List<String> evenOrOdd(List<Integer> numbersToCheck) {
        if(null == numbersToCheck) {
            throw new IllegalArgumentException("Number list cannot be null!");
        }

        /*if (numbersToCheck.get(0) == 0) {
            return Collections.singletonList("even");
        }

        return Collections.singletonList("odd");*/

        return numbersToCheck
                    .stream()
                    .map(number -> {
                            if(number%2==0) {
                                return "even";
                            }
                            return "odd";
                    })
                    .collect(Collectors.toList());
    }
}
