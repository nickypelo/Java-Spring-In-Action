package sia.tacocloud.persistence;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nicodemus
 */
@Data
public class TacoOrder {
    //attributes
    private String deliverName;
    private String deliverStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }
}
