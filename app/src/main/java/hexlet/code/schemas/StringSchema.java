package hexlet.code.schemas;

public class StringSchema extends BaseSchema {

    public StringSchema contains(String value) {
        addPredicate(x -> x.toString().contains(value));
        return this;
    }

    public StringSchema minLength(int length) {
        addPredicate(x -> x.toString().length() >= length);
        return this;
    }

    public StringSchema required() {
        addPredicate(x -> x instanceof String && x.toString().length() > 0);
        return this;
    }
}
