package hexlet.code.schemas;

import java.util.Map;

public final class MapSchema extends BaseSchema {

    public MapSchema required() {
        addPredicate(x -> x instanceof Map);
        return this;
    }

    public MapSchema sizeof(int size) {
        addPredicate(x -> ((Map<?, ?>) x).size() == size);
        return this;
    }

    public MapSchema shape(Map<String, BaseSchema> schemas) {
        addPredicate(x -> {
            for (Map.Entry<String, BaseSchema> firstSchema : schemas.entrySet()) {
                for (Map.Entry<String, Object> secondSchema : ((Map<String, Object>) x).entrySet()) {
                    if (firstSchema.getKey().equals(secondSchema.getKey())
                            && (!firstSchema.getValue().isValid(secondSchema.getValue()))) {
                        return false;
                    }
                }
            }
            return true;
        }
        );
        return this;
    }
}
