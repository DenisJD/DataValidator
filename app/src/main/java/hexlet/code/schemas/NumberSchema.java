package hexlet.code.schemas;

public final class NumberSchema extends BaseSchema {

    public NumberSchema positive() {
        addPredicate(x -> {
            if (x == null) {
                return true;
            } else if (x instanceof Integer) {
                return (int) x > 0;
            } else if (x instanceof Double) {
                return (double) x > 0;
            }
            return false;
        }
        );
        return this;
    }

    public NumberSchema range(Integer min, Integer max) {
        addPredicate(x -> (Integer) x >= min && (Integer) x <= max);
        return this;
    }

    public NumberSchema required() {
        addPredicate(x -> x instanceof Integer || x instanceof Double);
        return this;
    }
}
