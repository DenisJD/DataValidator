package hexlet.code.schemas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class BaseSchema {
    private final List<Predicate> validations = new ArrayList<>(List.of(x -> true));

    public boolean isValid(Object obj) {
        for (Predicate predicate : validations) {
            if (!predicate.test(obj)) {
                return false;
            }
        }
        return true;
    }

    public void addPredicate(Predicate predicate) {
        validations.add(predicate);
    }

    abstract BaseSchema required();
}
