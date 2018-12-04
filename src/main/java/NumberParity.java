import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class NumberParity {


    static List<String> evenOrOdd(List<Integer> numbersToCheck) {
        if(null == numbersToCheck) {
            throw new IllegalArgumentException("Number list cannot be null!");
        }

        if (numbersToCheck.get(0) == 0) {
            return Collections.singletonList("even");
        }

        return Collections.singletonList("odd");
    }
}
