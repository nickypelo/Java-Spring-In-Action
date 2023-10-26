package sia.tacocloud.persistence;

import lombok.Data;

/**
 * @author nicodemus
 */
@Data
public class Ingredient {
    //attributes
    private final String id;
    private final String name;
    private final Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
