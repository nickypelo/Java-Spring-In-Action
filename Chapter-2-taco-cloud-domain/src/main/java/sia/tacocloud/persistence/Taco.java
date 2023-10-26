package sia.tacocloud.persistence;

import lombok.Data;

import java.util.List;

/**
 * @author nicodemus
 */
@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
